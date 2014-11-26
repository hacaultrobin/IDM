package fr.istic.idm.project.UIMM

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import fr.istic.idm.project.UIDslStandaloneSetupGenerated
import fr.istic.idm.project.PollDslStandaloneSetupGenerated
import UIMM.UIMMFactory
import UIMM.PollSystem
import java.util.HashMap
import UIMM.UIMMPackage

class ModelToModel {
	
	def loadUI(URI uri) {
		new UIDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as fr.istic.idm.project.uIDsl.PollSystem;
	}
	
	def loadPoll(URI uri) {
		new PollDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as fr.istic.idm.project.pollDsl.PollSystem;
	}
	
	def save(URI uri, PollSystem pollS) {
		val resourceSet = new ResourceSetImpl;
		resourceSet.getPackageRegistry().put(UIMMPackage.eNS_URI, UIMMPackage.eINSTANCE);
		var res = resourceSet.createResource(uri); 
		res.getContents.add(pollS);
		res.save(new HashMap());
	}
	
	
	def mergeModel(UIMM.PollSystem modelGlobal, fr.istic.idm.project.uIDsl.PollSystem modelUI, fr.istic.idm.project.pollDsl.PollSystem modelPivot) {
		var pollsUI = modelUI.polls;
		var pollsPivot = modelPivot.polls;
		
		if (pollsUI.size == pollsPivot.size) {
			for (var i = 0; i < pollsUI.size; i++) {
				var pollGlobal = UIMMFactory.eINSTANCE.createPoll;
				mergePoll(pollGlobal, pollsUI.get(i), pollsPivot.get(i));
				modelGlobal.polls.add(pollGlobal);
			}
		} else {
			println("Erreur")
		}
	}
	
	def mergePoll(UIMM.Poll pollGlobal, fr.istic.idm.project.uIDsl.Poll poolUI, fr.istic.idm.project.pollDsl.Poll pollPivot) {
		pollGlobal.name = pollPivot.name;
			
		var questionsUI = poolUI.questions;
		var questionsPivot = pollPivot.questions;
		
		if (questionsUI.size == questionsPivot.size) {
			for (var i = 0; i < questionsUI.size; i++) {
				var questionGlobal = UIMMFactory.eINSTANCE.createQuestion;
				mergeQuestion(questionGlobal, questionsUI.get(i), questionsPivot.get(i));
				pollGlobal.questions.add(questionGlobal);
			}
		} else {
			println("Erreur")
		}
	}
	
	def mergeQuestion(UIMM.Question questionGlobal, fr.istic.idm.project.uIDsl.Question questionUI, fr.istic.idm.project.pollDsl.Question questionPivot) {
		questionGlobal.id = questionPivot.id;
		questionGlobal.content = questionPivot.content;
		
		var optionsUI = questionUI.options;
		var optionsPivot = questionPivot.options;
		
		if (optionsUI.size == optionsPivot.size) {
			for (var i = 0; i < optionsUI.size; i++) {
				var optionGlobal = UIMMFactory.eINSTANCE.createOption;
				mergeOption(optionGlobal, optionsUI.get(i), optionsPivot.get(i));
				questionGlobal.options.add(optionGlobal);
			}
		} else {
			println("Erreur")
		}
	}
	
	def mergeOption(UIMM.Option optionGlobal, fr.istic.idm.project.uIDsl.Option optionUI, fr.istic.idm.project.pollDsl.Option optionPivot) {
		optionGlobal.type = UIMM.Type.get(optionUI.type.value);
		optionGlobal.id = optionUI.id;
		optionGlobal.content = optionPivot.content;
	}
	
	def static void main(String[] args) {
		var mm = new ModelToModel();
		
		var modelGlobal = UIMMFactory.eINSTANCE.createPollSystem;
		var modelUI = mm.loadUI(URI.createURI("q1.uidsl"));
		var modelPivot = mm.loadPoll(URI.createURI("q1.polldsl"));
		
		mm.mergeModel(modelGlobal, modelUI, modelPivot);
		
		mm.save(URI.createURI("q1.xmi"), modelGlobal);
		println("done");
	}
}