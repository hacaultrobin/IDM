package org.json.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.json.json.Array;
import org.json.json.JsonPackage;
import org.json.json.Member;
import org.json.services.JsonGrammarAccess;

@SuppressWarnings("all")
public class JsonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonPackage.ARRAY:
				if(context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.OBJECT:
				if(context == grammarAccess.getObjectRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Object(context, (org.json.json.Object) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (values+=Value? values+=Value*)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=Value)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.MEMBER__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.MEMBER__KEY));
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.MEMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.MEMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemberAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getMemberAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (members+=Member? members+=Member*)
	 */
	protected void sequence_Object(EObject context, org.json.json.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
