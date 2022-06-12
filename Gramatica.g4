grammar Gramatica;

init: 'start.' bloco* 'end.';

bloco: comando+;
comando:
	declaracao
	| inicializacao
	| atribuicao
	| comando_show
	| comando_get
	| comando_if
	| comando_else_if
	| comando_while
	| comando_do_while;

NEW_LINE: '\\n';

int_: 'int';
double_: 'double';
string_: 'string';

num: NUM;
NUM: [0-9]+;

decimal: DECIMAL;
DECIMAL: [0-9]+ ',' [0-9]+;

str: STR;
STR:
	'"' (
		[a-zA-Z0-9 .,]
		| NEW_LINE
		| '+'
		| ':'
		| ';'
		| '-'
		| '_'
		| '?'
		| '!'
		| '='
		| '<'
		| '>'
		| '/'
		| '*'
	)* '"';

id: ID;
ID: ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*;

tipo_variavel: (int_ | double_ | string_);

declaracao: tipo_variavel ' ' ID (', ' ID)* fim_linha;

operador_matematico: '/' | '*' | '+' | '-';
termo: (num | decimal | id | str);
operacao:
	termo ' ' operador_matematico ' ' termo (
		' ' operador_matematico ' ' termo
	)*;

// parenteses_operador_termo: '(' operacao ')' ' ' operador_matematico;
operacao_parenteses:
	(termo | '('+ operacao ')'+) ' ' operador_matematico ' ' '('+ operacao ')'+ (
		' ' operador_matematico ' ' (termo | '('+ operacao ')'+)
	)*;
expressao: operacao_parenteses | operacao | termo;
inicializacao: tipo_variavel ' ' ID ' = ' expressao fim_linha;

atribuicao: ID ' = ' expressao fim_linha;

comando_show: 'show(' (id | str | num | decimal) ')' fim_linha;
comando_get: 'get(' (ID) ')' fim_linha;

OPERADOR_RELACIONAL: '<' | '>' | '<=' | '>=' | '==' | '!=';
expressao_if: (ID | NUM | DECIMAL | STR) ' ' OPERADOR_RELACIONAL ' ' (
		ID
		| NUM
		| DECIMAL
		| STR
	);
comando_if:
	'if ' expressao_if ':' bloco* comando_else_if? comando_else? fim_comando_if;
comando_else_if:
	'else if ' expressao_if ':' bloco* comando_else_if? comando_else?;
comando_else: ('else:' bloco*);
fim_comando_if: 'end.';

comando_while:
	'while ' expressao_if ':' bloco* fim_comando_while;
fim_comando_while: 'end.';

expressao_if_do_while: (ID | NUM | DECIMAL | STR) ' ' OPERADOR_RELACIONAL ' ' (
		ID
		| NUM
		| DECIMAL
		| STR
	);
comando_do_while:
	'do:' bloco* 'while ' expressao_if_do_while ' ' fim_comando_do_while;
fim_comando_do_while: 'end.';

fim_linha: '.';

Ws: [ \t\r\n]+ -> skip;