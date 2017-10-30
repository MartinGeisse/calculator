package name.martingeisse.calculator;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorLanguage extends Language {

	public static final CalculatorLanguage INSTANCE = new CalculatorLanguage();

	public CalculatorLanguage() {
		super("CALC", "text/x-calculation");
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Calculation";
	}

	@Override
	public boolean isCaseSensitive() {
		return true;
	}

}
