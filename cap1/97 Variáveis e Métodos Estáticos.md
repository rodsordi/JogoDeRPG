# 97 Variáveis e Métodos Estáticos

- Variáveis e Métodos static existem independentemente de uma instância
- Existem antes da criação de uma instância da classe
- Sempre há 1 cópia de um membro static, mesmo com várias instâncias ativas (cap2)

## Podem ser static 
- Métodos
- Variáveis
- Classes aninhadas (cap8)
- Bloco de inicialização

## Não podem ser static
- Contrutores
- Classes (que não são aninhadas)
- Interfaces
- Métodos locais de classes internas (cap8)
- Métodos e variáveis de instância de classes internas
- Variáveis locais