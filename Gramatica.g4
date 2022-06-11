grammar Gramatica;

init: 'start.' bloco 'end.';

bloco: comando+;
comando: declaracao | inicializacao | atribuicao;

int_: 'int';
float_: 'float';
string_: 'string';

num: NUM;
NUM: [0-9]+;

decimal: DECIMAL;
DECIMAL: [0-9]+'.'[0-9]+;

str: STR;
STR: '"'[a-zA-Z0-9 ]+'"';

id: ID;
ID: [a-z]+;

separador_variavel: ',';

operador_atribuicao: ' = ';

tipo_variavel: (int_ | float_ | string_);

declaracao:  tipo_variavel id (separador_variavel id)* fim_linha;

inicializacao: tipo_variavel id operador_atribuicao (num | decimal | str) fim_linha;

atribuicao: id operador_atribuicao (num | decimal | str) fim_linha;

fim_linha: '.';

Ws: [ \t\r\n]+ -> skip;