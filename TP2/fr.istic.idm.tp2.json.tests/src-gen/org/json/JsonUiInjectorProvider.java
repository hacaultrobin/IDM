/*
* generated by Xtext
*/
package org.json;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class JsonUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.json.ui.internal.JsonActivator.getInstance().getInjector("org.json.Json");
	}
	
}