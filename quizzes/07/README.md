# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/11/25

## Questions

### 1. What is the difference between https and http?

HyperText Transfer Protocol (HTTP) is an unencrypted protocol, and therefore offers little in the way of security in regards to transmitted data over the internet. HyperText Transfer Protocol Secure (HTTPS) is an extension to the HTTP protocol that uses encryption via Secure Socket Layer (SSL) / Transport Layer Security (TLS) certificates, and therefore provides extra security.

### 2. Why must web sites that require authentication be https-only?

As per my above answer, HTTP is an insecure protocol, and is therefore unauthenticated by nature. HTTPS, through the use of certificates and certificate signing authorities, provides a means of authentication. In this way, parties on either end of the HTTPS protocol have a means of ensuring packets they receive are from the authenticated party.

### 3. Why shouldn't GET requests be state changing requests, from a security point of view? Why must they be read-only operations?

From a security point of view, GET requests must be read-only operations as they transmit their query parameters in the URL string, making the content of the GET request plainly visible to anyone intercepting a GET request packet; however, this does not pose a risk to the server, as the request is only asking for data, and an interceptor of the packet will learn nothing from the server. If GET requests could modify server state and carried this modifying information in the URL, then an interceptor of the packet could see what was going to be changed on the server, and know its state without querying it. This is a security threat, as the server may require authorization to change its state, but an unauthorized interceptor could learn of its state from the GET request URL string.

### 4. Why shouldn't a POST request be also processed by a GET request?

POST requests are used to change the state of the server, and therefore have a separate mechanism. Since GET requests are read-only operations that cannot change the server state, they would not be able to impose the changes on the server state necessitated in a POST request.

### 5. What is the Same Origin Policy, how can it be circumvented, and can one protect against circumvention?

The Same Origin Policy, as explained by Jack McCracken, is a policy imposed by browsers to prevent web sites from making requests to external domains. This is intended to prevent users, who are accessing one site, from unintentionally receiving data from another without their knowledge or consent. The Same Origin Policy can be circumvented by using Cross-Site Scripting (XSS) techniques. XSS techniques and attacks an be prevented by secure design practices, such as sanitizing all input and using proper headers.

### 6. Why should input validation always be performed on the server-side and not just on the client-side?

Server-side input validation is essential because, even if input is validated on the client side, there is still a channel that the data must be transmitted across to reach the server. Because of this, it is still possible for that data to be intercepted and modified before receipt by the server; therefore, it should be up to the server to perform all validation as it receives requests. Additionally, attackers can bypass input validation methods on client-side (eg. by manipulating JavaScript), and thus server-side validation is required to prevent potentially malicious data from compromising the server.

### 7. What is CSRF, and how to protect against it?

CSRF refers to Cross-Site Request Forgery, which is when a malicious site or program manipulates the web browser of an authenticated user of some trusted site to perform an unwanted action on that site. Because the user is authenticated, it is hard for the server to discriminate between legitimate and forged requests. Protection mechanisms include token-based mitigation, and disallowing certain types of content with headers.

### 8. What is SQL injection? How to protect against it?

SQL injection is an attack that involves sending user input that contains SQL queries in the hopes that it will maliciously be processed against the server's database. If the attacker injects read requests, they may receive information they are not authorized to receive. If the attacker sends write requests, they can even change the state of the database without authorization. SQL injection can be defended against by sanitizing all input on the server before it is processed. Additionally, some languages support prepared statements over raw SQL query strings, which can be used to prevent SQL injection techniques.

### 9. Why should you treat values even from your own database as untrusted?

In security engineering, it is generally a good idea to treat everything as untrusted! Even if values in your own database are supposed to be under your system's own control, it is always possible that they have been compromised, and may have been compromised in an undetected way. For example, if security measures have failed (eg. input validation), these values could have been changed by an attacker (eg. through an SQL injection attack or a CSRF attack), and now these fraudulent values are legitimately stored in your database. If the system relies on the integrity of these values without any checks, this is a very large security vulnerability. Therefore, standard practice should be to treat these values as untrusted to close this vulnerability.

### 10. (might need some extra investigation) How can you protect against brute forcing attacks?

Brute force attacks are essentially when an attacker exhaustively tries every value for some unknown parameter that they wish to find the actual value for. For example, if an attacker were to brute force a password on a live server, they would write an algorithm to systematically try every possible password in the password space, knowing that one of these passwords must be correct. Brute force methods are often resource and time intensive, and if the target space is appropriately large (eg. a key with a large bit-length), then they are often considered infeasible by a computationally bounded adversary. To protect against them, one technique is to increase the size of the guess space that the adversary has to exhaust. For example, in the case of a private key used in encryption, the owner of that key can increase the bit-length, which will increase the possible key space by a factor of 2 for each bit added. Another technique, which is more useful in an online brute force attack (eg. guessing a password on a live server) is to introduce rate-limiting or throttling, which introduces some time interval between successive password attempts; an attacker may have millions of passwords to try, and if they are only allowed to try a few every minute, then exhausting the password space will be infeasible.

