# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/23

## Description

## Contents

# Week 02
* Dependency Injection (DI)
* Object Relational Mappring (ORM)

## Inversion of Control Containers and the Dependency Injection Pattern
* Author: Martin Fowler
* Link:  https://www.martinfowler.com/articles/injection.html

### Intro
* In Java community, there are a lot of lightweight containers that help to assemble components.
* Underlying the containers is _wiring_ under the name of __Inversion of Control__.
* Fowler discusses the __Inversion of Control__ under the name of __Dependency Injection__.
* Stands incontrast to the __Service Locator__ alternative.
* Examples of lightweight containers:
    * Spring
    * PicoContainer

### Components and Services
* __Component__
    * I use component to mean a glob of software that's intended to be used, without change, by an application that is out of the control of the writers of the component. By 'without change' I mean that the using application doesn't change the source code of the components, although they may alter the component's behavior by extending it in ways allowed by the component writers.

* __Service__
    * A service is similar to a component in that it's used by foreign applications. The main difference is that I expect a component to be used locally (think jar file, assembly, dll, or a source import). A service will be used remotely through some remote interface, either synchronous or asynchronous (eg web service, messaging system, RPC, or socket.)

* I mostly use service in this article, but much of the same logic can be applied to local components too. Indeed often you need some kind of local component framework to easily access a remote service. But writing “component or service” is tiring to read and write, and services are much more fashionable at the moment.


### A Naive Example
* A class, `MovieLister`, which has a single method which takes in the name of a movie director, finds all movies by that director in some database, and returns the list of the movies.
* The `MovieLister` invokes `finder.findAll()`, whcih returns a list of all movies in the database.
* Basically, the goal is to make this method compatible with all database types, so that the method for retrieving the movies is _independent_ from how they are stored (eg. does not matter the database type).
* One solution:
    * Create a Java interface with a `findAll()` method, and then implement a concrete class for _every_ data storage alternative.
* Basically, we are developing Plugins, and we need a way to assemble all these plugins together into an application.
    * This is the problem that lightweight containers face, and universally they all do it using __Inversion of Control__.

### Inversion of Control
* The Hollywood Principle: "Don't call us, we'll call you."
* Control is handed over to some other system/component from another.
* "One important characteristic of a framework is that the methods defined by the user to tailor the framework will often be called from within the framework itself, rather than from the user's application code. The framework often plays the role of the main program in coordinating and sequencing application activity. This inversion of control gives frameworks the power to serve as extensible skeletons. The methods supplied by the user tailor the generic algorithms defined in the framework for a particular application."
    - Ralph Johnson and Brian Foote
* Is a key part of what makes a framework different than a library.
    * Library
        * A set of function that you can call, usually organized into classes.
        * Each does some work, retuirns control to the client.
    * Framework
        * Embodies some abstract design, with more behaviour built in.
        * In order to use it, you need to insert your behaviour into various places in the framework either by subclassing or by plugging in your own classes.
            * The framework's code then calls your code at the points.
        * eg. JUnit framework
            * JUnit calls `setUp` and `tearDown` for you to create your test fixture.
                * JUnit does the calling, your code reacts, and thus control is inverted.
        * eg. A Windower
            * You turn control over to the windower framework, which calls your code.
* __Dependency Injection__
    * A more specific type of Inversion of Control.
    * New breed of containers
        * The inversion is about how they look up a plugin implementation.
        * Ensure that any user of a plugin follows some convention that allows a separate assembler module to inject the implementation into the lister (in above example).
    * Basically, you remove the dependency from the application class to the plugin application.
    * ALternative: __Service Locator__ pattern

### Forms of Dependency Injection (DI)
* Three styles of DI:
    1. Constructor Injection
    2. Setter Injection
    3. Interface Injection

#### 1. Constructor Injection with PicoContainer
* The application class needs to declare a constructor that ioncludes everything it needs injected.
* This configuration code is stypically set up in a different class (either baked in, or can read from a config file to configure).

#### 2. Setter Injection with Spring
* eg. With Spring
* Create setters in your application class to accept the injection.
* Define your config in an `.xml` file, and this file is parsed to inject its config with the setter.

#### 3. Interface Injection
* Define an interface to perform the injection through.


### Using a Service Locator
* Alternative to DI.
* Basic idea:
    * Have an object that knows how to get hold of all of the services that an application might need.
#### Using a Segregated Interface for the Locator
#### A Dynamic Service Locator
#### Using both a locator and injection with Avalon

### Deciding which option to use
#### Service Locator vs Dependency Injection
#### Constructor versus Setter Injection
#### Code or configuration files
#### Separating Configuration from Use

### Some further issues

### Concluding Thoughts
The choice between Service Locator and Dependency Injection is less important than the principle of separating service configuration from the use of services within an application. 




## The IoC Container
* Link: https://docs.spring.io/spring-framework/docs/4.0.x/spring-framework-reference/html/beans.html
* Sections:
    * 4.1 - 4.41
    * 4.5
    * 4.12
    * 4.10

