package fr.istic.idm.project.UIMM

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.List
import UIMM.Poll
import UIMM.UIMMPackage
import java.io.FileWriter

class ModelToHTML {
	
	def convert(List<Poll> polls) '''
		<html>
			<body>
				«FOR p : polls»
					«IF p.name != null»
						<h1>«p.name»</h1>
					«ENDIF»
					«FOR q : p.questions»
						<form action="#" method="GET">
							<label>«q.content»</label><br>
							«IF q.options.exists[o | o.type.value == 2]»
								<select>
							«ENDIF»
							«FOR o : q.options»
								«IF o.type.value == 0»
									<input type="checkbox" name="«o.id»" value="«o.content»"> «o.content»<br>
								«ENDIF»
								«IF o.type.value == 1»
									<input type="radio" name="«o.id»" value="«o.content»"> «o.content»<br>
								«ENDIF»
								«IF o.type.value == 2»
									<option value="«o.content»">«o.content»</option>
								«ENDIF»
								«IF o.type.value == 3»
									«o.content»: <input type="text" name="«o.content»"><br>
								«ENDIF»
							«ENDFOR»
							«IF q.options.exists[o | o.type.value == 2]»
								</select>
							«ENDIF»
						</form>
					«ENDFOR»
				«ENDFOR»
			</body>
		</html>
	'''
	
	def static void main(String[] args) {		
		var modelToHTML = new ModelToHTML();
		var model = modelToHTML.load("q1.xmi");
		
		var html = modelToHTML.convert(model.polls);
		
		val fw = new FileWriter("q1.html");
		fw.write(html.toString);
		fw.close;
		
		println("done");
	}
	
	def load(String file) {
		// Create a resource set to hold the resources.
		val resourceSet = new ResourceSetImpl;
		
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
			 
		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(UIMMPackage.eNS_URI, UIMMPackage.eINSTANCE);
        
		// Demand load resource for this file.
		val res = resourceSet.getResource(URI.createURI(file), true);
		
		res.contents.get(0) as UIMM.PollSystem;
	}
}