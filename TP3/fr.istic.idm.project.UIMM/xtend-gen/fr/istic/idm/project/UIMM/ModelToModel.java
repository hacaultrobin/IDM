package fr.istic.idm.project.UIMM;

import UIMM.UIMMFactory;
import fr.istic.idm.project.PollDslStandaloneSetupGenerated;
import fr.istic.idm.project.UIDslStandaloneSetupGenerated;
import fr.istic.idm.project.uIDsl.Option;
import fr.istic.idm.project.uIDsl.Poll;
import fr.istic.idm.project.uIDsl.PollSystem;
import fr.istic.idm.project.uIDsl.Question;
import fr.istic.idm.project.uIDsl.Type;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  public void save(final URI uri, final UIMM.PollSystem pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = res.getContents();
      _contents.add(pollS);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      res.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String mergeModel(final UIMM.PollSystem modelGlobal, final PollSystem modelUI, final fr.istic.idm.project.pollDsl.PollSystem modelPivot) {
    String _xblockexpression = null;
    {
      EList<Poll> pollsUI = modelUI.getPolls();
      EList<fr.istic.idm.project.pollDsl.Poll> pollsPivot = modelPivot.getPolls();
      String _xifexpression = null;
      int _size = pollsUI.size();
      int _size_1 = pollsPivot.size();
      boolean _equals = (_size == _size_1);
      if (_equals) {
        for (int i = 0; (i < pollsUI.size()); i++) {
          {
            UIMM.Poll pollGlobal = UIMMFactory.eINSTANCE.createPoll();
            Poll _get = pollsUI.get(i);
            fr.istic.idm.project.pollDsl.Poll _get_1 = pollsPivot.get(i);
            this.mergePoll(pollGlobal, _get, _get_1);
            EList<UIMM.Poll> _polls = modelGlobal.getPolls();
            _polls.add(pollGlobal);
          }
        }
      } else {
        _xifexpression = InputOutput.<String>println("Erreur");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String mergePoll(final UIMM.Poll pollGlobal, final Poll poolUI, final fr.istic.idm.project.pollDsl.Poll pollPivot) {
    String _xblockexpression = null;
    {
      String _name = pollPivot.getName();
      pollGlobal.setName(_name);
      EList<Question> questionsUI = poolUI.getQuestions();
      EList<fr.istic.idm.project.pollDsl.Question> questionsPivot = pollPivot.getQuestions();
      String _xifexpression = null;
      int _size = questionsUI.size();
      int _size_1 = questionsPivot.size();
      boolean _equals = (_size == _size_1);
      if (_equals) {
        for (int i = 0; (i < questionsUI.size()); i++) {
          {
            UIMM.Question questionGlobal = UIMMFactory.eINSTANCE.createQuestion();
            Question _get = questionsUI.get(i);
            fr.istic.idm.project.pollDsl.Question _get_1 = questionsPivot.get(i);
            this.mergeQuestion(questionGlobal, _get, _get_1);
            EList<UIMM.Question> _questions = pollGlobal.getQuestions();
            _questions.add(questionGlobal);
          }
        }
      } else {
        _xifexpression = InputOutput.<String>println("Erreur");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String mergeQuestion(final UIMM.Question questionGlobal, final Question questionUI, final fr.istic.idm.project.pollDsl.Question questionPivot) {
    String _xblockexpression = null;
    {
      String _id = questionPivot.getId();
      questionGlobal.setId(_id);
      String _content = questionPivot.getContent();
      questionGlobal.setContent(_content);
      EList<Option> optionsUI = questionUI.getOptions();
      EList<fr.istic.idm.project.pollDsl.Option> optionsPivot = questionPivot.getOptions();
      String _xifexpression = null;
      int _size = optionsUI.size();
      int _size_1 = optionsPivot.size();
      boolean _equals = (_size == _size_1);
      if (_equals) {
        for (int i = 0; (i < optionsUI.size()); i++) {
          {
            UIMM.Option optionGlobal = UIMMFactory.eINSTANCE.createOption();
            Option _get = optionsUI.get(i);
            fr.istic.idm.project.pollDsl.Option _get_1 = optionsPivot.get(i);
            this.mergeOption(optionGlobal, _get, _get_1);
            EList<UIMM.Option> _options = questionGlobal.getOptions();
            _options.add(optionGlobal);
          }
        }
      } else {
        _xifexpression = InputOutput.<String>println("Erreur");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void mergeOption(final UIMM.Option optionGlobal, final Option optionUI, final fr.istic.idm.project.pollDsl.Option optionPivot) {
    Type _type = optionUI.getType();
    int _value = _type.getValue();
    UIMM.Type _get = UIMM.Type.get(_value);
    optionGlobal.setType(_get);
    String _id = optionPivot.getId();
    optionGlobal.setId(_id);
    String _content = optionPivot.getContent();
    optionGlobal.setContent(_content);
  }
  
  public static void main(final String[] args) {
    ModelToModel mm = new ModelToModel();
    UIMM.PollSystem modelGlobal = UIMMFactory.eINSTANCE.createPollSystem();
    URI _createURI = URI.createURI("q1.uidsl");
    PollSystem modelUI = mm.loadUI(_createURI);
    URI _createURI_1 = URI.createURI("q1.polldsl");
    fr.istic.idm.project.pollDsl.PollSystem modelPivot = mm.loadPoll(_createURI_1);
    mm.mergeModel(modelGlobal, modelUI, modelPivot);
    URI _createURI_2 = URI.createURI("q1.xmi");
    mm.save(_createURI_2, modelGlobal);
    InputOutput.<String>println("done");
  }
}
