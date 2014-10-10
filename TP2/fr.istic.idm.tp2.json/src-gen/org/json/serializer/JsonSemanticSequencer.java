package org.json.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.json.json.ArrayJsonOption;
import org.json.json.ArrayJsonPoll;
import org.json.json.ArrayJsonQuestion;
import org.json.json.JsonOption;
import org.json.json.JsonPackage;
import org.json.json.JsonPoll;
import org.json.json.JsonQuestion;
import org.json.services.JsonGrammarAccess;

@SuppressWarnings("all")
public class JsonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonPackage.ARRAY_JSON_OPTION:
				if(context == grammarAccess.getArrayJsonOptionRule()) {
					sequence_ArrayJsonOption(context, (ArrayJsonOption) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.ARRAY_JSON_POLL:
				if(context == grammarAccess.getArrayJsonPollRule() ||
				   context == grammarAccess.getJsonPollSystemRule()) {
					sequence_ArrayJsonPoll(context, (ArrayJsonPoll) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.ARRAY_JSON_QUESTION:
				if(context == grammarAccess.getArrayJsonQuestionRule()) {
					sequence_ArrayJsonQuestion(context, (ArrayJsonQuestion) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_OPTION:
				if(context == grammarAccess.getJsonOptionRule()) {
					sequence_JsonOption(context, (JsonOption) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_POLL:
				if(context == grammarAccess.getJsonPollRule()) {
					sequence_JsonPoll(context, (JsonPoll) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_QUESTION:
				if(context == grammarAccess.getJsonQuestionRule()) {
					sequence_JsonQuestion(context, (JsonQuestion) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (option+=JsonOption? option+=JsonOption*)
	 */
	protected void sequence_ArrayJsonOption(EObject context, ArrayJsonOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (polls+=JsonPoll? polls+=JsonPoll*)
	 */
	protected void sequence_ArrayJsonPoll(EObject context, ArrayJsonPoll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question+=JsonQuestion? question+=JsonQuestion*)
	 */
	protected void sequence_ArrayJsonQuestion(EObject context, ArrayJsonQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=STRING? text=STRING)
	 */
	protected void sequence_JsonOption(EObject context, JsonOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? questions+=ArrayJsonQuestion)
	 */
	protected void sequence_JsonPoll(EObject context, JsonPoll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? text=STRING options+=ArrayJsonOption)
	 */
	protected void sequence_JsonQuestion(EObject context, JsonQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
