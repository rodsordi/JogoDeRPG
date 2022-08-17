# 98 Declarando Enums

- São valores pré-definidos
- É uma lista de valores enumerados
- Reduz bug no código
- São constantes

### ex
enum CoffeeSize { BIG, HUGE, OVERWHELMING };

- A declaração não precisam ser maiúsculo, apesa do padrão da Sun
- Pode ser declarado dentro de uma classe
- Não pode ser private ou protected
- Não podem ser declarados dentro de métodos

- Quando são membros, podem terminar com ";" ou não
- Cada item do enum é uma instância do tipo do enum


# Declarando Contrutores, Métodos e Variáveis no enum

- Enum é um tipo de classe especial
- Membros de enum definem constantes com valores mais detalhados

## Construtores
- Nunca pode invocar diretamente, é feito altomaticamente com o argumento definido
- Pode sobre-carregar (cap2) 
- Pode conter classes internas (cap8)
