/*
 * generated by Xtext
 */
package fr.istic.idm.project.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPollDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.istic.idm.project.pollDsl.PollDslPackage.eINSTANCE);
		return result;
	}
}
