package name.martingeisse.calculator;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 */
public class CalculatorElementType extends IElementType {

	public CalculatorElementType(@NotNull String debugName) {
		super(debugName, CalculatorLanguage.INSTANCE);
	}

}
