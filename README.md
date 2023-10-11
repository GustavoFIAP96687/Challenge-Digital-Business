# Challenge-Digital-Business API

Bem-vindo à documentação da **Challenge-Digital-Business API**! Esta API fornece informações de consumidores, fornecedores e produtos. Abaixo, você encontrará detalhes sobre as principais classes e endpoints disponíveis.

## Classes

### `Consumidor`

A classe `Consumidor` contém informações detalhadas sobre os consumidores da sua plataforma.

**Atributos:**

- `id`: O identificador único do consumidor.
  
- `nome`: O nome completo da empresa consumidora.
  
- `rfq`: A solicitação de cotação (Request for Quotation) do consumidor para o fornecedor.
  
- `cnpj`: O CNPJ (Cadastro Nacional da Pessoa Jurídica) da empresa.
  
- `cep`: O CEP (Código de Endereçamento Postal) do endereço da empresa.
  
- `numero`: O número do local da empresa.

### `Fornecedor`

A classe `Fornecedor` contém informações detalhadas sobre os fornecedores associados à sua plataforma.

**Atributos:**

- `id`: O identificador único do fornecedor.
  
- `nome`: O nome completo do fornecedor.
  
- `cnpj`: O CNPJ do fornecedor.
  
- `cep`: O CEP do endereço do fornecedor.
  
- `numero`: O número do local do fornecedor.

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

- `GET /consumidores`: Retorna uma lista de todos os consumidores.
  
- `GET /consumidores/{id}`: Retorna detalhes sobre um consumidor específico com base no ID.

- `GET /fornecedores`: Retorna uma lista de todos os fornecedores.
  
- `GET /fornecedores/{id}`: Retorna detalhes sobre um fornecedor específico com base no ID.

- `GET /produtos`: Retorna uma lista de todos os produtos disponíveis.
  
- `GET /produtos/{id}`: Retorna detalhes sobre um produto específico com base no ID.

## Métodos Post
  
- `POST /consumidores`: Cria um novo consumidor com base nos dados fornecidos.

- `POST /fornecedores`: Cria um novo fornecedor com base nos dados fornecidos.

- `POST /produtos`: Cria um novo produto com base nos dados fornecidos.

## Métodos PUT
  
- `PUT /consumidores/{id}`: Atualiza os detalhes de um consumidor existente com base no ID.

- `PUT /fornecedores/{id}`: Atualiza os detalhes de um fornecedor existente com base no ID.

- `PUT /produtos/{id}`: Atualiza os detalhes de um produto existente com base no ID.

## Métodos DELETE
  
- `DELETE /consumidores/{id}`: Exclui um consumidor com base no ID.
  
- `DELETE /fornecedores/{id}`: Exclui um fornecedor com base no ID.
  
- `DELETE /produtos/{id}`: Exclui um produto com base no ID.

Lembre-se de incluir os parâmetros necessários na sua solicitação para obter os resultados desejados.

## Exemplo JSON

Aqui está um exemplo da estrutura JSON representando as informações do `Consumidor`:

```json
{
    "id": "Long",
    "nome": "string",
    "rfq": "string",
    "cnpj": "string",
    "cep": "string",
    "numero": "int",
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `Fornecedor`:

```json
{
    "id": "Long",
    "nome": "string",
    "rfq": "string",
    "cnpj": "string",
    "cep": "string",
    "numero": "int",
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `Produto`:

```json
{
    "id": "long",
    "nome": "string",
    "desc": "string",
    "valor": "double",
    "quantidade": "int",
}
```

## Códigos de retorno(Consumidor, fornecedor e produto)

- 200: Conexão e resposta bem-sucedidas.
- 201: Registrado com sucesso.
- 400: Dados inválidos ou ausentes fornecidos.
- 404: Página ou recurso não encontrado.
- 405: Acesso restrito ao recurso.
- 500: Erro interno do servidor.