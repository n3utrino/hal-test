# hal-test

Demonstrating an issue with swagger and RepositoryRestResource
Swagger2 is showing the returntype as

```:json
{
  "content": [
    {
      "id": "string",
      "name": "string"
    }
  ],
  "links": [
    {
      "href": "string",
      "rel": "string",
      "templated": true
    }
  ]
}
```

but the request returns
```:json
{
  "_embedded": {
    "guys": []
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/guys"
    },
    "profile": {
      "href": "http://localhost:8080/profile/guys"
    },
    "search": {
      "href": "http://localhost:8080/guys/search"
    }
  }
}```
