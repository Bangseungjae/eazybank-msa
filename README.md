# eazybank-msa
microservice 토이 프로젝트

docker keycloack command
```
docker run -d -p 7080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin -name keycloak quay.io/keycloak/keycloak:20.0.3 start-dev
```

docker zipkin command
```
docker run -d -p 9411:9411 openzipkin/zipkin
```
