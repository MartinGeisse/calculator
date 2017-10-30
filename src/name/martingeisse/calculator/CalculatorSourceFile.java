package name.martingeisse.calculator;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorSourceFile extends PsiFileBase {

	public CalculatorSourceFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, CalculatorLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return CalculatorFileType.INSTANCE;
	}

}
