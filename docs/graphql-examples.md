# Exemplos GraphQL

A aplicação expõe GraphQL em /graphql. Com a configuração local, a interface GraphiQL fica em /graphiql.

Os exemplos refletem o schema atual em src/main/resources/graphql/schema.gqls. IDs retornados pelas mutations são UUIDs; reutilize-os nos próximos passos. O schema ainda não tem consulta de evento e não expõe partnerId no tipo Event nem ticketId no tipo Subscribe.

## Consultar cliente

```graphql
query CustomerOfId($id: ID!) {
  customerOfId(id: $id) {
    id
    name
    email
    cpf
  }
}
```

Variáveis:

```json
{
  "id": "UUID-retornado-ao-criar-o-cliente"
}
```

## Consultar parceiro

```graphql
query PartnerOfId($id: ID!) {
  partnerOfId(id: $id) {
    id
    name
    email
    cnpj
  }
}
```

## Criar cliente

CPF deve usar o formato pontuado validado pelo value object atual.

```graphql
mutation CreateCustomer($input: CustomerInput) {
  createCustomer(input: $input) {
    id
    name
    email
    cpf
  }
}
```

```json
{
  "input": {
    "name": "Ana Silva",
    "email": "ana@example.com",
    "cpf": "123.456.789-00"
  }
}
```

## Criar parceiro

CNPJ deve usar o formato pontuado validado pelo value object atual.

```graphql
mutation CreatePartner($input: PartnerInput) {
  createPartner(input: $input) {
    id
    name
    email
    cnpj
  }
}
```

```json
{
  "input": {
    "name": "Parceiro Exemplo",
    "email": "contato@example.com",
    "cnpj": "45.123.123/0001-12"
  }
}
```

## Criar evento

O partnerId deve ser o ID de um parceiro que já existe. O tipo Event no schema atual não expõe partnerId na resposta.

```graphql
mutation CreateEvent($input: EventInput) {
  createEvent(input: $input) {
    id
    name
    date
    totalSpots
  }
}
```

```json
{
  "input": {
    "name": "Evento de Exemplo",
    "date": "2026-11-15",
    "totalSpots": 100,
    "partnerId": "UUID-retornado-ao-criar-o-parceiro"
  }
}
```

## Reservar ingresso

O cliente e o evento devem existir. A regra de lotação e de não permitir duas associações do mesmo cliente ao evento é aplicada pela raiz Event.

```graphql
mutation SubscribeCustomerToEvent($input: SubscribeInput) {
  subscribeCustomerToEvent(input: $input) {
    eventId
    ticketStatus
    reservationDate
  }
}
```

```json
{
  "input": {
    "customerId": "UUID-retornado-ao-criar-o-cliente",
    "eventId": "UUID-retornado-ao-criar-o-evento"
  }
}
```

O tipo Subscribe atual não expõe ticketId, embora o Output do caso de uso contenha esse valor. Para solicitar apenas campos válidos, consulte sempre o schema atual.

