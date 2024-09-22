# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/22
* Submission: SYSC 4101 A Lab 2

## Description
SYSC 4806A Lab 2 Submission.

## Configuration
The code submitted here was developed and compiled on an Ubuntu 22.04 LTS machine with the folowing Java versions:
```bash
$ java --version
openjdk 21.0.4 2024-07-16
OpenJDK Runtime Environment (build 21.0.4+7-Ubuntu-1ubuntu222.04)
OpenJDK 64-Bit Server VM (build 21.0.4+7-Ubuntu-1ubuntu222.04, mixed mode, sharing)
```

## Usage
Run the test suite through IntelliJ Ultimate Edition, configured as per lab manual instructions. The following two test classes have been defined:
1. `AddressBookTest.java`
2. `BuddyInfoTest.java`

## Sample Output
Sample output of the above-mentioned test suites, as executed on my machine.

### `AddressBookTest.java`
```bash
/home/mdesantis/.jdks/openjdk-21.0.1/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/lib/idea_rt.jar=41261:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/lib/idea_rt.jar:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/plugins/junit/lib/junit5-rt.jar:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/plugins/junit/lib/junit-rt.jar:/home/mdesantis/school/sysc/4806a/sysc4806/labs/02/desantis-michael-sysc4806-lab02/target/test-classes:/home/mdesantis/school/sysc/4806a/sysc4806/labs/02/desantis-michael-sysc4806-lab02/target/classes:/home/mdesantis/.m2/repository/junit/junit/4.13.1/junit-4.13.1.jar:/home/mdesantis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/jakarta.persistence/2.2.3/jakarta.persistence-2.2.3.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.jpa/4.0.2/org.eclipse.persistence.jpa-4.0.2.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.asm/9.5.0/org.eclipse.persistence.asm-9.5.0.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.core/4.0.2/org.eclipse.persistence.core-4.0.2.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.jpa.jpql/4.0.2/org.eclipse.persistence.jpa.jpql-4.0.2.jar:/home/mdesantis/.m2/repository/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.jar:/home/mdesantis/.m2/repository/org/xerial/sqlite-jdbc/3.7.2/sqlite-jdbc-3.7.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 AddressBook.BuddyInfoTest
[EL Warning]: metadata: 2024-09-22 18:00:41.965--ServerSession(915349526)--Element [field buddies] within entity class [class AddressBook.AddressBook] uses a collection type [class java.util.ArrayList] when the Jakarta Persistence specification only supports java.util.Collection, java.util.Set, java.util.List, or java.util.Map.  This type is supported with eager loading; using lazy loading with this collection type requires additional configuration and an IndirectContainer implementation that extends [class java.util.ArrayList] or setting the mapping to use basic indirection and the type to be ValueholderInterface.
[EL Info]: 2024-09-22 18:00:41.989--ServerSession(915349526)--EclipseLink, version: Eclipse Persistence Services - 4.0.2.v202306161219
[EL Info]: connection: 2024-09-22 18:00:42.085--Not able to detect platform for vendor name [SQLite[3.7.2, 3]]. Defaulting to [org.eclipse.persistence.platform.database.DatabasePlatform]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property "eclipselink.target-database".
[EL Warning]: metadata: 2024-09-22 18:00:42.096--ServerSession(915349526)--Reverting the lazy setting on the OneToOne or ManyToOne attribute [buddies] for the entity class [class AddressBook.AddressBook] since weaving was not enabled or did not occur.
[EL Warning]: 2024-09-22 18:00:42.143--ServerSession(915349526)--Exception [EclipseLink-4002] (Eclipse Persistence Services - 4.0.2.v202306161219): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: java.sql.SQLException: [SQLITE_ERROR] SQL error or missing database (near "CONSTRAINT": syntax error)
Error Code: 0
Call: ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)
Query: DataModifyQuery(sql="ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)")
testPersistence(): PASS
testBuddyInfo(): PASS

Process finished with exit code 0
```

