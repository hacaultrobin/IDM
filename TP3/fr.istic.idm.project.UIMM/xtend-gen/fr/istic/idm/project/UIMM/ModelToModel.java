package fr.istic.idm.project.UIMM;

import fr.istic.idm.project.PollDslStandaloneSetupGenerated;
import fr.istic.idm.project.UIDslStandaloneSetupGenerated;
import fr.istic.idm.project.uIDsl.PollSystem;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class ModelToModel {
  public PollSystem loadUI(final URI uri) {
    PollSystem _xblockexpression = null;
    {
      UIDslStandaloneSetupGenerated _uIDslStandaloneSetupGenerated = new UIDslStandaloneSetupGenerated();
      _uIDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((PollSystem) _get);
    }
    return _xblockexpression;
  }
  
  public fr.istic.idm.project.pollDsl.PollSystem loadPoll(final URI uri) {
    fr.istic.idm.project.pollDsl.PollSystem _xblockexpression = null;
    {
      PollDslStandaloneSetupGenerated _pollDslStandaloneSetupGenerated = new PollDslStandaloneSetupGenerated();
      _pollDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((fr.istic.idm.project.pollDsl.PollSystem) _get);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
  }
}
