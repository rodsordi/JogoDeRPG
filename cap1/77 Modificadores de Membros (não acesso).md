# 77 Modificadores de Membros (não acesso)

- final, abstract, transient, synchronized, native, strictfp


# Métodos final

- Previne métodos serem sobre-escritos em sub-classes

# Argumentos final

- Argumentos de métodos são variáveis contidas em ()
- Argumentos de métodos são o mesmo que variáveis locais
- Argumentos final não podem ter valores re-atribuidos dentro do método


# Métodos abstratos

- Não pode ter um corpo
- Não possuí código funcional
- Termina com ";"
- Classes concretas não podem ter métodos abstratos
- Existe somente em classes abstratas, não pode ser declarado em classes concretas
- Classes abstratas podem não conter métodos abstratos
- Classes que extendem de classes abstratas, devem implementar métodos abstratos

- Sobre-carga não é considerada implementação de métodos abstratos
- Métodos não podem ser combinar:
	- abstract + final
	- abstract + private
	- abstract + static
