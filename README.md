# QLRM sample project to demonstrate issue 'No Dialect mapping for JDBC type: 1111'
Applied workaround suggested by [@simasch](https://github.com/simasch), casting the UUID type to varchar in the projection bean.

### How to use
Create database on PostgreSQL (version 12.x or later) using SQL file placed in src/main/resources folder and launch the Spring Boot application:
* it/deepcyber/sample/data/SampleDataApplication

The custom repository in it/deepcyber/sample/data/repositories/custom/impl will be called by the command line runner, demonstrating the error.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [QLRM - Query Langugage Result Mapper](https://github.com/72services/qlrm)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Why QLRM is better than JPA 2.1 Contructor Result](https://github.com/72services/qlrm/blob/main/ConstructorResult.md)
