# Diário de erros

Registro dos erros encontrados no projeto, para enxergar padrões e revisar conceitos.

### 2026-10-31 — `()` sobrando e tipo de retorno errado no controller
- Categoria: Java básico / Tipos (Optional)
- Arquivo: src/main/java/nandojuniodev/tutor/dom/Controller/DomController.java:21
- Causa: `loclizarProdutoPorId(id)()` tinha parênteses extras, e o método prometia devolver `String`, mas o service devolve `Optional<Produtos>`.
- Lição: o tipo de retorno do método precisa ser compatível com o que você retorna; um `Optional` precisa ser "aberto" (`map`/`orElse`) antes de usar.

### 2026-10-31 — `.env` com senha enviado para repositório público
- Categoria: Segurança / Git
- Arquivo: .env (commit a8f01e1)
- Causa: `.env` não estava no `.gitignore`, então foi commitado e enviado para o GitHub público.
- Lição: antes do primeiro commit, coloque `.env` no `.gitignore`; se um segredo vazar, troque a senha (apagar o arquivo não basta, o histórico guarda).
