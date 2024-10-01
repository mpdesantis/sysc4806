# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/30

## Description
Reading Comprehension Quiz #3.

# Questions and Answers

## Q1: What problem does the Front Controller solve? Name an alternative pattern that could be used when the application is a simple one.

The Front Controller pattern solves the problem of input controller behaviour being scattered across multiple objects. It does this by channeling all requests through a single handler object at the "front" of the application which consolidates all request handling. This object carries out common behaviour for all requests up front, and then dispatches to other objects for behaviour particular to each request as appropriate.

When the application is a simple one, the Page Controller, other Input Controller pattern described by Fowler, is likely adequate. The Page Controller pattern uses a controller for every page on a web site; thus, if a site has few pages, this pattern is apt; if the site is more complex, it may be beneficial to use the Front Controller pattern to manage the complexity and reduce code.

## Q2: (may need to investigate this a little) What is a Servlet? Name a Servlet container implementation.

According to Oracle's official java documentation, a servlet is a Java class that may be used to extend certain capabilities of servers which are accessed by host applications using a request-response programming model. Many Java servlets respond to HTTP requests in order to facilitate web applications. One example of a servlet container implementation is Tomcat.

## Q3: What does the DispatcherServlet do?

The DispatcherServlet is a servlet that performs the dispatching of incoming HttpRequests to the appropriate controllers and handlers of the web application. It is a core component of the Spring MVC framework, and acts as the front controller for a Spring MVC application, with all requests flowing through it.

## Q4: What 3 annotations does @SpringBootApplication replace, and what does each do?

The @SpringBootApplication meta-annotation replaces the @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan.

The @EnableAutoConfiguration annotation instructs Spring Boot to automatically attempt to configure Spring based on the jar dependencies added to the application.

The @SpringBootConfiguration annotation permits the registration of extra beans in the context or import of additional configuration classes, aiding in configuration detection.

The @ComponentScan annotation enables the automatic scanning and inclusion of Spring components, including @Configuration classes.

## Q5: What does @RequestMapping achieve?

@RequestMapping is a stereotype annotation, meaning that it annotates its class or method as playing a particular role or stereotype. The @RequestMapping annotation functions to provide routing information to incoming requests, mapping requested domain paths (URIs) to methods for service of those requests.

## Q6: What happens to what is returned by the controller method?

There are many different possible return values of a controller method, as per the Spring documentation, with many different behaviours. However, the general pattern is that the return values are "resolved" or "rendered" in some appropriate way based on their specific type. For example, if a String naming a View is returned, the appropriate ViewResolver will resolve the name to an actual View implementation, rendering the View. Alternatively, return values such as HttpHeaders or ErrorResponse will render HTTP headers in a response, or an error response with details in the body, respectively.

## Q7: What does the ViewResolver do?

The ViewResolver is a component of the Spring MVC framework which translates view names (as defined in an @Controller) to actual View implementations. ViewResolvers are typically found in applications with a UI, and are used to determine what type of Views are served and how they are served.

## Q8: Show one way to map input parameters of a request to values that the controller can use.

One way to map input parameters of a HttpRequest to values for use by a controller is through the use of the @RequestMapping annotation in conjunction with the @RequestParam annotation. The specified input parameters of the request will be made available to a controller method by providing them as method parameters preceded by the @RequestParam annotation. As such, request values are mapped to method parameters, which may then be used in the controller method internals. See question 10 for an example.

## Q9: What is the Model object, found as a controller parameter, used for?

The Model object, as a parameter of a controller method, represents the Model upon which the Controller component will act. Essentially, the Model object is a simple container for model data and attributes. When a controller specifies a Model parameter, that means that it may be argued a Model object to act upon in some way (eg. adding/removing attributes, reading attributes, etc.). The Spring documentation calls it a "glorified hashmap, in simplest terms".

## Q10: Write a controller method called "doubler" for a GET request to path "/", which takes an integer as a parameter called "myParam" and multiplies than integer by two, and injects the result as parameter "result" into some view template called "hello" (assume this template exists).

```java
@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping("/")
	public Integer doubler(@RequestParam("myParam") Integer myParam, Model model) {

        // Double the value of `myParam`, bind to `result`
		Integer result = 2 * myParam;

        // Add the `result` value as an attribute `result` to argued `model`
        model.addAttribute("result", result);

        // Return the view name "hello" for the ViewResolver component to resolve to
        // the "hello" view template (which exists).
        return "hello";

	}
}
```

Thanks!
