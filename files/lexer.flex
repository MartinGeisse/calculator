package name.martingeisse.calculator;

import java.lang.Error;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

%%

%class FlexGeneratedCalculatorLexer
%implements FlexLexer
%public
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

// whitespace
Newline = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

// comments
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

// identifiers
ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*
number = [0] | [1-9][0-9]*

%%

<YYINITIAL> {
	{Whitespace} { return TokenType.WHITE_SPACE; }
	"+" { return CalculatorElementTypes.PLUS; }
	"-" { return CalculatorElementTypes.MINUS; }
	"*" { return CalculatorElementTypes.TIMES; }
	"/" { return CalculatorElementTypes.DIVIDED_BY; }
	"(" { return CalculatorElementTypes.OPENING_PARENTHESIS; }
	")" { return CalculatorElementTypes.CLOSING_PARENTHESIS; }
	";" { return CalculatorElementTypes.SEMICOLON; }
	{Comment} { return CalculatorElementTypes.COMMENT; }
	{ident} { return CalculatorElementTypes.IDENTIFIER; }
	{number} { return CalculatorElementTypes.NUMBER; }
}

// error fallback
[^] { return TokenType.BAD_CHARACTER; }
