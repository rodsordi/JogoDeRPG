# 60 Declarando Contantes de Interface

- Constantes são "public static final"
- Interfaces podem ter somente constantes
- Constantes em interfaces são implicitamente "public static final", é redundante

### ex constante
interface Foo {
	int BAR = 42;
	void go();
}

public int x = 1; // Looks non-static and non-final,
// but isn't!
int x = 1; // Looks default, non-final,
// non-static, but isn't!
static int x = 1; // Doesn't show final or public
final int x = 1; // Doesn't show static or public
public static int x = 1; // Doesn't show final
public final int x = 1; // Doesn't show static
static final int x = 1 // Doesn't show public
public static final int x = 1; // what you get implicitly