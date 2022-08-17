# 46 Padrões Java Beans

- Java Beans são classes que tem propriedades (variáveis de instância privadas)

- Métodos de acesso começam com get, com exceção de propriedades booleanas
### ex 
size //Propriedade
getSize() //Método de acesso

- Para propriedades booleanas o método de acesso começa com get ou is
### ex 
stopped //Propriedade
getStopped() //Método de acesso
isStopped() //Método de acesso

- Para atribuir um novo valor é utilizado o método set
### ex
size //Propriedade
setSize() //Método de atribuição

- Setters são public, tem valor de retorno void e possuem argumento igual à propriedade
- Getters são public, não possuem argumentos e tem valor de retorno igual à propriedade
