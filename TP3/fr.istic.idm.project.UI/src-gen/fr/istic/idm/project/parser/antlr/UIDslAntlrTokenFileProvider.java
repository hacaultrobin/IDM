/*
* generated by Xtext
*/
package fr.istic.idm.project.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UIDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.tokens");
	}
}
