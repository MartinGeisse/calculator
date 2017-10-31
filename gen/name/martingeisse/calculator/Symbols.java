package name.martingeisse.calculator;

import com.intellij.psi.tree.IElementType;

public class Symbols {

	//
	// terminals
	//

	public static final IElementType CLOSING_PARENTHESIS = new IElementType("CLOSING_PARENTHESIS");
	public static final IElementType DIVIDED_BY = new IElementType("DIVIDED_BY");
	public static final IElementType IDENTIFIER = new IElementType("IDENTIFIER");
	public static final IElementType MINUS = new IElementType("MINUS");
	public static final IElementType NUMBER = new IElementType("NUMBER");
	public static final IElementType OPENING_PARENTHESIS = new IElementType("OPENING_PARENTHESIS");
	public static final IElementType PLUS = new IElementType("PLUS");
	public static final IElementType SEMICOLON = new IElementType("SEMICOLON");
	public static final IElementType TIMES = new IElementType("TIMES");

	//
	// nonterminals
	//

	public static final IElementType calculation = new IElementType("calculation");
	public static final IElementType calculation_1 = new IElementType("calculation_1");
	public static final IElementType calculation_2 = new IElementType("calculation_2");
	public static final IElementType expression = new IElementType("expression");
	public static final IElementType expression_1 = new IElementType("expression_1");
	public static final IElementType expression_2 = new IElementType("expression_2");
	public static final IElementType statement = new IElementType("statement");

}
