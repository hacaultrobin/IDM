package fr.istic.idm.project.UIMM

import java.util.List
import UIMM.Poll
import java.io.FileWriter
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import UIMM.UIMMPackage
import org.eclipse.emf.common.util.URI

class ModelToGwtCode {

	def convert(List<Poll> polls) '''
		VerticalPanel panel = new VerticalPanel();
		
		//Liste des éléments GWT pour le questionnaire
		Label poll;
		Label question;
		Label rep;
		CheckBox cb;
		RadioButton rb;
		ListBox dropBox;
		TextBox tb;
		
		//Init poll
		«FOR p : polls»
			«IF p.name != null»
				poll = new Label("«p.name»");
				panel.add(poll);
			«ENDIF»
			«FOR q : p.questions»
				question = new Label("«q.content»");
				panel.add(question);
				«IF q.options.exists[o | o.type.value == 2]»
					dropBox = new ListBox(false);
				«ENDIF»
				«FOR o : q.options»
					«IF o.type.value == 0»
						cb = new CheckBox("«o.content»");
						panel.add(cb);
					«ENDIF»
					«IF o.type.value == 1»
						rb = new RadioButton("«o.id»", "«o.content»");
						panel.add(rb);
					«ENDIF»
					«IF o.type.value == 2»
						dropBox.addItem("«o.content»");
					«ENDIF»
					«IF o.type.value == 3»
						rep = new Label("«o.content»");
						tb = new TextBox();
						panel.add(rep);
						panel.add(tb);
					«ENDIF»
				«ENDFOR»
				«IF q.options.exists[o | o.type.value == 2]»
					panel.add(dropBox);
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		
		RootPanel.get().add(panel);
	'''
	
	def static void main(String[] args) {		
		var modelToGWT = new ModelToGwtCode();
		var model = modelToGWT.load("q1.xmi");
		
		var html = modelToGWT.convert(model.polls);
		
		val fw = new FileWriter("q1.java")
		fw.write(html.toString)
		fw.close
		
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