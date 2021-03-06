# Part 03 - Microservices with Spring Cloud

This sections uses Spring Boot 2.0.0, instead I'll have to use Spring Boot 2.1.1, so I'll annotate the differences when needed.

1. **Introduction to Microservices**
    - Definition
    - Challenges
    - Spring Cloud
    - Microservice Advantages
    - Microservice Components
2. **Setting up Limits Microservices**
    - Initialization
    - Import project into IntelliJ IDEA
    - Enable spring-boot-devtools livereload on IntelliJ IDEA
    - Retrieving Configuration
3. **Spring Cloud Config Server**
    - Initialization
    - Import project into IntelliJ IDEA
    - Enable spring-boot-devtools livereload on IntelliJ IDEA
    - Basic Configuration
    - Git Repository
    - Setting Up Different Environments
    - Connect Service to Config Server
4. **Currency Exchange Microservices**
    - Initialization
    - Import project into IntelliJ IDEA
    - Enable spring-boot-devtools livereload on IntelliJ IDEA
    - Basic Configuration
    - Currency Exchange Controller
    - Create Multiple Run Configurations In IntelliJ-IDEA
    - Running Multiple Instances
    - JPA Connection
5. **Currency Conversion Microservices**
    - Initialization
    - Import project into IntelliJ IDEA
    - Enable spring-boot-devtools livereload on IntelliJ IDEA
    - Basic Configuration
    - Currency Conversion Controller
    - Invoking Currency Exchange Microservices
    - Improving Invokes With Feign REST Client
6. **Ribbon And Eureka**
    - Ribbon, @RibbonClient
    - Creating Eureka Service
    - Registering Services To Eureka, @EnableDiscoveryClient
7. **Zuul**
    - Creating Zuul Service
    - Activating Zuul Porxy, `@EnableZuulProxy`
    - Logging Filter, ZuulFilter
    - Sending Requests Through Zuul
8. **Distributed Tracing**
    - Spring Cloud Sleuth, Sampler
    - RabbitMQ
    - Zipkin
    - Spring Cloud Bus
    - Hystrix, `@EnableHystrix`, `@HystrixCommand`
