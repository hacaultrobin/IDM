package org.json;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.json.JsonStandaloneSetupGenerated;
import org.json.json.JsonPollSystem;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class JsonToModel {
  public JsonPollSystem loadModel(final URI uri) {
    JsonPollSystem _xblockexpression = null;
    {
      JsonStandaloneSetupGenerated _jsonStandaloneSetupGenerated = new JsonStandaloneSetupGenerated();
      _jsonStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((JsonPollSystem) _get);
    }
    return _xblockexpression;
  }
  
  @Test
  public void test() {
    URI _createURI = URI.createURI("q1.json");
    JsonPollSystem qjs = this.loadModel(_createURI);
    Assert.assertNotNull(qjs);
  }
}
