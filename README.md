# hal-test

Demonstrating an issue with swagger and RepositoryRestResource
Swagger2 is showing the returntype as

"_embedded": [
    {
      "id": "string",
      "name": "string"
    }
  ],
but is returned as

"_embedded": {
    "guys": []
  },
it seems like springfox is not taking in
@RepositoryRestResource( collectionResourceRel = "guys",itemResourceRel = "guy")