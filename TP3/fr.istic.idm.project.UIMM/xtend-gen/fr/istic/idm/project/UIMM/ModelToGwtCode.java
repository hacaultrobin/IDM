package fr.istic.idm.project.UIMM;

import UIMM.Option;
import UIMM.Poll;
import UIMM.PollSystem;
import UIMM.Question;
import UIMM.Type;
import UIMM.UIMMPackage;
import com.google.common.base.Objects;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelToGwtCode {
  public CharSequence convert(final List<Poll> polls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("VerticalPanel panel = new VerticalPanel();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Liste des éléments GWT pour le questionnaire");
    _builder.newLine();
    _builder.append("Label poll;");
    _builder.newLine();
    _builder.append("Label question;");
    _builder.newLine();
    _builder.append("Label rep;");
    _builder.newLine();
    _builder.append("CheckBox cb;");
    _builder.newLine();
    _builder.append("RadioButton rb;");
    _builder.newLine();
    _builder.append("ListBox dropBox;");
    _builder.newLine();
    _builder.append("TextBox tb;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Init poll");
    _builder.newLine();
    {
      for(final Poll p : polls) {
        {
          String _name = p.getName();
          boolean _notEquals = (!Objects.equal(_name, null));
          if (_notEquals) {
            _builder.append("poll = new Label(\"");
            String _name_1 = p.getName();
            _builder.append(_name_1, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("panel.add(poll);");
            _builder.newLine();
          }
        }
        {
          EList<Question> _questions = p.getQuestions();
          for(final Question q : _questions) {
            _builder.append("question = new Label(\"");
            String _content = q.getContent();
            _builder.append(_content, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("panel.add(question);");
            _builder.newLine();
            {
              EList<Option> _options = q.getOptions();
              final Function1<Option, Boolean> _function = new Function1<Option, Boolean>() {
                public Boolean apply(final Option o) {
                  Type _type = o.getType();
                  int _value = _type.getValue();
                  return Boolean.valueOf((_value == 2));
                }
              };
              boolean _exists = IterableExtensions.<Option>exists(_options, _function);
              if (_exists) {
                _builder.append("dropBox = new ListBox(false);");
                _builder.newLine();
              }
            }
            {
              EList<Option> _options_1 = q.getOptions();
              for(final Option o : _options_1) {
                {
                  Type _type = o.getType();
                  int _value = _type.getValue();
                  boolean _equals = (_value == 0);
                  if (_equals) {
                    _builder.append("cb = new CheckBox(\"");
                    String _content_1 = o.getContent();
                    _builder.append(_content_1, "");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("panel.add(cb);");
                    _builder.newLine();
                  }
                }
                {
                  Type _type_1 = o.getType();
                  int _value_1 = _type_1.getValue();
                  boolean _equals_1 = (_value_1 == 1);
                  if (_equals_1) {
                    _builder.append("rb = new RadioButton(\"");
                    String _id = o.getId();
                    _builder.append(_id, "");
                    _builder.append("\", \"");
                    String _content_2 = o.getContent();
                    _builder.append(_content_2, "");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("panel.add(rb);");
                    _builder.newLine();
                  }
                }
                {
                  Type _type_2 = o.getType();
                  int _value_2 = _type_2.getValue();
                  boolean _equals_2 = (_value_2 == 2);
                  if (_equals_2) {
                    _builder.append("dropBox.addItem(\"");
                    String _content_3 = o.getContent();
                    _builder.append(_content_3, "");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Type _type_3 = o.getType();
                  int _value_3 = _type_3.getValue();
                  boolean _equals_3 = (_value_3 == 3);
                  if (_equals_3) {
                    _builder.append("rep = new Label(\"");
                    String _content_4 = o.getContent();
                    _builder.append(_content_4, "");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("tb = new TextBox();");
                    _builder.newLine();
                    _builder.append("panel.add(rep);");
                    _builder.newLine();
                    _builder.append("panel.add(tb);");
                    _builder.newLine();
                  }
                }
              }
            }
            {
              EList<Option> _options_2 = q.getOptions();
              final Function1<Option, Boolean> _function_1 = new Function1<Option, Boolean>() {
                public Boolean apply(final Option o) {
                  Type _type = o.getType();
                  int _value = _type.getValue();
                  return Boolean.valueOf((_value == 2));
                }
              };
              boolean _exists_1 = IterableExtensions.<Option>exists(_options_2, _function_1);
              if (_exists_1) {
                _builder.append("panel.add(dropBox);");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("RootPanel.get().add(panel);");
    _builder.newLine();
    return _builder;
  }
  
  public static void main(final String[] args) {
    try {
      ModelToGwtCode modelToGWT = new ModelToGwtCode();
      PollSystem model = modelToGWT.load("q1.xmi");
      EList<Poll> _polls = model.getPolls();
      CharSequence html = modelToGWT.convert(_polls);
      final FileWriter fw = new FileWriter("q1.java");
      String _string = html.toString();
      fw.write(_string);
      fw.close();
      InputOutput.<String>println("done");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public PollSystem load(final String file) {
    PollSystem _xblockexpression = null;
    {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
      _packageRegistry.put(UIMMPackage.eNS_URI, UIMMPackage.eINSTANCE);
      URI _createURI = URI.createURI(file);
      final Resource res = resourceSet.getResource(_createURI, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((PollSystem) _get);
    }
    return _xblockexpression;
  }
}
