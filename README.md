# Challenge-Digital-Business API

Bem-vindo à documentação da **Challenge-Digital-Business API**! Esta API fornece informações de usuarios, fornecedores e produtos. Abaixo, você encontrará detalhes sobre as principais classes e endpoints disponíveis.

## Descrição do projeto
Nossa automação inteligente realiza análises detalhadas de pedidos, auxiliando você a encontrar as melhores opções de compra para produtos específicos. Consideramos critérios cruciais como preço, qualidade, frete, tempo de entrega e custo-benefício para oferecer recomendações personalizadas.

## Classes

### `Usuario`

A classe `Usuario` contém informações detalhadas sobre os usuario da sua plataforma.

**Atributos:**

- `cpf`: O identificador único do usuario.
  
- `nome`: O nome completo da empresa usuario.

- `email`: O email completo do usuario.
  
- `cep`: O CEP (Código de Endereçamento Postal) do endereço do usuario.
  
- `numero`: O número do local da usuario.

- `complemento`: O complemento do local do usuario.

- `logradouro`: O logradouro do local do usuario.

- `telefone`: O telefone do usuario.

### `Fornecedor`

A classe `Fornecedor` contém informações detalhadas sobre os fornecedores associados à sua plataforma.

**Atributos:**

- `id`: O identificador único do fornecedor.
  
- `nome`: O nome completo do fornecedor.
  
- `cnpj`: O CNPJ do fornecedor.

- `telefone`: O telefone do fornecedor.

- `reputacao;`: A telefone do reputacao;.

### `Produto`

A classe `Produto` contém informações detalhadas sobre os produtos disponíveis na sua plataforma.

**Atributos:**

- `id`: O identificador único do produto.
  
- `nome`: O nome do produto.
  
- `desc`: A descrição detalhada do produto.
  
- `valor`: O valor unitário do produto.
  
- `quantidade`: Quantidade disponível do produto.

# Endpoints

## Métodos GET

- `GET /usuario`: Retorna uma lista de todos os usuario.
  
- `GET /usuario/{id}`: Retorna detalhes sobre um usuario específico com base no ID.

- `GET /fornecedores`: Retorna uma lista de todos os fornecedores.
  
- `GET /fornecedores/{id}`: Retorna detalhes sobre um fornecedor específico com base no ID.

- `GET /produtos`: Retorna uma lista de todos os produtos disponíveis.
  
- `GET /produtos/{id}`: Retorna detalhes sobre um produto específico com base no ID.

## Métodos Post
  
- `POST /usuario`: Cria um novo usuario com base nos dados fornecidos.

- `POST /fornecedores`: Cria um novo fornecedor com base nos dados fornecidos.

- `POST /produtos`: Cria um novo produto com base nos dados fornecidos.

## Métodos PUT
  
- `PUT /usuario/{id}`: Atualiza os detalhes de um usuario existente com base no ID.

- `PUT /fornecedores/{id}`: Atualiza os detalhes de um fornecedor existente com base no ID.

- `PUT /produtos/{id}`: Atualiza os detalhes de um produto existente com base no ID.

## Métodos DELETE
  
- `DELETE /usuario/{id}`: Exclui um usuario com base no ID.
  
- `DELETE /fornecedores/{id}`: Exclui um fornecedor com base no ID.
  
- `DELETE /produtos/{id}`: Exclui um produto com base no ID.

Lembre-se de incluir os parâmetros necessários na sua solicitação para obter os resultados desejados.

## Exemplo JSON

Aqui está um exemplo da estrutura JSON representando as informações do `usuario`:

```json
{
    "cpf": "String",
    "nome": "String",
    "email": "String",
    "cep": "String",
    "numero": "Int",
    "complemento": "String",
    "logradouro": "String",
    "telefone": "String"
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `Fornecedor`:

```json
{
    "id": "Long",
    "nome": "String",
    "cnpj": "String",
    "telefone": "String",
    "reputacao": "String"
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `Produto`:

```json
{
    "id": "long",
    "nome": "string",
    "desc": "string",
    "valor": "double",
    "quantidade": "int"
}
```

## Códigos de retorno(usuario, fornecedor e produto)

- 200: Conexão e resposta bem-sucedidas.
- 201: Registrado com sucesso.
- 400: Dados inválidos ou ausentes fornecidos.
- 404: Página ou recurso não encontrado.
- 405: Acesso restrito ao recurso.
- 500: Erro interno do servidor.