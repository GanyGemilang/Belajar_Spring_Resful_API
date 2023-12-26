# Contact API Spec

## Create Contact

Endpoint: POST /api/contacts

Request Header:

- X-API-TOKEN : Token (mandatory)

Request Body:
```json
{
  "firstName" : "Gany",
  "lastName" : "Gemilang",
  "email" : "ganygemilangg@gmail.com",
  "Phone" : "082162543756"
  
}
```

Response Body (Success):
```json
{
  "data" : {
    "id" : "random string",
    "firstName" : "Gany",
    "lastName" : "Gemilang",
    "email" : "ganygemilangg@gmail.com",
    "Phone" : "082162543756"

  }
}
```

Response Body (Failed):
```json
{
  "errors" : "email format invalid"
}

```

## Update Contact

Endpoint: PUT ap/contacts/{id}

Request Header:

- X-API-TOKEN : Token (mandatory)

Request Body:
```json
{
  "firstName" : "Gany",
  "lastName" : "Gemilang",
  "email" : "ganygemilangg@gmail.com",
  "Phone" : "082162543756"
}
```

Response Body (Success):

```json
{
  "data" : {
    "id" : "random string",
    "firstName" : "Gany",
    "lastName" : "Gemilang",
    "email" : "ganygemilangg@gmail.com",
    "Phone" : "082162543756"

  }
}
```

Response Body (Failed):

```json
{
  "errors" : "email format invalid"
}

```

## Get Contact

Endpoint: GET /api/contacts/{idContact}

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "data" : {
    "id" : "random string",
    "firstName" : "Gany",
    "lastName" : "Gemilang",
    "email" : "ganygemilangg@gmail.com",
    "Phone" : "082162543756"

  }
}
```

Response Body (Failed):
```json
{
  "errors" : "Contact is not found"
}
```
## Search Contact

Endpoint: GET api/contacts

Query Param:
- name : String, contact first name or lastname, using like query, optional
- phone : String, contact phone, using like query, optional
- email : String, contact email, using like query, optional
-  page : Integer, start from 0
- size : Integer, default 10


- X-API-TOKEN : Token (mandatory)

Response Body (Success):
```json
{
  "data" : [
    {
      "id" : "random string",
      "firstName" : "Gany",
      "lastName" : "Gemilang",
      "email" : "ganygemilangg@gmail.com",
      "Phone" : "082162543756"
    }
  ],
  "paging" : {
    "currentPage" : 0,
    "totalPage" : 10,
    "Size" : 10
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Unauthorized"
}
```

## Remove Contact

Endpoint: DELETE /api/contacts/{idContact}

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "data" : "OK"
}
```

Response Body (Failed):

```json
{
  "errors" : "Contact is not found"
}
```