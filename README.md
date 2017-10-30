# calculator
This is a sample IntelliJ plugin using the MaPaG parser generator, available at https://github.com/MartinGeisse/mapag

This plugin implements a simple calculation language like this:
```
1 + 2;
3 + 4 * 5 + 6;
99 / 11;
```
including syntax highlighting. WIP: Support running the calculations as well as high-level operations such as variable renaming.

This repository contains the generated code for the lexer and parser as well as the specification files. You'll need the
JFlex plugin for generating the lexer and the MaPaG plugin for generating the parser.
