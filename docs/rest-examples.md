# Exemplos REST

A API REST usa JSON. Inicie o banco e a aplicação conforme o README antes de executar os exemplos.

Os corpos e IDs abaixo são didáticos. Use os IDs realmente devolvidos pelas respostas anteriores; substitua os placeholders UUID por esses valores.

## 1. Criar cliente

```bash
curl -i -X POST http://localhost:8080/customers \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Ana Silva",
    "email": "ana@example.com",
    "cpf": "123.456.789-00"
  }'
```

A resposta bem-sucedida é 201 Created e contém o ID do cliente.

## 2. Criar parceiro

```bash
curl -i -X POST http://localhost:8080/partners \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Parceiro Exemplo",
    "email": "contato@example.com",
    "cnpj": "45.123.123/0001-12"
  }'
```

A resposta bem-sucedida é 201 Created. Guarde o ID do parceiro para criar o evento.

## 3. Criar evento

```bash
curl -i -X POST http://localhost:8080/events \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Evento de Exemplo",
    "date": "2026-11-15",
    "totalSpots": 100,
    "partnerId": "UUID-DO-PARCEIRO"
  }'
```

A resposta bem-sucedida é 201 Created. O caso de uso só cria o evento se o parceiro existir. Guarde o ID retornado para reservar ingresso.

## 4. Reservar ingresso para o cliente

Neste endpoint, o ID do evento é lido do caminho; o controller não usa o campo eventId do DTO recebido no corpo, então ele pode ser omitido:

```bash
curl -i -X POST http://localhost:8080/events/UUID-DO-EVENTO/subscribe \
  -H 'Content-Type: application/json' \
  -d '{
    "customerId": "UUID-DO-CLIENTE"
  }'
```

A reserva retorna 200 OK. O evento verifica duplicidade do cliente e disponibilidade de vagas. Falhas de validação capturadas pelo controller retornam 422 Unprocessable Entity.

## Consultar cliente ou parceiro

```bash
curl -i http://localhost:8080/customers/UUID-DO-CLIENTE
curl -i http://localhost:8080/partners/UUID-DO-PARCEIRO
```

Consultas existentes retornam 200 OK; IDs sem registro retornam 404 Not Found. Atualmente não há endpoint REST para consultar evento.

