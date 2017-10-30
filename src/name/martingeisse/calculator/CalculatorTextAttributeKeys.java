package name.martingeisse.calculator;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorTextAttributeKeys {

	public static final TextAttributesKey[] NUMBER = single("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey[] OPERATOR = single("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
	public static final TextAttributesKey[] KEYWORD = single("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey[] IDENTIFIER = single("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey[] PARENTHESES = single("PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
	public static final TextAttributesKey[] SEMICOLON = single("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
	public static final TextAttributesKey[] BAD_CHARACTER = new TextAttributesKey[]{HighlighterColors.BAD_CHARACTER};

	private static TextAttributesKey[] single(@NonNls @NotNull String externalName, TextAttributesKey fallbackAttributeKey) {
		return new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey(externalName, fallbackAttributeKey)
		};
	}
}
