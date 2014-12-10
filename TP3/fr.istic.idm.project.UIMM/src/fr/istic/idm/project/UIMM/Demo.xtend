package fr.istic.idm.project.UIMM

import org.junit.Test
import UIMM.UIMMFactory
import org.eclipse.emf.common.util.URI
// import java.io.FileWriter

import static org.junit.Assert.*

class Demo {
	
	def correctHTML() '''
		<html>
			<body>
				<form action="#" method="GET">
					<label>Agree?</label><br>
					<input type="radio" name="RadioButton" value="Oui"> Oui<br>
					<input type="radio" name="RadioButton" value="Non"> Non<br>
					Pourquoi: <input type="text" name="Pourquoi"><br>
				</form>
				<form action="#" method="GET">
					<label>What is p2?</label><br>
					<select>
					<option value="Reponse A">Reponse A</option>
					<option value="Reponse B">Reponse B</option>
					<option value="Reponse C">Reponse C</option>
					</select>
				</form>
			</body>
		</html>
	'''
	
	@Test
	def mergeAndConvertToHtml() {
		var mm = new ModelToModel();
		
		/* Load */
		var modelGlobal = UIMMFactory.eINSTANCE.createPollSystem;
		
		var modelUI = mm.loadUI(URI.createURI("q1.uidsl"));
		assertNotNull(modelUI);
		assertEquals(1, modelUI.polls.size);
		assertEquals(2, modelUI.polls.get(0).questions.size);
		
		var modelPivot = mm.loadPoll(URI.createURI("q1.polldsl"));
		assertNotNull(modelPivot);
		assertEquals(1, modelPivot.polls.size);
		assertEquals(2, modelPivot.polls.get(0).questions.size);
		
		/* Merge */
		mm.mergeModel(modelGlobal, modelUI, modelPivot);
		assertEquals(1, modelGlobal.polls.size);
		assertEquals(2, modelGlobal.polls.get(0).questions.size);
		
		/* Convert */
		var modelToHTML = new ModelToHTML();		
		var html = modelToHTML.convert(modelGlobal.polls);
		assertEquals(html.toString, correctHTML().toString);
		
		/* Save content as html file */
//		val fw = new FileWriter("q1.html");
//		fw.write(html.toString);
//		fw.close;
	}
}