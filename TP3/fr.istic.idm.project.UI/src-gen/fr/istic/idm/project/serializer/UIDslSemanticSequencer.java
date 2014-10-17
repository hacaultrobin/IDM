package fr.istic.idm.project.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.idm.project.services.UIDslGrammarAccess;
import fr.istic.idm.project.uIDsl.CheckBox;
import fr.istic.idm.project.uIDsl.ComboBox;
import fr.istic.idm.project.uIDsl.Image;
import fr.istic.idm.project.uIDsl.Option;
import fr.istic.idm.project.uIDsl.Poll;
import fr.istic.idm.project.uIDsl.PollSystem;
import fr.istic.idm.project.uIDsl.Question;
import fr.istic.idm.project.uIDsl.RadioButton;
import fr.istic.idm.project.uIDsl.TextBox;
import fr.istic.idm.project.uIDsl.UIDslPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class UIDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UIDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UIDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UIDslPackage.CHECK_BOX:
				if(context == grammarAccess.getCheckBoxRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_CheckBox(context, (CheckBox) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.COMBO_BOX:
				if(context == grammarAccess.getComboBoxRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ComboBox(context, (ComboBox) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.IMAGE:
				if(context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.POLL:
				if(context == grammarAccess.getPollRule()) {
					sequence_Poll(context, (Poll) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.POLL_SYSTEM:
				if(context == grammarAccess.getPollSystemRule()) {
					sequence_PollSystem(context, (PollSystem) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.RADIO_BUTTON:
				if(context == grammarAccess.getRadioButtonRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RadioButton(context, (RadioButton) semanticObject); 
					return; 
				}
				else break;
			case UIDslPackage.TEXT_BOX:
				if(context == grammarAccess.getTextBoxRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_TextBox(context, (TextBox) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (checkBox='Checkbox' default=ID?)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comboBox='ComboBoxItem' default=ID?)
	 */
	protected void sequence_ComboBox(EObject context, ComboBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (default=ID? url=STRING)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? type=Type)
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     polls+=Poll*
	 */
	protected void sequence_PollSystem(EObject context, PollSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? questions+=Question+)
	 */
	protected void sequence_Poll(EObject context, Poll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? options+=Option+)
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (radioButton='RadioButton' default=ID?)
	 */
	protected void sequence_RadioButton(EObject context, RadioButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (textBox='TextBox' default=ID?)
	 */
	protected void sequence_TextBox(EObject context, TextBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
