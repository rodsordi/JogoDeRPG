# 89 Declarando Variáveis de Referência

## Podem ser declaradas como
- Variáveis static
- Variáveis de Instância
- Parâmetros de Métodos
- Variáveis Locais

- Pode declarar uma ou mais variáveis de instancia de mesmo tipo na mesma linha

## ex
	Object o;
	Dog myNewDogReferenceVariable;
	String s1, s2, s3; // declare three String vars.
	
	
# Variáveis de Instância

- São declaradas fora do método
- São inicializadas apenas quando a classe é inicializada
- São chamadas de variáveis de instância, campos, propriedades, atributos

- Podem usar os 4 níveis de acesso
- Podem ser final, transient
- Não podem ser abstract, synchronized, strictfp, native
- Não podem ser static, pois senão seriam variáveis de classe


## Comparação de modificadores de variáveis vs métodos

Variáveis Locais: final
Variáveis (Não-locais): final, public, protected, private, static, transient, volatile
Métodos: final, public, protected, private, static - abstract, synchronized, strictfp, native

