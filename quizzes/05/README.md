# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/10/13

## Description
SYSC 4806 Readign Comprehension Quiz 5 questions and answers.

## Assignment
Reading assignment: chapter 6 of textbook (1st edition) (I've directly uploaded the PDF here as the link to the web site seems broken right now): SaaS Client Framework: JavaScript Introduction. You can skip section 6.7 "Testing JavaScript and AJAX". 

# Questions

## 1. What changes on the server side when moving from a traditional server-centric SaaS app to a Single Page Application?
Traditional server-centric SaaS apps typically have the server-side render complete "chunks" of HTML, which are sent to the client application for it to "plug into" its currently rendered HTML page. Single Page Applications, however, typically have their server-side receive structured encoded data from one or more services, and then use that data to synthesize or modify content on the current page.

## 2. What changes on the client side?
From an end-user or client side perspective, once the initial page is loaded and rendered in the browser, no further loads or renders occur on the client side even though elements on the page are updated continuously in response to communication with the server. The server appears to the client app as one or several endpoints that return encoded data to the client-side code to act on. Thus, a single page can evolve dynamically without a reload. In a traditional, server-centric SaaS app, pages are loaded with each new request from the client application to the server. Thus, a Single Page Application can be said to offer a more seamless user experience on the client side.

## 3. Describe two ways of dealing with JavaScript incompatibilities among browsers.
One way of dealing with JavaScript incompatibilities among browsers is to restrict applications to using language features in the ECMAScript 3 standard, which is supported by all browsers.

Another way of dealing with JavaScript incompatibilities among browsers is through the use of the jQuery library, which removes the dependency on individual browsers' JSAPIs when interacting with HTML documents.

These two techniques illustrate the concepts of graceful degradation and unobtrusiveness that are inherent to JavaScript.

## 4. Is it sufficient to perform user input validation on the client side? Why or why not?
While client-side input validation can be helpful in reducing the burden on the server by screening some input, it should not be relied upon as the sole input validation method. Server-side validation should always be conducted prior to processing data on the server. This practice helps mitigate data integrity concerns during transmission (eg. if user input is validated on client-side but then is intercepted and changed during transmission).



## 5. Write a JavaScript object that has a field called "name" with value "Joe" and a field called "surname" with value "Smith".

const person = {name:"Joe", surname:"Smith"};

## 6. Describe a technique to organize JavaScript functions so that they don't litter the global namespace.

One technique to mitigate global namespace clutter is to define only a small number of objects (one or a few) in the global namespace, and then have all JavaScript functions be the values of properties of those globally-defined objects. With functions stored as object properties, a single object can collect a set of related functions similarly to how a class would, and the global namespace is not muddied.


## 7. What is the asset pipeline and what does it achieve?

The asset pipeline refers to the automatic behaviour by a browser to support and serve JavaScript content in a well-defined way.

It achieves the following: the concatenation of all JavaScript files within a directory; the compression of all resultant files through stripping and simple transformations; the placement of the resultant compressed files into a single large file in a public subdirectory for service by the presentation tier; and the adjustment of URLs emitted by "javascript_include_tag" so that the browser can load the jQuery library in addition to JavaScripts files.

## 8. How does one create a new object in JavaScript? How is it different from class instantiation in Java or other class-based OO languages?

To create a new object in JavaScript, which does not inherently have the concept of classes or instance methods, the "new" keyword is used. A function may be considered a "constructor" if it uses the "new" keyword to create and return a new object. This is different from class instantiation in an OO language, such as Java, where there is a specialized "constructor" function that must be provided by each class in order to instantiate its class objects.

## 9. List a few JQuery methods that can be used to modify the DOM of the current HTML page.
JQuery methods that can be used to modify the DOM of the current HTML page include:
addClass(), removeClass(), insertBefore(), insertAfter(), replaceWith(), clone(), hide(), slideUp(), fadeOut()

## 10. Make sure to watch screencast 6.4.1, and ideally play around with a simple HTML page that includes some JQuery, just like the instructor in the video did. What is the JQuery code for hiding all table rows?
The JQuery code for hiding all table rows is as follows:

jQuery('tr').hide()
or
$('tr').hide()

This code operates by selecting all <tr> elements (ie. table rows), and invoking the hide() method on each of them, which actually manipulates each <tr> element to include the inline CSS styling attribute, style="display:none;".

## 11. Now write JQuery code that binds a function that: hides the element on: the 'click' event to: all table rows.

$('tr').click(function(){
  $(this).hide();
});

## 12. Write JQuery code to run a function called "init" defined inside an object called "AddressBook" when the document has been fully loaded and ready.

// The AddressBook object with init function.
const AddressBook = {
    
    init() {
       // implementation goes here     
    }
    // ...

};

// Event Handler on DoM content load
document.addEventListener("DOMContentLoaded", AddressBook.init());

## 13. What are the steps required for "AJAX on Rails/Spring" programming?
"AJAX on Rails/Spring" programming consists of the following steps:
1. Create a controller action to generate a chunk of HTML for insertion into page.
2. Construct a RESTful URI in JavaScript and use XHR to send HTTP request to server (using jQuery to help call XHR).
3. Provide an event handler callback that will be triggered when the server responds successfully or there is an error.
4. When the response arrives in the browser, pass the response content to callback function and issue.

## 14. How can graceful degradation be achieved in AJAX?
In AJAX, graceful degradation can be achieved through a technique known as "hijacking", where the built-in behaviour of an element is "hijacked" by attaching an explicit JavaScript event handler to it that will override its behaviour.

## 15. What needs to be done in a JQuery AJAX call to ensure that the response is in JSON format?
To ensure that the response is encoded as JSON, the 'dataType: "json"' property should be specified. This functions like the HTTP header ('Content-type: application/json').
