package name.martingeisse.calculator;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 *
 */
public class CalculatorFileType extends LanguageFileType {

	@NonNls
	public static final String DEFAULT_EXTENSION = "calc";

	@NonNls
	public static final String DOT_DEFAULT_EXTENSION = "." + DEFAULT_EXTENSION;

	public static final CalculatorFileType INSTANCE = new CalculatorFileType();

	public CalculatorFileType() {
		super(CalculatorLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "CALC";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "calculation file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return AllIcons.FileTypes.Text;
	}
}
