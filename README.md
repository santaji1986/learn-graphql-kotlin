# learn-graphql-kotlin

Access playground  
http://localhost:8080/graphql

Input -

```graphql
query {
    bankAccount(id: "223aafa0-838c-11ec-a8a3-0242ac120002"
    ) {
        id
        client {
            id
            firstName
            lastName
        }
        currency
    }
}
```

Output -

```json
{
  "data": {
    "bankAccount": {
      "id": "223aafa0-838c-11ec-a8a3-0242ac120002",
      "client": {
        "id": "223aafa0-838c-11ec-a8a3-0242ac120002",
        "firstName": "Santaji",
        "lastName": "Suryawanshi"
      },
      "currency": "INR"
    }
  }
}
```
