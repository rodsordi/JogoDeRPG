# 91 Variáveis Locais (Automática, Stack(Pilha), Método)

- Declarada dentro do método
- Inicializada dentro do método
- Destruída quando o método é completado
- Estão na memória stack (Pilha), não na memória heap
- Se a variável local é uma referencia de objeto, o objeto está na memória heap
- Só podem receber o modificador final

- Geralmente é inicializada na mesma linha da declaração 
- Pode ser declarada após a declaração
- Não pode ser acessada antes da inicialização
- Não recebem valor default

- Não pode ser acessada fora do método
- Pode ser declarada com mesmo nome de uma variável de instância (shadowing: Seguir a sombra)

- Quando shadowing, precisa usar a palavra chave this
