/*
* generated by Xtext
*/
package fr.istic.idm.project;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PollDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.istic.idm.project.ui.internal.PollDslActivator.getInstance().getInjector("fr.istic.idm.project.PollDsl");
	}
	
}