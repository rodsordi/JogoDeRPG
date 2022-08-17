# 43 Indentificadores Permitidos

- Identificadores devem começar com (letra, $, _), não números
- Depois da primeira é permitido qualquer letra, currency chars, connecting chars, números
- Não há limite de tamanho de characteres do identificador
- Não permitido palavras reservadas
- Case sensitive ex: foo != FOO

### ex legal
- int _a;
- int $c;
- int ______2_w;
- int _$;
- int this_is_a_very_detailed_name_for_an_identifier;

### ex ilegal

- int :b;
- int -d;
- int e#;
- int .f;
- int 7g;

## Palavras reservadas

abstract boolean break byte case catch
char class const continue default do
double else extends fi nal fi nally fl oat
for goto if implements import instanceof
int interface long native new package
private protected public return short static
strictfp super switch synchronized this throw
throws transient try void volatile while
assert enum