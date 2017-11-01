package name.martingeisse.calculator;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

	public CalculatorSyntaxHighlighterFactory() {
	}

	@Override
	@NotNull
	public SyntaxHighlighter getSyntaxHighlighter(final Project project, final VirtualFile virtualFile) {
		return new SyntaxHighlighterBase() {

			@NotNull
			@Override
			public Lexer getHighlightingLexer() {
				return new CalculatorLexer();
			}

			@NotNull
			@Override
			public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
				if (tokenType == Symbols.PLUS || tokenType == Symbols.MINUS || tokenType == Symbols.TIMES || tokenType == Symbols.DIVIDED_BY) {
					return CalculatorTextAttributeKeys.OPERATOR;
				} else if (tokenType == Symbols.OPENING_PARENTHESIS || tokenType == Symbols.CLOSING_PARENTHESIS) {
					return CalculatorTextAttributeKeys.PARENTHESES;
				} else if (tokenType == Symbols.SEMICOLON) {
					return CalculatorTextAttributeKeys.SEMICOLON;
				} else if (tokenType == Symbols.NUMBER) {
					return CalculatorTextAttributeKeys.NUMBER;
				} else if (tokenType == Symbols.IDENTIFIER) {
					return CalculatorTextAttributeKeys.IDENTIFIER;
				} else if (tokenType == Symbols.BLOCK_COMMENT) {
					return CalculatorTextAttributeKeys.BLOCK_COMMENT;
				} else if (tokenType == Symbols.LINE_COMMENT) {
					return CalculatorTextAttributeKeys.LINE_COMMENT;
				} else if (tokenType == TokenType.BAD_CHARACTER) {
					return CalculatorTextAttributeKeys.BAD_CHARACTER;
				}
				return EMPTY;
			}

		};
	}

}
