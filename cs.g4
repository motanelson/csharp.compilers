grammar cs;

// =====================
// PROGRAMA
// =====================
programa
    : classe* EOF
    ;

// =====================
// CLASSES
// =====================
classe
    : 'class' ID '{' membroClasse* '}'
    ;

membroClasse
    : metodo
    | variavel
    ;

// =====================
// MÉTODOS
// =====================
metodo
    : tipo ID '(' parametroLista? ')' bloco
    ;

parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : tipo ID
    ;

// =====================
// VARIÁVEIS
// =====================
variavel
    : tipo ID ('=' expressao)? ';'
    ;

// =====================
// BLOCO
// =====================
bloco
    : '{' instrucao* '}'
    ;

// =====================
// INSTRUÇÕES
// =====================
instrucao
    : variavel
    | atribuicao ';'
    | chamadaMetodo ';'
    | retorno
    | ifInstrucao
    | whileInstrucao
    | forInstrucao
    | bloco
    ;

// =====================
// ATRIBUIÇÃO
// =====================
atribuicao
    : acesso '=' expressao
    ;

// =====================
// IF / ELSE
// =====================
ifInstrucao
    : 'if' '(' expressao ')' instrucao ('else' instrucao)?
    ;

// =====================
// WHILE
// =====================
whileInstrucao
    : 'while' '(' expressao ')' instrucao
    ;

// =====================
// FOR
// =====================
forInstrucao
    : 'for' '(' forInit? ';' expressao? ';' forUpdate? ')' instrucao
    ;

forInit
    : variavel | atribuicao
    ;

forUpdate
    : atribuicao
    ;

// =====================
// RETURN
// =====================
retorno
    : 'return' expressao? ';'
    ;

// =====================
// CHAMADAS
// =====================
chamadaMetodo
    : acesso '(' argumentoLista? ')'
    ;

argumentoLista
    : expressao (',' expressao)*
    ;

// =====================
// EXPRESSÕES (com precedência correta)
// =====================
expressao
    : logicoOu
    ;

logicoOu
    : logicoE ('||' logicoE)*
    ;

logicoE
    : igualdade ('&&' igualdade)*
    ;

igualdade
    : comparacao (('==' | '!=') comparacao)*
    ;

comparacao
    : soma (('>' | '<' | '>=' | '<=') soma)*
    ;

soma
    : termo (('+' | '-') termo)*
    ;

termo
    : fator (('*' | '/' | '%') fator)*
    ;

fator
    : ('+' | '-' | '!') fator
    | primario
    ;

primario
    : NUMBER
    | BOOL
    | STRING
    | acesso
    | chamadaMetodo
    | '(' expressao ')'
    ;

// =====================
// ACESSO A MEMBROS
// =====================
acesso
    : thisRef ('.' ID)*
    ;

thisRef
    : 'this'
    | ID
    ;

// =====================
// TIPOS
// =====================
tipo
    : 'int'
    | 'float'
    | 'bool'
    | 'string'
    | 'void'
    | ID
    ;

// =====================
// LEXER
// =====================
ID      : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER  : [0-9]+ ('.' [0-9]+)? ;
STRING  : '"' (~["\\] | '\\' .)* '"' ;
BOOL    : 'true' | 'false' ;

WS      : [ \t\r\n]+ -> skip ;

// comentários opcionais
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;