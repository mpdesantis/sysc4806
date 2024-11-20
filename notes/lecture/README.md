# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/11/19

# 2024/11/19: Non-Functional Requirements and Security

## Functional Requirements:
Describe system's functions.

How to capture:
* Use Case:
    * Preconditions
    * Steps
    * Postconditions
* Use Case Diagram

## Non-Functional Requirements:
Describes how a system meets its functions.
Soft goals.

How to capture:
* Some random GRL notation in slides. 

## Aspect-Oriented Programming
Aspects are a way to describe behaviour that you want to apply to multiple points in your code.
eg. Whenever these methods are being invoked, right before they are execute I want this piece of code to be executed.
Meta-aspect of this.
eg. I want this specific authentication code to be enabled right before all of these specific methods get called.

Where is the right place to validate input?
The __model__ should validate input, as it knows what's up.
The Controller should check via the Model.

Domain Driven Design


eg. Person and PersonForm
Person models a person
PersonForm performs the mapping from some form to a Person instance

Java Records
Great Data Transfer Objects (DTOs)

Spring's Approach to Aspect-Oriented programming
* Use proxy objects
* Calls to join points are intercepted by a proxy object that contains the advice.
* Pure Java proxies
* Proxies - pretend to be the real thing, but does some additional stuff


Summary
There is no system without NFRs
NFRs are typically cross-cutting concerns
    You will see them in many places
So, Aspect-Oriented Programming helps address NFRs and their cross-cutting concerns.
Don't roll your own, just use some fucking annotation magic.

