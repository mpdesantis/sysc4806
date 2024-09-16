# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/16

## Description
SYSC 4806 Lab 01 Submission.

## Configuration
The code submitted here was developed and compiled on an Ubuntu 22.04 LTS machine with the folowing Java versions:
```bash
$ java --version
openjdk 21.0.4 2024-07-16
OpenJDK Runtime Environment (build 21.0.4+7-Ubuntu-1ubuntu222.04)
OpenJDK 64-Bit Server VM (build 21.0.4+7-Ubuntu-1ubuntu222.04, mixed mode, sharing)
```

## Usage
From the top-level directory, build the JAR file with Maven:
```bash
$ mvn package
```
Execute the resultant JAR:
```bash
java -cp target/desantis-michael-sysc4806-lab01-1.0-SNAPSHOT.jar AddressBook.AddressBook
```

## Sample Execution
The following shows a sample execution of the JAR file:
```bash
$ java -cp target/desantis-michael-sysc4806-lab01-1.0-SNAPSHOT.jar AddressBook.AddressBook

Adding buddy Arthur Avocado...
Adding buddy Brett Banana...
Adding buddy Carla Cranberry...

**** My AddressBook ****
Buddy 1:
	Buddy Name: Arthur Avocado
	Buddy Number: 1234567
Buddy 2:
	Buddy Name: Brett Banana
	Buddy Number: 1112323
Buddy 3:
	Buddy Name: Carla Cranberry
	Buddy Number: 6669999
```

## Notes
* Some of the code submitted herein as part of `AddressBook.java` and `BuddyInfo.java` has been used (with modification) from a previous course, SYSC 3110, as referenced by the SYSC 4806 lab manual.


Thanks!!

