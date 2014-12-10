package fr.istic.idm.project.UIMM;

import UIMM.PollSystem;
import UIMM.UIMMFactory;
import fr.istic.idm.project.UIMM.ModelToHTML;
import fr.istic.idm.project.UIMM.ModelToModel;
import fr.istic.idm.project.uIDsl.Poll;
import fr.istic.idm.project.uIDsl.Question;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Demo {
  public CharSequence correctHTML() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<form action=\"#\" method=\"GET\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<label>Agree?</label><br>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<input type=\"radio\" name=\"RadioButton\" value=\"Oui\"> Oui<br>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<input type=\"radio\" name=\"RadioButton\" value=\"Non\"> Non<br>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Pourquoi: <input type=\"text\" name=\"Pourquoi\"><br>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<form action=\"#\" method=\"GET\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<label>What is p2?</label><br>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<select>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<option value=\"Reponse A\">Reponse A</option>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<option value=\"Reponse B\">Reponse B</option>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<option value=\"Reponse C\">Reponse C</option>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  @Test
  public void mergeAndConvertToHtml() {
    ModelToModel mm = new ModelToModel();
    PollSystem modelGlobal = UIMMFactory.eINSTANCE.createPollSystem();
    URI _createURI = URI.createURI("q1.uidsl");
    fr.istic.idm.project.uIDsl.PollSystem modelUI = mm.loadUI(_createURI);
    Assert.assertNotNull(modelUI);
    EList<Poll> _polls = modelUI.getPolls();
    int _size = _polls.size();
    Assert.assertEquals(1, _size);
    EList<Poll> _polls_1 = modelUI.getPolls();
    Poll _get = _polls_1.get(0);
    EList<Question> _questions = _get.getQuestions();
    int _size_1 = _questions.size();
    Assert.assertEquals(2, _size_1);
    URI _createURI_1 = URI.createURI("q1.polldsl");
    fr.istic.idm.project.pollDsl.PollSystem modelPivot = mm.loadPoll(_createURI_1);
    Assert.assertNotNull(modelPivot);
    EList<fr.istic.idm.project.pollDsl.Poll> _polls_2 = modelPivot.getPolls();
    int _size_2 = _polls_2.size();
    Assert.assertEquals(1, _size_2);
    EList<fr.istic.idm.project.pollDsl.Poll> _polls_3 = modelPivot.getPolls();
    fr.istic.idm.project.pollDsl.Poll _get_1 = _polls_3.get(0);
    EList<fr.istic.idm.project.pollDsl.Question> _questions_1 = _get_1.getQuestions();
    int _size_3 = _questions_1.size();
    Assert.assertEquals(2, _size_3);
    mm.mergeModel(modelGlobal, modelUI, modelPivot);
    EList<UIMM.Poll> _polls_4 = modelGlobal.getPolls();
    int _size_4 = _polls_4.size();
    Assert.assertEquals(1, _size_4);
    EList<UIMM.Poll> _polls_5 = modelGlobal.getPolls();
    UIMM.Poll _get_2 = _polls_5.get(0);
    EList<UIMM.Question> _questions_2 = _get_2.getQuestions();
    int _size_5 = _questions_2.size();
    Assert.assertEquals(2, _size_5);
    ModelToHTML modelToHTML = new ModelToHTML();
    EList<UIMM.Poll> _polls_6 = modelGlobal.getPolls();
    CharSequence html = modelToHTML.convert(_polls_6);
    String _string = html.toString();
    CharSequence _correctHTML = this.correctHTML();
    String _string_1 = _correctHTML.toString();
    Assert.assertEquals(_string, _string_1);
  }
}
