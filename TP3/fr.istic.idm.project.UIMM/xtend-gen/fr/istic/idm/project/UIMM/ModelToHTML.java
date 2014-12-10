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
public class ModelToHTML {
  public CharSequence convert(final List<Poll> polls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    {
      for(final Poll p : polls) {
        {
          String _name = p.getName();
          boolean _notEquals = (!Objects.equal(_name, null));
          if (_notEquals) {
            _builder.append("\t\t");
            _builder.append("<h1>");
            String _name_1 = p.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append("</h1>");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Question> _questions = p.getQuestions();
          for(final Question q : _questions) {
            _builder.append("\t\t");
            _builder.append("<form action=\"#\" method=\"GET\">");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<label>");
            String _content = q.getContent();
            _builder.append(_content, "\t\t\t");
            _builder.append("</label><br>");
            _builder.newLineIfNotEmpty();
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
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("<select>");
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
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("<input type=\"checkbox\" name=\"");
                    String _id = o.getId();
                    _builder.append(_id, "\t\t\t");
                    _builder.append("\" value=\"");
                    String _content_1 = o.getContent();
                    _builder.append(_content_1, "\t\t\t");
                    _builder.append("\"> ");
                    String _content_2 = o.getContent();
                    _builder.append(_content_2, "\t\t\t");
                    _builder.append("<br>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Type _type_1 = o.getType();
                  int _value_1 = _type_1.getValue();
                  boolean _equals_1 = (_value_1 == 1);
                  if (_equals_1) {
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("<input type=\"radio\" name=\"");
                    String _id_1 = o.getId();
                    _builder.append(_id_1, "\t\t\t");
                    _builder.append("\" value=\"");
                    String _content_3 = o.getContent();
                    _builder.append(_content_3, "\t\t\t");
                    _builder.append("\"> ");
                    String _content_4 = o.getContent();
                    _builder.append(_content_4, "\t\t\t");
                    _builder.append("<br>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Type _type_2 = o.getType();
                  int _value_2 = _type_2.getValue();
                  boolean _equals_2 = (_value_2 == 2);
                  if (_equals_2) {
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("<option value=\"");
                    String _content_5 = o.getContent();
                    _builder.append(_content_5, "\t\t\t");
                    _builder.append("\">");
                    String _content_6 = o.getContent();
                    _builder.append(_content_6, "\t\t\t");
                    _builder.append("</option>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Type _type_3 = o.getType();
                  int _value_3 = _type_3.getValue();
                  boolean _equals_3 = (_value_3 == 3);
                  if (_equals_3) {
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _content_7 = o.getContent();
                    _builder.append(_content_7, "\t\t\t");
                    _builder.append(": <input type=\"text\" name=\"");
                    String _content_8 = o.getContent();
                    _builder.append(_content_8, "\t\t\t");
                    _builder.append("\"><br>");
                    _builder.newLineIfNotEmpty();
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
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("</select>");
                _builder.newLine();
              }
            }
            _builder.append("\t\t");
            _builder.append("</form>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public static void main(final String[] args) {
    try {
      ModelToHTML modelToHTML = new ModelToHTML();
      PollSystem model = modelToHTML.load("q1.xmi");
      EList<Poll> _polls = model.getPolls();
      CharSequence html = modelToHTML.convert(_polls);
      final FileWriter fw = new FileWriter("q1.html");
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