### `AddressBookTest.java`
```bash
/home/mdesantis/.jdks/openjdk-21.0.1/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/lib/idea_rt.jar=37179:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/lib/idea_rt.jar:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/plugins/junit/lib/junit5-rt.jar:/home/mdesantis/opt/intellij-ultimate/idea-IU-242.21829.142/plugins/junit/lib/junit-rt.jar:/home/mdesantis/school/sysc/4806a/sysc4806/labs/02/desantis-michael-sysc4806-lab02/target/test-classes:/home/mdesantis/school/sysc/4806a/sysc4806/labs/02/desantis-michael-sysc4806-lab02/target/classes:/home/mdesantis/.m2/repository/junit/junit/4.13.1/junit-4.13.1.jar:/home/mdesantis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/jakarta.persistence/2.2.3/jakarta.persistence-2.2.3.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.jpa/4.0.2/org.eclipse.persistence.jpa-4.0.2.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.asm/9.5.0/org.eclipse.persistence.asm-9.5.0.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.core/4.0.2/org.eclipse.persistence.core-4.0.2.jar:/home/mdesantis/.m2/repository/org/eclipse/persistence/org.eclipse.persistence.jpa.jpql/4.0.2/org.eclipse.persistence.jpa.jpql-4.0.2.jar:/home/mdesantis/.m2/repository/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.jar:/home/mdesantis/.m2/repository/org/xerial/sqlite-jdbc/3.7.2/sqlite-jdbc-3.7.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 AddressBook.AddressBookTest
testAddressBook(): PASS
[EL Warning]: metadata: 2024-09-22 18:02:33.716--ServerSession(348984985)--Element [field buddies] within entity class [class AddressBook.AddressBook] uses a collection type [class java.util.ArrayList] when the Jakarta Persistence specification only supports java.util.Collection, java.util.Set, java.util.List, or java.util.Map.  This type is supported with eager loading; using lazy loading with this collection type requires additional configuration and an IndirectContainer implementation that extends [class java.util.ArrayList] or setting the mapping to use basic indirection and the type to be ValueholderInterface.
[EL Info]: 2024-09-22 18:02:33.737--ServerSession(348984985)--EclipseLink, version: Eclipse Persistence Services - 4.0.2.v202306161219
[EL Info]: connection: 2024-09-22 18:02:33.839--Not able to detect platform for vendor name [SQLite[3.7.2, 3]]. Defaulting to [org.eclipse.persistence.platform.database.DatabasePlatform]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property "eclipselink.target-database".
[EL Warning]: metadata: 2024-09-22 18:02:33.853--ServerSession(348984985)--Reverting the lazy setting on the OneToOne or ManyToOne attribute [buddies] for the entity class [class AddressBook.AddressBook] since weaving was not enabled or did not occur.
[EL Warning]: 2024-09-22 18:02:33.908--ServerSession(348984985)--Exception [EclipseLink-4002] (Eclipse Persistence Services - 4.0.2.v202306161219): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: java.sql.SQLException: [SQLITE_ERROR] SQL error or missing database (near "CONSTRAINT": syntax error)
Error Code: 0
Call: ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)
Query: DataModifyQuery(sql="ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)")

List of BuddyInfos:
------------------
	Buddy Name: Edward Eggplant
	Buddy Number: 1112366
	(id): 5
	Buddy Name: Danny Dill
	Buddy Number: 1238934
	(id): 4
	Buddy Name: Brett Banana
	Buddy Number: 1112323
	(id): 2
	Buddy Name: Carla Cranberry
	Buddy Number: 6669999
	(id): 3
	Buddy Name: Freddy Fiddlehead
	Buddy Number: 8887654
	(id): 6
	Buddy Name: Arthur Avocado
	Buddy Number: 1234567
	(id): 1

Adding buddy Arthur Avocado to AddressBook Test AddressBook 1...
Adding buddy Brett Banana to AddressBook Test AddressBook 1...
Adding buddy Carla Cranberry to AddressBook Test AddressBook 1...
Adding buddy Danny Dill to AddressBook Test AddressBook 2...
Adding buddy Edward Eggplant to AddressBook Test AddressBook 2...
Adding buddy Freddy Fiddlehead to AddressBook Test AddressBook 2...

AddressBooks:
------------
AddressBook: Test AddressBook 2
----------------
	Buddy Name: Danny Dill
	Buddy Number: 1238934
	(id): 4
	Buddy Name: Edward Eggplant
	Buddy Number: 1112366
	(id): 5
	Buddy Name: Freddy Fiddlehead
	Buddy Number: 8887654
	(id): 6
AddressBook: Test AddressBook 1
----------------
	Buddy Name: Arthur Avocado
	Buddy Number: 1234567
	(id): 1
	Buddy Name: Brett Banana
	Buddy Number: 1112323
	(id): 2
	Buddy Name: Carla Cranberry
	Buddy Number: 6669999
	(id): 3

Adding buddy Gilda Greenbean to AddressBook Test AddressBook 3...
Adding buddy Harry Habanero to AddressBook Test AddressBook 3...
Adding buddy Iggy Imbe to AddressBook Test AddressBook 3...

AddressBooks:
------------

**** Test AddressBook 2 ****
Buddy 1:
	Buddy Name: Danny Dill
	Buddy Number: 1238934
	(id): 4
Buddy 2:
	Buddy Name: Edward Eggplant
	Buddy Number: 1112366
	(id): 5
Buddy 3:
	Buddy Name: Freddy Fiddlehead
	Buddy Number: 8887654
	(id): 6

**** Test AddressBook 1 ****
Buddy 1:
	Buddy Name: Arthur Avocado
	Buddy Number: 1234567
	(id): 1
Buddy 2:
	Buddy Name: Brett Banana
	Buddy Number: 1112323
	(id): 2
Buddy 3:
	Buddy Name: Carla Cranberry
	Buddy Number: 6669999
	(id): 3

testPersistence(): PASS
Adding buddy Arthur Avocado to AddressBook Test AddressBook 1...
Adding buddy Brett Banana to AddressBook Test AddressBook 1...
Adding buddy Carla Cranberry to AddressBook Test AddressBook 1...
Removing buddy Carla Cranberry...
Removing buddy Brett Banana...
Removing buddy Arthur Avocado...
testRemoveBuddy(): PASS
Adding buddy Arthur Avocado to AddressBook Test AddressBook 1...
Adding buddy Brett Banana to AddressBook Test AddressBook 1...
Adding buddy Carla Cranberry to AddressBook Test AddressBook 1...
testAddBuddy(): PASS

Process finished with exit code 0

```

## Notes
Thanks!! Very fun lab.

