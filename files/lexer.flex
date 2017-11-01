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
BlockComment = "/*" {CommentContent} \*+ "/"
LineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

// identifiers
ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*
number = [0] | [1-9][0-9]*

%%

<YYINITIAL> {
	{Whitespace} { return TokenType.WHITE_SPACE; }
	"+" { return Symbols.PLUS; }
	"-" { return Symbols.MINUS; }
	"*" { return Symbols.TIMES; }
	"/" { return Symbols.DIVIDED_BY; }
	"(" { return Symbols.OPENING_PARENTHESIS; }
	")" { return Symbols.CLOSING_PARENTHESIS; }
	";" { return Symbols.SEMICOLON; }
	{BlockComment} { return Symbols.BLOCK_COMMENT; }
	{LineComment} { return Symbols.LINE_COMMENT; }
	{ident} { return Symbols.IDENTIFIER; }
	{number} { return Symbols.NUMBER; }
}

// error fallback
[^] { return TokenType.BAD_CHARACTER; }
