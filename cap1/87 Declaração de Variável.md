# 87 Declaração de Variavel

- Há 2 tipos de variáveis em Java:

## Primitivas

- São 8 tipos
- char, boolean, byte, short, int, long, double, float
- Quando declarada não pode alterar o seu tipo, apesar de poder alterar seu valor

## Variáveis de Referência

- Armazena uma referência para se referir (acessar) à um objeto
- Tem tipo e seu tipo pode ser alterado
- Referencia qualquer objeto do tipo ou sub-tipo declarado


# Declaranto Primitivos e Ranges de Primitivos

## Primitivos podem ser declarados como:
- Variáveis de classe (static)
- Variáveis de Instância
- Parâmetros de Métodos
- Variáveis Locais

- Pode ser declarados um ou mais primitivos do mesmo tipo na mesma linha

### ex 
	byte b;
	boolean myBooleanPrimitive;
	int x, y, z; // declare three int primitives

- Inteiros são do menor para o maior:
	byte, short, int, long
	
- Decimais são do menor para o maior:
	float, double
	
- Números em java são feitos de 8-bit bytes
- Números são assinados, ou seja, podem ser negativos
- O dígito binário mais à esquerda representa 1:negativo ou 0:positivo

### ex binários
		assinatura	valor			bits	potencia	
byte:  			0	0010011			7		2^7
short: 			1 	111110100000011	15		2^15

## Range dos Numéricos Primitivos
Type 	Bits 	Bytes 	Minimum Range 	Maximum Range
byte 	8 		1 		-2^7 			2^7-1	
short 	16 		2 		-2^15 			2^15-1	
int 	32 		4 		-2^31 			2^31-1	
long 	64 		8 		-2^63 			2^63-1	
float 	32 		4 		n/a 			n/a		
double 	64 		8 		n/a 			n/a		

## Booleanos
- Aão true ou false

## Chars
- São um charactere Unicode de 16-bits
- Apesar do set ASCII (ISO Latin-1) precisar de 8 bits (256 characteres), precisamos de mais espaço para representar outras liguas não latinas
- Caracteres unicode são inteiros de 16-bits não assinados. (2^16, 0 to 65535(2^16-1))

