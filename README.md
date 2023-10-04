# AutoVulcano
AutoVulcano é um projeto que tem como objetivo o cadastro e divulgação de anúncios de veículos à venda. A documentação abaixo abrange endpoints, formatos de entrada/saída e códigos de retorno.

## Anunciar

**Campos da requisição**

| Campo | Tipo | Obrigatório | Descrição
|-------|------|:-------------:|---
| id | Long | Sim | O id precisa ser diferente para cada veículo
| marca | String | Sim | Campo para marca do veículo
| modelo | String | Sim | Campo para modelo do veículo
| anoModelo | String | Sim | Campo para o ano do modelo
| anoFabricacao | String | Sim | Campo para ano de fabricação
| versao | String | Sim | Variações de um modelo especifico de veículo
| cor | String | Sim | Cor do veículo

**Descrição dos endpoints**

- `POST` /anunciar: Cadastrar um novo veículo;
- `GET` /anunciar: Listar todos os veículos no sistema;
- `GET` /anunciar/{id}: Retornar um veículo especifico;
- `PUT` /anunciar/{id}: Atualizar informações de cadastro;
- `DELETE` /anunciar/{id}: Excluir um veículo pelo ID;

### Cadastrar veículo

- Método: `POST`
- Endpoint: /anunciar
- Descrição: Cadastrar um veículo para realizar publicação do anúncio;

```js
{
    'marca': "PEUGEOT",
    'modelo': "308cc",
    'anoModelo': "2015",
    'anoFabricacao': "2015",
    'versao': "Turbo gasolina 2P",
    'cor': "Cinza"
}
```

### Listar todos os veículos anúnciados

- Método: `GET`
- Endpoint: /anunciar
- Descrição: Retorna a lista de todos os veículos anúnciados no sistema.

**Exemplo JSON**

```js
{
    "id": 1
    "marca": "PEUGEOT",
    "modelo": "308cc",
    "anoModelo": "2015",
    "anoFabricacao": "2015",
    "versao": "Turbo gasolina 2P",
    "cor": "Cinza"
    // ... outros anúncios
}
```

### Retornar um veículo especifico;

- Método: `GET`
- Endpoint: /anunciar/{id}
- Descrição: Retorna um veículo específico com base no seu ID.

**Exemplo JSON**

```js
{
    'id': 1
    'marca': "PEUGEOT",
    'modelo': "308cc",
    'anoModelo': "2015",
    'anoFabricacao': "2015",
    'versao': "Turbo gasolina 2P",
    'cor': "Cinza"
}
```

### Editar informações de cadastro

- Método: `PUT`
- Endpoint: /anunciar/{id}
- Descrição: Editar um anúncio existente com base no seu ID.

**Exemplo JSON**

```js
{
    'marca': "PEUGEOT",
    'modelo': "308cc",
    'anoModelo': "2015",
    'anoFabricacao': "2015",
    'versao': "Turbo gasolina 2P",
    'cor': "Cinza"
}
```

### Deletar anúncio

- Método: `DELETE`
- Endpoint: /anunciar/{id}
- Descrição: Deleta um anúncio do sistema com base no seu ID.


## Cadastro

**Campos da requisição**

| Campo | Tipo | Obrigatório | Descrição
|-------|------|:-------------:|---
| id | id | Sim | O id precisa ser diferente para cada usuário
| nome | String | Sim | Campo para nome do usuário
| email | String | Sim | Campo para email do usuário
| senha | String | Sim | Campo para senha de acesso
| numContato | String | Sim | Campo para telefone de contato
| cep | String | Sim | Campo para cep do usuário
| estado | String | Sim | Campo para o estado na qual o usuário se localiza
| cidade | String | Sim | Campo para a cidade na qual o usuário se localiza
| veiculo | String | Sim | Campo para o veículo cadastrado

**Descrição dos endpoints**

- `POST` /cadastro: Cadastrar um novo usuário;
- `GET` /cadastro: Listar todos os usuários cadastrados no sistema;
- `GET` /cadastro/{id}: Retornar um usuário especifico;
- `PUT` /cadastro/{id}: Atualizar informações de usuário;
- `DELETE` /cadastro/{id}: Excluir um usuário pelo ID;

### Cadastrar usuário

- Método: `POST`
- Endpoint: /usuario
- Descrição: Cadastrar um novo usuário;

**Exemplo JSON**

```js
{
	"nome": "Matheus Araujo",
	"email": "matheus.araujo@hotmail.com",
	"senha": "Math@23",
	"numContato": "11945678456",
	"cep": "08380074",
	"estado": "SP",
	"cidade": "Santo André",
	"veiculo": {
		"id": 1,
		"marca": "PEUGEOT",
		"modelo": "308cc",
		"anoModelo": "2015",
		"anoFabricação": "2015",
		"versao": "Turbo gasolina 2P",
		"cor": "Cinza"
	}
}
```

### Listar todos os usuários cadastrados

- Método: `GET`
- Endpoint: /usuario
- Descrição: Retorna a lista de todos os usuários cadastrados no sistema no sistema.

**Exemplo JSON**

```js
{
	"id": 1,
	"nome": "Matheus Araujo",
	"email": "matheus.araujo@hotmail.com",
	"senha": "Math@23",
	"numContato": "11945678456",
	"cep": "08380074",
	"estado": "SP",
	"cidade": "Santo André",
	"veiculo": {
		"id": 1,
		"marca": "PEUGEOT",
		"modelo": "308cc",
		"anoModelo": "2015",
		"anoFabricação": "2015",
		"versao": "Turbo gasolina 2P",
		"cor": "Cinza"
	}
    // ... outros usuários
}
```

### Retornar um usuário especifico;

- Método: `GET`
- Endpoint: /usuario/{id}
- Descrição: Retorna um usuário específico com base no seu ID.

**Exemplo JSON**

```js
{
	"id": 1,
	"nome": "Matheus Araujo",
	"email": "matheus.araujo@hotmail.com",
	"senha": "Math@23",
	"numContato": "11945678456",
	"cep": "08380074",
	"estado": "SP",
	"cidade": "Santo André",
	"veiculo": {
		"id": 1,
		"marca": "PEUGEOT",
		"modelo": "308cc",
		"anoModelo": "2015",
		"anoFabricação": "2015",
		"versao": "Turbo gasolina 2P",
		"cor": "Cinza"
	}
}
```

### Editar informações de cadastro

- Método: `PUT`
- Endpoint: /usuario/{id}
- Descrição: Editar um usuário existente com base no seu ID.

**Exemplo JSON**

```js
{
	"nome": "Matheus Araujo",
	"email": "matheus.araujo@hotmail.com",
	"senha": "Math@23",
	"numContato": "11945678456",
	"cep": "08380074",
	"estado": "SP",
	"cidade": "Santo André",
	"veiculo": {
		"id": 1,
		"marca": "PEUGEOT",
		"modelo": "308cc",
		"anoModelo": "2015",
		"anoFabricação": "2015",
		"versao": "Turbo gasolina 2P",
		"cor": "Cinza"
	}
}
```

### Deletar usuário

- Método: `DELETE`
- Endpoint: /usuario/{id}
- Descrição: Deleta um usuário no sistema com base no seu ID.

---

**Códigos de Retorno**

| Código | Descrição
|-|-
| 200 | Requisição bem-sucedida
| 201 | Veículo cadastrado com sucesso
| 204 | A requisição foi bem-sucedida, mas não há conteúdo para retornar.
| 400 | Os campos enviados são inválidos
| 404 | Página não encontrada
| 405 | Método não permitido
| 500 | Erro interno do servidor