# Address API Spec

## Create Address

Endpoint: POST /api/contacts/{idContact}/address

Request header:

- X-API-TOKEN : Token (mandatory)

Request Body:

```json
{
  "street": "jalan apa",
  "city" : "kota",
  "province" : "provinsi",
  "country" : "negara",
  "postalCode" : "1234"
}
```

Response Body (Success):

```json
{
  "Data": {
    "street": "jalan apa",
    "city" : "kota",
    "province" : "provinsi",
    "country" : "negara",
    "postalCode" : "1234"
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Contact not found"
}
```

## Update Address

Endpoint: PUT /api/contacts/{idContact}/address/{idAddress}

Request header:

- X-API-TOKEN : Token (mandatory)

Request Body:

```json
{
  "street": "jalan apa",
  "city" : "kota",
  "province" : "provinsi",
  "country" : "negara",
  "postalCode" : "1234"
}
```

Response Body (Success):

```json
{
  "Data": {
    "street": "jalan apa",
    "city" : "kota",
    "province" : "provinsi",
    "country" : "negara",
    "postalCode" : "1234"
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Address is not found"
}
```

## Get Address

Endpoint:GET /api/contacts/{idContact}/address/{idAddress}

Request header:

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "Data": {
    "street": "jalan apa",
    "city" : "kota",
    "province" : "provinsi",
    "country" : "negara",
    "postalCode" : "1234"
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Address is not found"
}
```

## Remove Address

Endpoint:

Request header: DELETE /api/contacts/{idContact}/address/{idAddress}

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "Data": "OK"
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Address is not found"
}
```

## List Address

Endpoint:

Request header: GET /api/contacts/{idContact}/addres

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "data" : [
    {
      "street": "jalan apa",
      "city" : "kota",
      "province" : "provinsi",
      "country" : "negara",
      "postalCode" : "1234"
    }
  ]
}
```
Response Body (Failed):
```json
{
  "errors" : "Contact is not found"
}
```