### 4.1 Introduction to the Spring IoC container and beans
* Bean
    * Objects that form the backbone of your Spring application.
    * An object that is instantiated, assembled, and otherwise managed by a Spring IoC (Inversion of Control) container.

### 4.2 Container overview
* Container assembles beans
* Gets its data from configuration metadata (XML, annotations, etc.)
#### 4.2.1 Configuration metadata
* XML or Java-based annotations.
#### 4.2.2 Instantiating a container
#### 4.2.3 Using the container

### 4.3 Bean overview
#### 4.3.1 Naming beans
#### 4.3.2 Instantiating beans
#### 4.4 Dependencies
#### 4.4.1 Dependency injection

### 4.12 Java-based container configuration
#### 4.12.1 Basic concepts: @Bean and @Configuration
#### 4.12.2 Instantiating the Spring container using AnnotationConfigApplicationContext
#### 4.12.3 Using the @Bean annotation
#### 4.12.4 Using the @Configuration annotation
#### 4.12.5 Composing Java-based configurations

### 4.10 Classpath scanning and managed components
#### 4.10.1 @Component and further stereotype annotations
#### 4.10.2 Meta-annotations
#### 4.10.3 Automatically detecting classes and registering bean definitions
#### 4.10.4 Using filters to customize scanning
#### 4.10.5 Defining bean metadata within components
#### 4.10.6 Naming autodetected components
#### 4.10.7 Providing a scope for autodetected components
#### 4.10.8 Providing qualifier metadata with annotations

# Week 03

## Spring Reference Documentation
* [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/2.7.8/reference/htmlsingle/)
* Sections: 4.1, 4.4, 6.1.5, and 6.2 to 6.6 inclusive.


## 4.1. Introducing Spring Boot

Spring Boot helps you to create stand-alone, production-grade Spring-based applications that you can run. We take an opinionated view of the Spring platform and third-party libraries, so that you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

You can use Spring Boot to create Java applications that can be started by using java -jar or more traditional war deployments. We also provide a command line tool that runs “spring scripts”.

Our primary goals are:

    Provide a radically faster and widely accessible getting-started experience for all Spring development.

    Be opinionated out of the box but get out of the way quickly as requirements start to diverge from the defaults.

    Provide a range of non-functional features that are common to large classes of projects (such as embedded servers, security, metrics, health checks, and externalized configuration).

    Absolutely no code generation and no requirement for XML configuration.

## 4.4. Developing Your First Spring Boot Application

This section describes how to develop a small “Hello World!” web application that highlights some of Spring Boot’s key features. We use Maven to build this project, since most IDEs support it.
	

The spring.io web site contains many “Getting Started” guides that use Spring Boot. If you need to solve a specific problem, check there first.

You can shortcut the steps below by going to start.spring.io and choosing the "Web" starter from the dependencies searcher. Doing so generates a new project structure so that you can start coding right away. Check the start.spring.io user guide for more details.

Before we begin, open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:

$ java -version
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)

$ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: /usr/local/Cellar/maven/3.3.9/libexec
Java version: 1.8.0_102, vendor: Oracle Corporation

	This sample needs to be created in its own directory. Subsequent instructions assume that you have created a suitable directory and that it is your current directory. 

## 6.1.5. Starters

Starters are a set of convenient dependency descriptors that you can include in your application. You get a one-stop shop for all the Spring and related technologies that you need without having to hunt through sample code and copy-paste loads of dependency descriptors. For example, if you want to get started using Spring and JPA for database access, include the spring-boot-starter-data-jpa dependency in your project.

The starters contain a lot of the dependencies that you need to get a project up and running quickly and with a consistent, supported set of managed transitive dependencies.


6.2. Structuring Your Code

Spring Boot does not require any specific code layout to work. However, there are some best practices that help.
6.2.1. Using the “default” Package

When a class does not include a package declaration, it is considered to be in the “default package”. The use of the “default package” is generally discouraged and should be avoided. It can cause particular problems for Spring Boot applications that use the @ComponentScan, @ConfigurationPropertiesScan, @EntityScan, or @SpringBootApplication annotations, since every class from every jar is read.
	We recommend that you follow Java’s recommended package naming conventions and use a reversed domain name (for example, com.example.project).
6.2.2. Locating the Main Application Class

We generally recommend that you locate your main application class in a root package above other classes. The @SpringBootApplication annotation is often placed on your main class, and it implicitly defines a base “search package” for certain items. For example, if you are writing a JPA application, the package of the @SpringBootApplication annotated class is used to search for @Entity items. Using a root package also allows component scan to apply only on your project.
	If you do not want to use @SpringBootApplication, the @EnableAutoConfiguration and @ComponentScan annotations that it imports defines that behavior so you can also use those instead.

The following listing shows a typical layout:

com
 +- example
     +- myapplication
         +- MyApplication.java
         |
         +- customer
         |   +- Customer.java
         |   +- CustomerController.java
         |   +- CustomerService.java
         |   +- CustomerRepository.java
         |
         +- order
             +- Order.java
             +- OrderController.java
             +- OrderService.java
             +- OrderRepository.java

