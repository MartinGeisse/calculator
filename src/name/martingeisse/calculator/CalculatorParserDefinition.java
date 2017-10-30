package name.martingeisse.calculator;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorParserDefinition implements ParserDefinition {

	public static final IFileElementType FILE_ELEMENT_TYPE = new IFileElementType(CalculatorLanguage.INSTANCE);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new CalculatorLexer();
	}

	@Override
	public PsiParser createParser(Project project) {
		return new MapagGeneratedCalculationParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE_ELEMENT_TYPE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return TokenSet.create(TokenType.WHITE_SPACE);
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		// TODO generate symbol IElementType holder class?
		return TokenSet.create(MapagSpecificationElementTypes.COMMENT);
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		// TODO generate PSI classes? Generate factory for PSI elements?
		return new ASTWrapperPsiElement(node);
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new CalculatorSourceFile(viewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

}
