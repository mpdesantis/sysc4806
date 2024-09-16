# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/15

## Description
Reading Comprehenstion Quiz #1.

## Questions
1. What is the difference between "siloed" software and one that uses SOA? What are the pros and cons of each approach? Use the bookstore example to illustrate your answer.

A software application designed according to a Service Oriented Architecture (SOA) generally consists of multiple components that act as interoperable, composible services. As such, these services can be used independently of each other, and therefore can also be reused in other combinations for other applications. SOA applications also provide externalizable Application Programming Interfaces (APIs) to internal components of the application, which facilitate interoperation with other services in a well-defined manner. All access must be made through an external API requests; no service can access another service's data directly. 

Some advantages of SOA applications are:
* modularity permits high reuse potential of software components
* easy to unit test, as each exposed API can be tested
* program internals can be changed without affecting service interoperability as long as the API remains stable

Some disadvantages of SOA applications are:
* each API request is generally serviced via an internet protocol (such as HTTP), and therefore incurs networking stack overhead
* because of the independence of services, partial failures are possible and dependability may be difficult to achieve

In contrast to SOA, "siloed" software applications are applications that do not provide such externalizable interfaces like APIs; the application is "siloed" in the sense that its components are independent and sequestered, and are not available as external services.

Some advantages of siloed applications are:
* may be simpler to implement than an SOA application
* failures are generally at a system level, and therefore no planning for partial failures is required

Some disadvantages of siloed applications are:
* changes or new features are often slower to implement, and may involve changing multiple subsystems or components
* less code reuse possible

In the book store example, a SOA version of the application has all of its subsystems independent and interoperable with each other via externalized APIs. These APIs may be invoked by the different components within the application, and also by other services and applications that adhere to the API and protocol.

In contrast, the siloed version of the application has a single service API that governs all interactions with the application components. Internal components cannot access each other via APIs, and are siloed from each other.


2. What is SaaS? what are three advantages of SaaS as opposed to downloading and installing a binary?

SaaS, or Software as a Service, is a special type of SOA that delivers software and data as a service over the internet. It generally obeys the client-server design pattern, with a thin client (eg. a browser) connecting to a server to register requests and receive replies. In this way, the hosting of the server application binary does not have to take place on the client machine, and a single instance of the application may service many clients that request its services. Three advantages to using SaaS over installing a binary on a client machine are:
* since the server binary is hosted only by the providers of the service and not on client machines, upgrades may occur on the server instead of the client application (as long as API contracts remain unaltered)
* client machines require only thin client applications and not server binaries of the application, therefore reducing client-side hardware, compute, and OS requirements
* collective and concurrent access to shared server-side data from multiple clients is easily negotiated via services

3. Name two non-functional requirements expected of every SaaS.

Two non-functional requirements expected of every SaaS are:
* Scalability Requirement: the SaaS application shall be able to scale to meet demand fluctuations, such as maintaining availability during peak times or adding new users rapidly   
* Availability Requirement: the SaaS application shall always be available (ie. 24/7 availability) for communication and service

4. What are some of the advantages of using computer clusters instead of big mainframes?
Some advantages of using computer clusters instead of big mainframes are:
* Scalability - clusters may be easily expanded by switching in additional nodes via Ethernet
* Cost - studies have shown that clusters may be less expensive than "big iron" mainframes by up to a factor of 20
* Dependability - since clusters fundamentally rely on redundancy in hardware and software, dependability of the service is greatly increased

5. Say you enter the following URL in your web browser: https://abc.com/hello/world?a=b What hostname did you connect to? Which HTTP method did you use? Which port? What query term?
The following fields are used in the above URL:
* Hostname: `abc.com`
* HTTP method: `GET` (since query strings are present in URL)
* Port: 443 (HTTPS defaults to well-known port 443)
* Query term: `a=b`, where the key is `a` and the value is `b`

6. HTTP is a stateless protocol. What mechanism can a server-side app use to find out whether consecutive requests come from the same user? How does this mechanism work?

One mechanism a server-side app can use to find out whether consecutive requests come from the same user is known as "cookies." Cookies are issued from a server to a visiting client application (such as a browser) via HTTP/HTTPS, and are retained locally in the client application. Upon successive requests to the server, the client includes its cookie in the HTTP/HTTPS request in order that the server may track that client's session data. Therefore, cookies may be used by a server application to recognize subsequent requests from a specific client.

7. Write a CSS selector to match all divs with class "hello"

A CSS selector to match all divs with class "hello" would be: `div.hello`

8.  What are the tiers in the three-tiered architecture, and what are their roles?
The first tier of the three-tiered architecture is the Presentation Tier. Its role is to accept requests from clients, and present responses. For example, most web applications present an HTTP server to serve static assets upon request.

The second tier of the three-tiered architecture is the Logic Tier. Its role is to run the business logic of a server application, and dynamically generate the content requested by clients through the Presentation Tier.

The third tier of the three-tiered architecture is the Persistence Tier. Its role is to store data that must persist across stateless HTTP requests, such as a database storing user credentials, account information, etc.

9. In the _BLANK_ tier of three-tier SaaS apps, scaling is much more complicated than just adding computers.

In the _persistence_ tier of three-tier SaaS apps, scaling is much more complicated than just adding computers.

10. Which tier( s) in the three-tier architecture are involved in handling each of the following: (a) models, (b) controllers, (c) views?

a) Models - the Persistence Tier and the Logic Tier
b) Controllers - the Logic Tier and the Presentation Tier
c) Views - the Presentation Tier and the Logic Tier
