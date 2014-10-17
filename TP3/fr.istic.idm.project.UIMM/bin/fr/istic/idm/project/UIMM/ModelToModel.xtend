package fr.istic.idm.project.UIMM

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import fr.istic.idm.project.UIDslStandaloneSetupGenerated
import fr.istic.idm.project.PollDslStandaloneSetupGenerated

class ModelToModel {
	
	def loadUI(URI uri) {
		new UIDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as fr.istic.idm.project.uIDsl.PollSystem
	}
	
	def loadPoll(URI uri) {
		new PollDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as fr.istic.idm.project.pollDsl.PollSystem
	}
	
	def static void main(String[] args) {
		
	}
}