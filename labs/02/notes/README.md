# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/22

## Description

## Contents

## Notes
Relevant notes.

## Oracle Documentation: Using the Java Persistence API in Desktop Applications

### Entity Declarations
#### `javax.persistence.Entity`
- Entity classes become tables in a RDB.
- Entities must be top-level classes (no enums or interfaces).
- Entity class must be non-final, no final methods or final persistent instance variables.
- Annotation:
- ```java
  @Entity
  public class <className> { ... }
  // Creates table: CLASSNAME
- ```
- Instance variables and getters/setters
  - Can annotate instance variables _or_ getters/setters, but _not_ both.
  - Prefer annotated property accessors (getters/setters).
- Must have a primary key 
  - Can be a single field or compound field
- Key fields must have one of the following types:
    - primitive type (like int, long, etc)
    - wrappers for primitive types ( Integer, Long, etc)
    - java.lang.String
    - java.util.Date
    - java.sql.Date
- Annotations
```bash
@Id // Primary key
@GeneratedValue  // Autogenerate
public long getId() {}

@Transient // NO persistence 
public String someMethod() {}

@OneToOne 
public String someMethod() {}

@OneToMany
public String someMethod() {}

@ManyToOne 
public String someMethod() {}

@ManyToMany
public String someMethod() {}

// Mappings
@ Entity // use default unqualified class name for entity
@ Entity (name="SomeNewName") // override the name for entity
public Class ThisClass {
    @ManyToMany(mappedBy = "OtherClass") # foreign key in OtherClass table
    public String someMethod() {}
}

// Override an instance variable / colum name from default
// SOMEINSTANCEVAR -> NEWCOLUMNAME
private int someInstanceVar; // 
@Column(name-"NEWCOLUMNNAME")
public String getSomeInstanceVar {}
```

### Persistence Units
- Persistence Unit
  - The set of entities in your application.
  - Must be specified in `$PROJECT/src/META-INF/persistence.xml`.
- Important elements:
  - `persistence-unit`
  - `provider`
  - `class`
  - `property`

### EntityManager
- Create the `EntityManager`.
```java 
// Create the EntityManager, eg. in main()
EntityManagerFactory factory = Persistence.createEntityManagerFactory("name");
EntityManager em = factory.createEntityManager();
```
- Find an Entity by primary key
```java
// The EntityManager, em, has already been created at this point.
...            
// Retrieve Player entities using their keys.
for(long primaryKey = 1; primaryKey < 10; primaryKey++) {
    Player player = em.find(Player.class, primaryKey);
    if (player != null) {
        System.out.println(player.toString());
    }     
}
```

