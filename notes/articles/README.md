# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/23

## Description

## Contents

# Week 03
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
