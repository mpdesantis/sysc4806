# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/11/25

## Questions
### 1. What is the difference between https and http?
HyperText Transfer Protocol (HTTP) is an unencrypted protocol, and therefore offers little in the way of security in regards to transmitted data over the internet. HyperTest Transfer Protocol Secure (HTTPS) is an extension to the HTTP protocol that uses encryption via Secure Socket Layer (SSL) / Transport Layer Security (TLS) certificates, and therefore provides extra security.

### 2. Why must web sites that require authentication be https-only?
As per my above answer, HTTP is an insecure protocol, and is therefore unauthenticated by nature. HTTPS, through the use of certificates and certificate signing authorities, provides a means of authentication. In this way, parties on either end of the HTTPS protocol have a means of ensuring packets they receive are from the authenticated party.

### 3. Why shouldn't GET requests be state changing requests, from a security point of view? Why must they be read-only operations?

From a security point of view, GET requests must be read-only operations as they transmit their query parameters in the URL string, making the content of the GET request plainly visible to anyone intercepting a GET request packet; however, this does not pose a risk to the server, as the request is only asking for data, and an interceptor of the packet will learn nothing from the server. If GET requests could modify server state and carried this modifying information in the URL, then an interceptor of the packet could see what was going to be changed on the server, and know its state without querying it. This is a security threat, as the server may require authorization to change its state, but an unauthorized interceptor could learn of its state from the GET request URL string.

### 4. Why shouldn't a POST request be also processed by a GET request?

POST requests are used to change the state of the server, and therefore have a separate mechanism. Since GET requests are read-only operations that cannot change the server state, they would not be able to impose the changes on the server state necessitated in a POST request.

### 5. What is the Same Origin Policy, how can it be circumvented, and can one protect against circumvention?

The Same Origin Policy, as explained by Jack McCracken, is a policy imposed by browsers to prevent web sites from making requests to external domains. This is intended to prevent users, who are accessing one site, from unintentionally receiving data from another without their knowledge or consent. The Same Origin Policy can be circumvented by using Cross-Site Scripting (XSS) techniques. XSS techniques and attacks an be prevented by secure design practices, such as sanitizing all input and using proper headers.

### 6. Why should input validation always be performed on the server-side and not just on the client-side?

Server-side input validtion is essential because, even if input is validated on the client side, there is still a channel that the data must be transmitted across to reach the server. Because of this, it is still possible for that data to be intercepted and modified before receipt by the server; therefore, it should be up to the server to perform all validation as it receives requests. Additionally, attackers can bypass input validation methods on client-side (eg. by manipulating JavaScript), and thus server-side validation is required to prevent potentially malicious data from compromising the server.

### 7. What is CSRF, and how to protect against it?
CSRF refers to Cross-Site Request Forgery, which is when a malicious site or program manipulates the web browser of an authenticated user of some trusted site to perform an unwanted action on that site. Because the user is authenticated, it is hard for the server to discriminate between legitimate and forged requests. Protection mechanisms include token-based mitigation, and disallowing certain types of content with headers.

### 8. What is SQL injection? How to protect against it?


### 9. Why should you treat values even from your own database as untrusted?

### 10. (might need some extra investigation) How can you protect against brute forcing attacks?

### 11. What's the difference between authentication and authorization?

### 12. What does Single Sign-On achieve?

### 13. What are some of SaaS Non Functional Requirements (soft goals)?

### 14. What are some of the ways to address those NFRs (tasks)?

### 15. What is an Aspect? How do you declare an aspect in Spring AOP?

### 16. Why is Aspect-Oriented Programming a suitable paradigm for dealing with NFRs?

### 17. What design pattern is used by Spring to implement AOP?

### 18. What is an Advice? How do you declare an advice in Spring AOP?

### 19. Give two examples of Spring annotations that are used to support specific aspects out of the box.

## Notes

