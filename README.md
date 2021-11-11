# how to unit test micronaut and kafka

from the documentation I believe we should have

```
@MicronautTest(environments = "kafka")
public class CurrencySenderTest {
```

but this makes the tests pass even though we don't use the property foo.bar

```
@MicronautTest
@Requires(property = "foo.bar", value = "stuff")
public class CurrencySenderTest {
```

## Micronaut 3.1.0 Documentation

- [User Guide](https://docs.micronaut.io/3.1.0/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.1.0/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.1.0/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature kafka documentation

- [Micronaut Kafka Messaging documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html)

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature hibernate-jpa documentation

- [Micronaut Hibernate JPA documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#hibernate)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

