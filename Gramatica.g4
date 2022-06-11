grammar Gramatica;

init: 'script.' bloco 'script.';

bloco: comando+;
comando:
	declaracao
	| inicializacao
	| atribuicao
	| comando_show
	| comando_get
	| comando_if
	| comando_else_if;

int_: 'int';
double_: 'double';
string_: 'string';

num: NUM;
NUM: [0-9]+;

decimal: DECIMAL;
DECIMAL: [0-9]+ ',' [0-9]+;

str: STR;
STR: '"' [a-zA-Z0-9 ]+ '"';

id: ID;
ID: [a-z]+;

separador_variavel: ',';

operador_atribuicao: ' = ';

tipo_variavel: (int_ | double_ | string_);

declaracao: tipo_variavel id (separador_variavel id)* fim_linha;

inicializacao:
	tipo_variavel id operador_atribuicao (num | decimal | str) fim_linha;

atribuicao:
	id operador_atribuicao (num | decimal | str) fim_linha;

comando_show: 'show(' (ID | STR) ')' fim_linha;

comando_get: 'get(' ID ')' fim_linha;

OPERADOR_RELACIONAL: '<' | '>' | '<=' | '>=' | '==' | '!=';

expressao_if: (ID | NUM | DECIMAL | STR) OPERADOR_RELACIONAL (
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

fim_linha: '.';

Ws: [ \t\r\n]+ -> skip;