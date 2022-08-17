# 62 Declarando Membros de Classe

- Variáveis de Instância são Atributos
- Métodos são Comportamentos
- O conjunto de Atributos mais Comportamentos são Membros da Classe


# Modificadores de acesso

- Variáveis e Métodos compartilham os mesmos modificadores de acesso
- Classes possuém apenas 2 modificadores de acesso

- public, protected, default, private

- Variáveis e métodos podem ser acessíveis ou não entre classes via operador "."


# Membros públicos

## Dada uma classe pública
- Membros são acessíveis por qualquer outra classe, idependentemente do pacote


# Membros privados

- Não podem ser acessados por nada além de sua própria classe


# Membros Protected e Default

- Modificadores Protected e Default são iguais, com exceção de:
- Default deve ser acessado somente se as classes estão no mesmo package
- Protected pode ser acessado por sub-classes, mesmo em pacotes diferentes
- Protected pode ser acessado por outras classes no mesmo package


# Variáveis Locais

- Variáveis locais não possuém modificadores de acesso
- Variáveis locais podem conter o modificador (não acesso) final


# Tabela de acessos

Visibility 						Public 		Protected 	Default 	Private
From the same class 			Yes 		Yes 		Yes 		Yes

From any class in the same		Yes 		Yes 		Yes 		No
package			

From a subclass in the same		Yes 		Yes 		Yes 		No
package 		

From a subclass outside the		Yes 		Yes, through No 		No
same package								inheritance

From any non-subclass class		Yes 		No 			No 			No
outside the package




