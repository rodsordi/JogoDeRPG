# 85 Declaração de Construtor

- Em Java objetos são construídos
- Ao criar um novo objeto, 1 ou mais construtores são invocados
- Toda classe possuí um construtor
- Construtores default são implicitos, o compilador auto-completa
- Não tem um tipo de retorno
- Podem declarar todos modificadores de acesso
- Podem receber argumentos (var-args tbm)
- Devem ter o mesmo nome da classe
- Não podem ser static, pois são relacionado com instanciação
- Não podem ser final ou abstract, pois não são sobre-escritos

### ex
	class Foo2 {
		// legal constructors
		Foo2() { }
		private Foo2(byte b) { }
		Foo2(int x) { }
		Foo2(int x, int... y) { }

		// illegal constructors
		void Foo2() { } // it's a method, not a constructor
		Foo() { } // not a method or a constructor
		Foo2(short s); // looks like an abstract method
		static Foo2(float f) { } // can't be static
		final Foo2(long x) { } // can't be final
		abstract Foo2(char c) { } // can't be abstract
		Foo2(int... x, int t) { } // bad var-arg syntax
	}
