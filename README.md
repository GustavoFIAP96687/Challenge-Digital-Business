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

### `itens`

A classe `itens` contém informações detalhadas sobre os produtos disponíveis na sua plataforma.

**Atributos:**

- `id`: O identificador único do produto.
  
- `nome`: O nome do produto.
  
- `desc`: A descrição detalhada do produto.
  
- `valor`: O valor unitário do produto.
  
- `quantidade`: Quantidade disponível do produto.

### `tipo_item`

A classe `tipo_item` contém informações detalhadas sobre os tipos dos items.

**Atributos:**

- `id`: O identificador único do produto.
  
- `nome`: O nome do produto.
  
- `desc`: A descrição detalhada do produto.

### `compra`

A classe `compra` contém informações detalhadas sobre as compras dos items.

**Atributos:**

- `id`: O identificador único da compra.
  
- `valor_total`: O valor total da compra.
  
- `data_compra`: A data da compra.

- `cod_contrato`: O código de contrato da compra.

# Endpoints

## Métodos GET

- `GET /usuario`: Retorna uma lista de todos os usuario.
  
- `GET /usuario/{id}`: Retorna detalhes sobre um usuario específico com base no ID.

- `GET /fornecedores`: Retorna uma lista de todos os fornecedores.
  
- `GET /fornecedores/{id}`: Retorna detalhes sobre um fornecedor específico com base no ID.

- `GET /item`: Retorna uma lista de todos os itens disponíveis.
  
- `GET /item/{id}`: Retorna detalhes sobre um item específico com base no ID.

- `GET /tipo_item`: Retorna uma lista de todos os tipos de itens disponíveis.
  
- `GET /tipo_item/{id}`: Retorna detalhes sobre um tipo de item específico com base no ID.

- `GET /compra`: Retorna uma lista de todas as compras realizadas.

- `GET /compra/{id}`: Retorna uma lista de uma compra especifica com base no ID.

## Métodos Post
  
- `POST /usuario`: Cria um novo usuario com base nos dados fornecidos.

- `POST /fornecedores`: Cria um novo fornecedor com base nos dados fornecidos.

- `POST /item`: Cria um novo item com base nos dados fornecidos.

- `POST /tipo_item`: Cria um tipo de item com base nos dados fornecidos.

- `POST /compra`: Cria uma nova compra com base nos dados fornecidos.

## Métodos PUT
  
- `PUT /usuario/{id}`: Atualiza os detalhes de um usuario existente com base no ID.

- `PUT /fornecedores/{id}`: Atualiza os detalhes de um fornecedor existente com base no ID.

- `PUT /item/{id}`: Atualiza os detalhes de um item existente com base no ID.

- `PUT /tipo_item/{id}`: Atualiza os detalhes de um tipo de item existente com base no ID.

- `PUT /compra/{id}`: Atualiza os detalhes de cada compra existente com base no ID.

## Métodos DELETE
  
- `DELETE /usuario/{id}`: Exclui um usuario com base no ID.
  
- `DELETE /fornecedores/{id}`: Exclui um fornecedor com base no ID.
  
- `DELETE /item/{id}`: Exclui um item com base no ID.

- `DELETE /tipo_item/{id}`: Exclui um tipo de item com base no ID.

- `DELETE /compra/{id}`: Exclui uma compra com base no ID.

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

Aqui está um exemplo da estrutura JSON representando as informações do `item`:

```json
{
    "id": "long",
    "nome": "string",
    "desc": "string",
    "valor": "double",
    "quantidade": "int"
}

Aqui está um exemplo da estrutura JSON representando as informações da `compra`:

```json
{
    "id": "long",
    "valor_total": "double",
    "Data": "LocalDate",
    "cod_contrato": "int"
}

```

## Códigos de retorno(usuario, fornecedor, produto, item, tipo de item e compra)

- 200: Conexão e resposta bem-sucedidas.
- 201: Registrado com sucesso.
- 400: Dados inválidos ou ausentes fornecidos.
- 404: Página ou recurso não encontrado.
- 405: Acesso restrito ao recurso.
- 500: Erro interno do servidor.