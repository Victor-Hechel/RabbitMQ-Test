# RabbitMQ-Test

Executar o ```docker-compose up``` na raiz do projeto para instanciar o RabbitMQ.

Rodar o ```mvn spring-boot:run``` em cada projeto para levantar o server que produz as mensagens e seus consumidores.


Request para adicionar mensagem na fila:

```curl
curl --location --request GET 'localhost:8080/teste' \
--header 'Content-Type: application/json' \
--data-raw '{
    "nome": "Victor",
    "idade": 20
}'
```
