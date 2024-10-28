# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/10/06

## Description
JSON queries for test against by Spring Boot web application.

## Contents
* addAddressBook1.json
* addBuddy1.json

## Procedures

### Query an AddressBook by Name
```bash
curl http://localhost:8080/addressBooks/search/findByName?name=My%20Persistent%20AddressBook

# OR

curl http://localhost:8080/addressBooks/search/findByName?name=My+Persistent+AddressBook
```

### Add an AddressBook
Usage:
```bash
curl -X POST -H Content-Type:application/json -d @addAddressBook1.json http://localhost:8080/addressBooks

curl -X GET http://localhost:8080/addressBooks/
```



## Notes

