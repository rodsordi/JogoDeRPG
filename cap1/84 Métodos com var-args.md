# 84 Métodos com var-args

- Argumento é o valor da variável do método em Runtime
- Paramêtro é a variável declarada na assinatura do método

## var-args
- É uma lista
- Precisa ter um tipo, seja primitivo ou um objeto
- Declara-se: tipo, 3 pontos (...), espaço, identificador do var-args
- Métodos podem declarar apenas um var-args
- Deve ser o último parâmetro na assinatura do método


### ex
	Legal:
	void doStuff(int... x) { } // expects from 0 to many ints
								// as parameters
	void doStuff2(char c, int... x) { } // expects first a char,
										// then 0 to many ints
	void doStuff3(Animal... animal) { } // 0 to many Animals

	Illegal:
	void doStuff4(int x...) { } // bad syntax
	void doStuff5(int... x, char... y) { } // too many var-args
	void doStuff6(String... s, byte b) { } // var-arg must be last
	
