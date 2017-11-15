package name.martingeisse.calculator;

public class Symbols {

	//
	// terminals
	//

	public static final CalculatorElementType BLOCK_COMMENT = new CalculatorElementType("BLOCK_COMMENT");
	public static final CalculatorElementType CLOSING_PARENTHESIS = new CalculatorElementType("CLOSING_PARENTHESIS");
	public static final CalculatorElementType DIVIDED_BY = new CalculatorElementType("DIVIDED_BY");
	public static final CalculatorElementType IDENTIFIER = new CalculatorElementType("IDENTIFIER");
	public static final CalculatorElementType LINE_COMMENT = new CalculatorElementType("LINE_COMMENT");
	public static final CalculatorElementType MINUS = new CalculatorElementType("MINUS");
	public static final CalculatorElementType NUMBER = new CalculatorElementType("NUMBER");
	public static final CalculatorElementType OPENING_PARENTHESIS = new CalculatorElementType("OPENING_PARENTHESIS");
	public static final CalculatorElementType PLUS = new CalculatorElementType("PLUS");
	public static final CalculatorElementType SEMICOLON = new CalculatorElementType("SEMICOLON");
	public static final CalculatorElementType TIMES = new CalculatorElementType("TIMES");


	//
	// nonterminals
	//

	public static final CalculatorElementType calculation = new CalculatorElementType("calculation");
	public static final CalculatorElementType calculation_Statements = new CalculatorElementType("calculation_Statements");
	public static final CalculatorElementType expression = new CalculatorElementType("expression");
	public static final CalculatorElementType expression_Additive_Operator = new CalculatorElementType("expression_Additive_Operator");
	public static final CalculatorElementType expression_Multiplicative_Operator = new CalculatorElementType("expression_Multiplicative_Operator");
	public static final CalculatorElementType statement = new CalculatorElementType("statement");


	//
	// special
	//

    // partially parsed input in case of an error
	public static final CalculatorElementType __PARSED_FRAGMENT = new CalculatorElementType("__PARSED_FRAGMENT");

}
