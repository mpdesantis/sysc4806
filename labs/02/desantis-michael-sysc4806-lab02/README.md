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
testAddressBook(): PASS
[EL Warning]: metadata: 2024-09-22 18:10:14.198--ServerSession(348984985)--Element [field buddies] within entity class [class AddressBook.AddressBook] uses a collection type [class java.util.ArrayList] when the Jakarta Persistence specification only supports java.util.Collection, java.util.Set, java.util.List, or java.util.Map.  This type is supported with eager loading; using lazy loading with this collection type requires additional configuration and an IndirectContainer implementation that extends [class java.util.ArrayList] or setting the mapping to use basic indirection and the type to be ValueholderInterface.
[EL Info]: 2024-09-22 18:10:14.225--ServerSession(348984985)--EclipseLink, version: Eclipse Persistence Services - 4.0.2.v202306161219
[EL Info]: connection: 2024-09-22 18:10:14.325--Not able to detect platform for vendor name [SQLite[3.7.2, 3]]. Defaulting to [org.eclipse.persistence.platform.database.DatabasePlatform]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property "eclipselink.target-database".
[EL Warning]: metadata: 2024-09-22 18:10:14.336--ServerSession(348984985)--Reverting the lazy setting on the OneToOne or ManyToOne attribute [buddies] for the entity class [class AddressBook.AddressBook] since weaving was not enabled or did not occur.
[EL Warning]: 2024-09-22 18:10:14.376--ServerSession(348984985)--Exception [EclipseLink-4002] (Eclipse Persistence Services - 4.0.2.v202306161219): org.eclipse.persistence.exceptions.DatabaseException
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

**** Test AddressBook 3 ****
Buddy 1:
	Buddy Name: Gilda Greenbean
	Buddy Number: 1238934
	(id): 10
Buddy 2:
	Buddy Name: Harry Habanero
	Buddy Number: 1112366
	(id): 11
Buddy 3:
	Buddy Name: Iggy Imbe
	Buddy Number: 8887654
	(id): 12

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

### `BuddyInfoTest.java`
```bash
[EL Warning]: metadata: 2024-09-22 18:10:47.15--ServerSession(447718425)--Element [field buddies] within entity class [class AddressBook.AddressBook] uses a collection type [class java.util.ArrayList] when the Jakarta Persistence specification only supports java.util.Collection, java.util.Set, java.util.List, or java.util.Map.  This type is supported with eager loading; using lazy loading with this collection type requires additional configuration and an IndirectContainer implementation that extends [class java.util.ArrayList] or setting the mapping to use basic indirection and the type to be ValueholderInterface.
[EL Info]: 2024-09-22 18:10:47.183--ServerSession(447718425)--EclipseLink, version: Eclipse Persistence Services - 4.0.2.v202306161219
[EL Info]: connection: 2024-09-22 18:10:47.281--Not able to detect platform for vendor name [SQLite[3.7.2, 3]]. Defaulting to [org.eclipse.persistence.platform.database.DatabasePlatform]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property "eclipselink.target-database".
[EL Warning]: metadata: 2024-09-22 18:10:47.292--ServerSession(447718425)--Reverting the lazy setting on the OneToOne or ManyToOne attribute [buddies] for the entity class [class AddressBook.AddressBook] since weaving was not enabled or did not occur.
[EL Warning]: 2024-09-22 18:10:47.345--ServerSession(447718425)--Exception [EclipseLink-4002] (Eclipse Persistence Services - 4.0.2.v202306161219): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: java.sql.SQLException: [SQLITE_ERROR] SQL error or missing database (near "CONSTRAINT": syntax error)
Error Code: 0
Call: ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)
Query: DataModifyQuery(sql="ALTER TABLE BUDDYINFO ADD CONSTRAINT FK_BUDDYINFO_ADDRESSBOOK_ID FOREIGN KEY (ADDRESSBOOK_ID) REFERENCES ADDRESSBOOK (ID)")
testPersistence(): PASS
testBuddyInfo(): PASS

Process finished with exit code 0
```

## Notes
Thanks!! Very fun lab.

