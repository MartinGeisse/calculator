package name.martingeisse.calculator;

import com.intellij.lexer.FlexAdapter;

/**
 *
 */
public class CalculatorLexer extends FlexAdapter {

	public CalculatorLexer() {
		super(new FlexGeneratedCalculatorLexer(null));
	}

}
