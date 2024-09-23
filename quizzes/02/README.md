# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/23

## Description
Reading Comprehension Quiz #2.

## Questions

1. What is the problem that DI is meant to solve? Use an example.

Dependency Injection (DI) is a design pattern that is intended to solve the problem of dependency management within some application object or function. If a function or object wants to use a certain service which requires certain dependencies (other functions, objects, configuration data, etc.), then it does not have to know about or construct those dependencies itself; rather, these dependencies are injected into it. Essentially, DI allows for a decoupling of a service-using component and the service itself, removing the dependency from the component by injecting it through some mechanism. As Fowler puts it, DI solves this problem by ensuring "application code is independent of the concrete implementation of a service interface."

2. What is the Inversion of Control principle, and can you think of examples of IoC from past programming courses you've had and patterns you've seen so far?

The Inversion Control principle is, essentially, when control of a program is tendered from application code (written by some programmer) to an external component (quite often a framework, as in Martin Fowler's discussions). It stands contrary to the general control paradigm used in libraries, where some programmer's custom code calls down to the library to have it perform some function. The control flow is inverted from the typical use, meaning that the external component has control, and calls to the programmer's application code as needed (eg. to configure its behaviour under some conditions).

One example I can think of from earlier courses is the use of the Java Swing framework when developing GUI applications in Java. Rather than my code and classes directly controlling the windower, compositor, etc., in the creation of GUIs on a system with a display, my code turns control over to the Swing framework. With control, this framework code can then perform its functions and operations, calling my code when necessary to help configure its behaviour as I intend. This removes dependencies from my code (my code does not have to know how to use the services of the windower, compositor, etc. directly), and the framework itself manages this through DI.

3. How does constructor-based dependency injection work?

In constructor-based dependency injection, the application class (which will receive the dependency injection) specifies all the dependencies it needs at construction time in its constructor. In this way, the DI occurs when the object is created, guaranteeing that the dependencies are injected at the outset of the lifecycle of the object.

4. Constructor-based vs setter-based dependency injection: what is one pro and one con of each?

One advantage of a constructor-based DI is that, since the DI occurs during the construction of an object, the dependencies must be injected for the object to be successfully instantiated; this guarantees that no object is initialized without the requisite dependencies specified by its constructor, and that only valid objects can be created. One disadvantage of constructor-based DI is that it can become complicated when an object has multiple constructors, a large number of initialization parameters, superclass constructors, or relies on factories for construction; in such cases, it can become complicated to manage the DI through constructors.

One advantage of a setter-based DI is that it can help navigate the constructor-complexity issue mentioned above; this is why Fowler recommends starting with a constructor-based DI technique, and then switching to a setter-based DI technique if the issues above become realized. One disadvantage is that, since setters may be invoked after construction of the object, it is therefore possible to have an invalid object constructed. Even if the setter-based DI is correctly implemented, it may be the case that the object attempts to use a service prior to receiving the dependency injection from the setter; constructor-based DI avoids this pitfall.


5. Service locator vs Dependency injection: what is one pro and one con of each?

One advantage of the Service Locator pattern is that only a single object (ie. the Service Locator) is required to connect components with all services in a system, merely by finding that service for the component. One disadvantage is that this technique may make the dependencies of some component less clear or legible to a programmer, as they cannot simply look in a single part of the code (as with a constructor-based DI) to see all dependencies; rather, they must trace calls to the Service Locator throughout the source code.

One advantage of Dependency Injection is that it helps make component dependencies more apparent - for the programmer. For example, a programmer can simply look at some object's constructor to identify the dependencies (if the DI is constructor-based). One disadvantage is that, since there is no dependency between a component and the injector, the component cannot obtain further services from the injector once it has already been so configured.


6. Would you prefer using a configuration file (such as XML) or to do DI programmatically? Defend your preference.

Personally, I prefer configuration through a static configuration file (eg. XML, JSON, plan text, etc.) over programmatic configuration. My argument for a configuration file is that it becomes agnostic to the implementation of the system or component, meaning that it does not care what language the system or component is written in. In this way, it means that no knowledge of the specific programming language is required in the configuration of a system. Additionally, it also has the added benefit of allowing a single binary to be configured differently at runtime by changing only the configuration file instead of changing the program source itself, which will then require recompilation. Although Fowler states it is hardly the case in practice that someone without specific programming language skills would have to configure a system, I myself have come across this situation many times in my career, especially when I write applications for use by other engineers who are not software engineers. This allows other individuals to modify system configuration without any programming knowledge or specific tools (just a text editor!), and requires no recompilation for configuration changes.

7. Provide a small example of a Spring configuration file with a single Bean called AddressBook.

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="AddressBook"
        class="Spring.AddressBook.AddressBook">
    </bean>
</beans>

8. What does auto-wiring achieve?

Auto-wiring is, essentially, the process by which the Spring framework resolves a bean's collaborators (ie. other beans). It does this by inspecting the contents of the `ApplicationContext` to identify these collaborations. It achieves a reduction in the number of property specifications or constructor arguments required (since they are automatically supplied by the framework. Additionally, it allows for continual updates to bean configuration during the lifetime of beans and their collaborators. Auto-wiring therefore provides a convenient way to associate beans and their collaborators with less explicit instruction.

9. What does component scanning achieve?

Spring's component scanning is a mechanism that allows for the scanning of some package's contents in order to find any classes that have the `@Component` annotation. When such classes are found, they will be registered as Spring bean definitions within the active container.

10. What are meta-annotations? Give an example from Spring.

Meta-annotations are simply annotations that can be applied to other annotations (hence the `meta` qualifier, as they act on their own type). Essentially, applying a meta-annotation to some other annotation instructs Spring to treat the annotated-annotation in the same way as the meta-annotation. For example, as provided in the assigned readings, consider the following example from the assigned readings:

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component 
public @interface Service { ... }

In the example above, the `@Component` annotation is a meta-annotation applied to the `@Service` annotation, instructing Spring to treat `@Service` in the same was it would `@Component`.


11. What is the difference between Active Record and Data Mapper?

The Active Record ORM pattern provides a one-to-one mapping of each model class to a database table, and also a one-to-one mapping of each model instance to a row in that table. In this way, the Active record tightly couples the object-oriented objects and the relational tables.

The Data Mapper pattern, as opposed to Active Record, actually provides an additional layer that sits between the logic tier and the persistence tier. This layer provides the mapping, meaning that the object-oriented objects and the relational tables remain decoupled.

Thus, the coupling between the object-oriented objects and the relational tables is the main difference between the two ORM patterns.

12. Give one example of impedance mismatch between OO and relational paradigms, and a ORM pattern to handle it.

One impedance mismatch occurs with references (OO) and primary or foreign keys (relational). In order to bridge this mismatch, ORM provides the Identity Field Structural Mapping Pattern. By giving an object an identity field, the object can referenced using OO techniques (supply the ID to identify the object) and by relational techniques (lookup the identity field as the key).

13. A Library has many Books. Write the code fragment of the Library Entity that shows this, complete with relevant JPA annotations.

@Entity
public class Library {
    
    // Identity field 
    @ID
    @GeneratedValue
    private Long id;

    // Relationship mapping
    @OneToMany(mappedBy = "library")
    private ArrayList<Book> books;

    // Default Constructor (required)
    public Library() { ... }

    // Additional methods...

}


}

