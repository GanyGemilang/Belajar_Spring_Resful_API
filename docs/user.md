# User API Spec

## Register User

Endpoint : POST /api/users

Request Body:

```json
{
  "username" : "gemilang",
  "password" : "rahasia",
  "name" : "Gany Gemilang"
}
```

Response Body (Success):

```json
{
  "data" : "OK"
}
```

Response Body (Failed):

```json
{
  "errors" : "Username must not blank, ???"
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body:

```json
{
  "username" : "gemilang",
  "password" : "rahasia"
}
```

Response Body (Success):

```json
{
  "data" : {
    "token" : "TOKEN",
    "expiredAt" : 123453545323 //millisecound
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Username or password wrong"
}
```
## Get User
Endpoint : GET /api/users/current

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "data" : {
    "username": "gemilang",
    "name" : "Gany Gemilang"
  }
}
```

Response Body (Failed):

```json
{
  "errors" : "Unauthorized"
}
```

## Update User
Endpoint : PATCH /api/users/current

Request Header:

- X-API-TOKEN : Token (mandatory)

Request Body:

```json
{
  "password" : "new password",
  "name" : "Gany Gemilang"
}
```

Response Body (Success):

```json
{
  "data" : "OK"
}
```

Response Body (Failed):

```json
{
  "errors" : "Unauthorized"
}
```

## Logout User
Endpoint : DELETE /api/users/logout

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body (Success):

```json
{
  "data" : "OK"
}
```