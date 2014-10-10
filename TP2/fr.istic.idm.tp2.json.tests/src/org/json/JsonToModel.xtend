package org.json

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.json.json.JsonPollSystem
import org.junit.Test
import static org.junit.Assert.*

class JsonToModel {
	
	def loadModel(URI uri) {
		new JsonStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		//res.errors
		res.contents.get(0) as JsonPollSystem
	}
	
	@Test
	def test() {
		var qjs = loadModel(URI.createURI("q1.json"))
		assertNotNull(qjs)
	}
}