# 57 Declarando Interface

- É um contrato
- É um adjetivo
- Objetos que não partilham o mesmo pai podem ter comportamentos iguais, nesses casos usamos interfaces
- public e abstract são implicitos, o compilador ajusta em tempo de compilação
- 100% abstract class
- Não possuem variáveis, mas podem declarar constantes
- Métodos não podem ser estáticos
- Métodos são implicitamente abstract, então não podem ser final
- Interfaces podem extender uma ou mais interfaces
- Interface não extende nada além de interface
- Interface não implementa nada
- Tem a palavra reservada interface
- Devem ser usadas com polimorfismo

### ex interface legal
public abstract interface Rollable { }

- abstract é redundante, abstract pode ser implicito

### ex métodos de interface iguais
void bounce();
public void bounce();
abstract void bounce();
public abstract void bounce();
abstract public void bounce();

### ex métodos de interface inválidos
final void bounce(); // final and abstract can never be used
// together, and abstract is implied
static void bounce(); // interfaces define instance methods
private void bounce(); // interface methods are always public
protected void bounce(); // (same as above)