### 11. What's the difference between authentication and authorization?

Authentication is the process of verifying some entity's asserted identity based on some factor. To be authenticated, a user first asserts their identity, and then the system must perform some check to verify that asserted identity, such as by asking for a password, token, biometric input, etc. 

Authorization is the process by which some authenticated user is given permissions to perform certain actions within the context of the system. For example, a regular user may be authorized to make only read requests against a database, but an admin user (with elevated privileges) might be authorized to perform additional operations such as database writes.

### 12. What does Single Sign-On achieve?

Single Sign-On (SSO) is a mechanism by which some central Identification Provider (IdP) performs authentication of a user for multiple services offered by external Service Providers (SPs), sometimes called Relying Parties (RPs). In this way, many SPs may offload their authentication processes to a single IdP, and transfer the risk of authorization to the IdP instead of assuming it themselves. SSO achieves great convenience for the user, as they can manage a single credential for the SSO and use it to achieve authentication for many services, as the relationship between the IdP and the RPs is a one-to-many relationship. SSO has the benefit for SPs of mitigating risk by transferring the burden of authentication to the IdP who specializes in this service. Additionally, if a single service governed by the SSO is compromised, the user is protected because none of their credentials are stored on the SP's servers; however, if the IdP itself is compromised, it is a single point of failure that will result in the compromise of all services run by SPs that rely on it.

### 13. What are some of SaaS Non Functional Requirements (soft goals)?

Some SaaS Non-Functional Requirements (NFRs), grouped under general NFR categories, are as follows:
Availability: the system shall be highly available even in the case of traffic spikes
Scalability: the system shall be able to dynamically increase or reduce capacity to meet demands
Security: the system shall validate and sanitize all input
Performance: the system shall be able to service requests with less than [some specific value] of latency

### 14. What are some of the ways to address those NFRs (tasks)?

In a SaaS context, the above-mentioned NFRs can be met through the following tasks:
Availability: the system can use a load balancer to ensure that traffic is evenly distributed across available servers. The system can use highly available database redundancy in the form of hot, warm, or cold spares. 
Scalability: the system can use a tool such as Kubernetes or Ansible to spin up and spin down virtual servers as necessary to elastically meet demands.
Security: all user input can be validated at the server-side, and SQL injection attacks can be defending through the use of prepared statements.
Performance: the system can use servers with adequate compute power to process demands within the threshold of acceptable latency, and can introduce caching or database sharding to help speed up database accesses to meet latency goals.

### 15. What is an Aspect? How do you declare an aspect in Spring AOP?

An Aspect, as defined by the Spring documentation, is a "unit of modularity that enables the modularization of concerns that cut across multiple types and objects" of a system. These concerns are called cross-cutting concerns. To declare an aspect in Spring AOP, you use the @Aspect annotation.

### 16. Why is Aspect-Oriented Programming a suitable paradigm for dealing with NFRs?

As opposed to FRs, which often each precisely define some required functionality of a systems, NFRs are often more general in nature and express requirements in terms of quality that might span several different aspects of the system. As such, NFRs can be said to address cross-cutting concerns, which is what the AOP paradigm is intended to address. For example, a performance NFR might be applicable in a system at several points (login should be fast, transactions should be fast, database reads, should be fast, etc.), so the requirement is not tied to a single function. In this example, you could use AOP to introduce some common performance-improving routine at all of these points (join-points) in a modular fashion. Thus, AOP is a particularly suitable paradigm for NFRs.

### 17. What design pattern is used by Spring to implement AOP?

As discussed in class, the design pattern used by Spring to implement AOP is the Proxy Pattern. This pattern essentially introduces a proxy as an "object that represents the real object", and uses this in place of the real object to help guide system behaviour in lieu of the object itself.

### 18. What is an Advice? How do you declare an advice in Spring AOP?

According to the Spring documentation, an Advice is the "action taken by an aspect at a particular join point." As the Advice can be taken before, after, or around a particular join point, you can use the annotations @Before, @After, and @Around, respectively.

### 19. Give two examples of Spring annotations that are used to support specific aspects out of the box.

Two examples of ready-to-go annotations are @Cacheable and @Transactional.


