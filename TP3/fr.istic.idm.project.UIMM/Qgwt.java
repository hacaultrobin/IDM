		import com.google.gwt.core.client.EntryPoint;
		import com.google.gwt.user.client.ui.CheckBox;
		import com.google.gwt.user.client.ui.Label;
		import com.google.gwt.user.client.ui.ListBox;
		import com.google.gwt.user.client.ui.RadioButton;
		import com.google.gwt.user.client.ui.RootPanel;
		import com.google.gwt.user.client.ui.TextBox;
		import com.google.gwt.user.client.ui.VerticalPanel;

		public class Qgwt implements EntryPoint {
			public void onModuleLoad() {
				VerticalPanel panel = new VerticalPanel();
				
				//Liste des éléments GWT pour le questionnaire
				Label poll;
				Label question;
				Label rep;
				CheckBox cb;
				RadioButton rb;
				ListBox dropBox;
				TextBox tb;
				
				//Init poll
				poll = new Label("");
				panel.add(poll);
				question = new Label("Agree?");
				panel.add(question);
				rb = new RadioButton("RadioButton", "Oui");
				panel.add(rb);
				rb = new RadioButton("RadioButton", "Non");
				panel.add(rb);
				rep = new Label("Pourquoi");
				tb = new TextBox();
				panel.add(rep);
				panel.add(tb);
				question = new Label("What is p2?");
				panel.add(question);
				dropBox = new ListBox(false);
				dropBox.addItem("Reponse A");
				dropBox.addItem("Reponse B");
				dropBox.addItem("Reponse C");
				panel.add(dropBox);
				
				RootPanel.get().add(panel);
			}
		}