The MyApplication.java file would declare the main method, along with the basic @SpringBootApplication, as follows:
Java
Kotlin

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

6.3. Configuration Classes

Spring Boot favors Java-based configuration. Although it is possible to use SpringApplication with XML sources, we generally recommend that your primary source be a single @Configuration class. Usually the class that defines the main method is a good candidate as the primary @Configuration.
	Many Spring configuration examples have been published on the Internet that use XML configuration. If possible, always try to use the equivalent Java-based configuration. Searching for Enable* annotations can be a good starting point.
6.3.1. Importing Additional Configuration Classes

You need not put all your @Configuration into a single class. The @Import annotation can be used to import additional configuration classes. Alternatively, you can use @ComponentScan to automatically pick up all Spring components, including @Configuration classes.
6.3.2. Importing XML Configuration

If you absolutely must use XML based configuration, we recommend that you still start with a @Configuration class. You can then use an @ImportResource annotation to load XML configuration files.
6.4. Auto-configuration

Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added. For example, if HSQLDB is on your classpath, and you have not manually configured any database connection beans, then Spring Boot auto-configures an in-memory database.

You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to one of your @Configuration classes.
	You should only ever add one @SpringBootApplication or @EnableAutoConfiguration annotation. We generally recommend that you add one or the other to your primary @Configuration class only.
6.4.1. Gradually Replacing Auto-configuration

Auto-configuration is non-invasive. At any point, you can start to define your own configuration to replace specific parts of the auto-configuration. For example, if you add your own DataSource bean, the default embedded database support backs away.

If you need to find out what auto-configuration is currently being applied, and why, start your application with the --debug switch. Doing so enables debug logs for a selection of core loggers and logs a conditions report to the console.
6.4.2. Disabling Specific Auto-configuration Classes

If you find that specific auto-configuration classes that you do not want are being applied, you can use the exclude attribute of @SpringBootApplication to disable them, as shown in the following example:
Java
Kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MyApplication {

}

If the class is not on the classpath, you can use the excludeName attribute of the annotation and specify the fully qualified name instead. If you prefer to use @EnableAutoConfiguration rather than @SpringBootApplication, exclude and excludeName are also available. Finally, you can also control the list of auto-configuration classes to exclude by using the spring.autoconfigure.exclude property.
	You can define exclusions both at the annotation level and by using the property.
	Even though auto-configuration classes are public, the only aspect of the class that is considered public API is the name of the class which can be used for disabling the auto-configuration. The actual contents of those classes, such as nested configuration classes or bean methods are for internal use only and we do not recommend using those directly.
6.5. Spring Beans and Dependency Injection

You are free to use any of the standard Spring Framework techniques to define your beans and their injected dependencies. We generally recommend using constructor injection to wire up dependencies and @ComponentScan to find beans.

If you structure your code as suggested above (locating your application class in a top package), you can add @ComponentScan without any arguments or use the @SpringBootApplication annotation which implicitly includes it. All of your application components (@Component, @Service, @Repository, @Controller, and others) are automatically registered as Spring Beans.

The following example shows a @Service Bean that uses constructor injection to obtain a required RiskAssessor bean:
Java
Kotlin

import org.springframework.stereotype.Service;

@Service
public class MyAccountService implements AccountService {

    private final RiskAssessor riskAssessor;

    public MyAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
    }

    // ...

}

If a bean has more than one constructor, you will need to mark the one you want Spring to use with @Autowired:
Java
Kotlin

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyAccountService implements AccountService {

    private final RiskAssessor riskAssessor;

    private final PrintStream out;

    @Autowired
    public MyAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
        this.out = System.out;
    }

    public MyAccountService(RiskAssessor riskAssessor, PrintStream out) {
        this.riskAssessor = riskAssessor;
        this.out = out;
    }

    // ...

}

	Notice how using constructor injection lets the riskAssessor field be marked as final, indicating that it cannot be subsequently changed.
6.6. Using the @SpringBootApplication Annotation

Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single @SpringBootApplication annotation can be used to enable those three features, that is:

    @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism

    @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)

    @SpringBootConfiguration: enable registration of extra beans in the context or the import of additional configuration classes. An alternative to Spring’s standard @Configuration that aids configuration detection in your integration tests.

Java
Kotlin

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Same as @SpringBootConfiguration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

	@SpringBootApplication also provides aliases to customize the attributes of @EnableAutoConfiguration and @ComponentScan.
	

None of these features are mandatory and you may choose to replace this single annotation by any of the features that it enables. For instance, you may not want to use component scan or configuration properties scan in your application:
Java
Kotlin

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration(proxyBeanMethods = false)
@EnableAutoConfiguration
@Import({ SomeConfiguration.class, AnotherConfiguration.class })
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

In this example, MyApplication is just like any other Spring Boot application except that @Component-annotated classes and @ConfigurationProperties-annotated classes are not detected automatically and the user-defined beans are imported explicitly (see @Import).
