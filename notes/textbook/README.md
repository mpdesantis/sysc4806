# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/09/15

## Description
My notes from the SYSC 4806 textbook.

## Textbook
* Fox, Armando and David Patterson. Engineering Software as a Service. 1st Ed. 2018. Web.
    - __N.B.__ 2nd Ed. available on book site; however, _not_ used in course.

# Preface xii
* SaaS as opposed to shrink-wrap software
    * Single instance servicing many customers vs. one copy per customer
* SaaS became popular at the same time as _The Agile Manifesto_.
* _The Agile Manifesto_
    * Particulary suited for SaaS
    * Behaviour Driven Design
    * Test-Driven Development
    * Pair programming
    * Scrum
* 
# 1 Introduction to SaaS and Agile Development 2
## Concepts
Each chapter opening starts with a one-page summary of that chapter's big concepts.
For this introductory chapter, they are:
• Plan-and-Document software development processes or lifecycles rely on
careful, up-front planning that is extensively documented and carefully managed to
make software development more predictable. Prominent examples are Waterfall ,
Spiral , and the Rational Unified Process (RUP) lifecycles.
• In contrast, the Agile lifecycle relies on incrementally developed prototypes that
involve continuous feedback from the customer on each iteration, each of which
takes between one to four weeks.
• Service Oriented Architecture (SOA) creates apps from components that act as
interoperable services, which allows new systems to be built from these components
with much less effort. More importantly, from a software engineering perspective,
SOA enables the construction of large services from many small ones, which history
teaches us is more likely to be successful than a single large project. One reason
is that smaller size allows use of Agile development, which has a superior track
record.
• Software as a Service (SaaS) is a special case of SOA that deploys software at
a single site but makes it available to millions of users over the Internet on their
personal mobile devices, which provides benets to both users and developers. The
single copy of the software and the competitive environment for SaaS products leads
to more rapid software evolution for SaaS than for shrink-wrapped software.
• Legacy Code evolution is vital in the real world, yet often ignored in software
engineering books and courses. Agile practices enhancing code each iteration, so
the skills gained also apply to legacy code.
• Cloud Computing supplies the dependable and scalable computation and storage
for SaaS by utilizing Warehouse Scale Computers containing as many as
100,000 servers. The economies of scale allow Cloud Computing to be offered as
a utility, where you pay only for actual use.
• Software quality is dened as providing business value to both customers and
developers. Software Quality Assurance (QA) comes from many levels of testing:
unit, module, integration, system, and acceptance.
• Clarity via conciseness, synthesis, reuse, and automation via tools are
four paths to improving software productivity . The programming framework
Ruby on Rails follows them to make SaaS developers productive. Don’t Repeat
Yourself (DRY) warns not to use repetition to achieve reuse, as there should be
one representation of each piece of knowledge.
## 1.1 Introduction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 4
* Running Example: Affordable Care Act (ACA) rollout in U.S. 
## 1.2 Software Development Processes: Plan and Document . . . . . . . . . . . . 5
* _Software Engineering_
    * Coined by Naur and Randell, 1969
    * Goal: to discover methods to build SW that were as predictable in quality, cost, time as those used to build bridges in civil engineering.
* _Plan and Document SW_
    * Plan a project and document it before implementing.
    * Sequence:
        1. Requirements Analysis and Specification
        2. Architectural Design
        3. Implementation and Integration
        4. Verification
        5. Operation and Maintenance
    * Flow is top down to completion, therefore called _Waterfall_ software development _lifecycle_.
* Software Development Lifecycles
    * _Waterfall_
        * Flow is top down to completion.
            1. Requirements Analysis and Specification
            2. Architectural Design
            3. Implementation and Integration
            4. Verification
            5. Operation and Maintenance
    * _Spiral_
        * Four phases:
            1. Determine objectives and constraints of this iteration
            2. Evaluate alternatives and identify and resolve risks
            3. Develop and verify the prototype for this iteration
            4. Plan the next iteration
    * _Rational Unified Process (RUP)_
        * Waterfall and Sprial features
        * Phases:
            1. Inception
            2. Elaboration
            3. Construction
            4. Transition
        * Engineering Disciplines:
            1. Business Modeling
            2. Requirements
            3. Analysis and Design
            4. Implementation
            5. Test
            6. Deployment
### Summary
The basic activities of software engineering are the same in all the software
development process or lifecycles, but their interaction over time relative to product re-
leases differs among the models. The Waterfall lifecycle is characterized by much of the
design being done in advance of coding, completing each phase before going on to the
next one. The Spiral lifecycle iterates through all the development phases to produce pro-
totypes, but like Waterfall, the customers may only get involved every 6 to 24 months. The
more recent Rational Unified Process lifecycle includes phases, iterations, and prototypes,
while identifying the people skills needed for the project. All rely on careful planning and
thorough documentation, and all measure progress against a plan.

## 1.3 Software Development Processes: The Agile Manifesto . . . . . . . . . . . . 11
* Many SW projects were abandoned, costing much money.
* __The Agile Manifesto__
    * _Agile Alliance_, 2001
    * Values
        * __Individuals and interactions__ over _processes and tools_
        * __Working software__ over _comprehensive documentation_
        * __Customer collaboration__ over _contract negotiation_
        * __Responding to change__ over _following a plan_
    * Test-Driven Development (TDD)
    * User stories
    * Velocity
### Summary
In contrast to the Plan-and-Document lifecycles, the Agile lifecycle work
with customers to continuously add features to working prototypes until the customer is
satisfied, allowing customers to change what they want as the project develops. Documen-
tation is primarily through user stories and test cases, and it does not measure progress
against a predefined plan. Progress is gauged instead by recording velocity , which essen-
tially is the rate that a project completes features.

## 1.4 Service Oriented Architecture . . . . . . . . . . . . . . . . . . . . . . . . . 16
* __Service-Oriented Architecture__
    * Designed to make composible services
    * Componenets of an application act as interoperable services, and can be used independently and recombined in other applications
    * Antithesis of a "SW silo"
    * Externalizable Application Programming Interfaces (APIs) to internal components
        * ie. open to external developers in other corporations and the public
    * Popularized by Amazon, facebook, etc.
    * No service can name or access another service's data; it can only make requests for data through an external API.
    * Advantages
        * Makes testing easier (test an API)
        * Tremendous reusability
    * Disadvantages
        * Each invocation of a service involves the higher cost of wading through the deeper SW stack of a network interface, resulting in performance loss
        * Dependability is challengiong because of the possibility of partial failures
### Summary
Although the term was nearly lost in a sea of confusion, Service Oriented
Architecture (SOA) just means an approach to software development in which all the
subsystems are only available as external services, which means others can recombine
them in different ways. Following the tools and guidelines in this book ensures that your
apps will be a good fit to SOA.

## 1.5 Software as a Service . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 19
* __Software as a Service (SaaS)__
    * One type of SOA.
    * Delivers software and data as a service over the intent, typically through a thin client like a browser
    * Advantages
        * Client-side computing and HW requirements are light
        * Service data kept server-side, easier for clients to manage
        * Easy to facilitative collective interaction from multiple clients
        * Easier to maintain large data or frequently-updated data server-side
        * Only a single copy of the SW runs in a tightly-controlled hardware and OS, so need for portability to various client machines
        * Easy to introduce new features quickly to retain customers
        * Only internal developers have a copy of the SW, so they can upgrade the underlying hardware frequently as long as they don't break APIs
* __Ruby on Rails (Rails)__
    * Came from an Agile community
    * Modern scripting language
    * Automatic memory managment
    * Dynamic typing
    * Metaprogramming - synthesize code at runtime
    * Closures, blocks, yields
### Summary
Software as a Service (SaaS) is attractive to both customers and providers
because the universal client (the Web browser) makes it easier for customers to use the
service and the single version of the software at a centralized site makes it easier for the
provider to deliver and improve the service. Given the ability and desire to frequently
upgrade SaaS, the Agile software development process is popular for SaaS, and so there
are many frameworks to support Agile and SaaS. This book uses Ruby on Rails

## 1.6 Cloud Computing . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 22
* SaaS places 3 demands on IT infrastructure:
    1. Communication
    2. Scalability
    3. Availability
* __Clusters__
    * Collections of small-scale computers connected by Ethernet switches
    * Advantages:
        * Scalability
        * Small operator-to-machine ratio
        * Use of Virtual machines (VMs)
        * Cheaper
        * Extensive redundancy in HW and SW for dependability
* __Public Cloud Computing__ or __Utility Computing__
    * Renting HW and SW services in data center
* __Cloud Computing__
    * Today's realization of utility computing
    * Lack of data centre no longer obstacle, just rent one


### Summary
• The Internet supplies the communication for SaaS.
• Cloud Computing provides the scalable and dependable hardware computation
and storage for SaaS.
• Cloud computing consists of clusters of commodity servers that are connected by
local area network switches, with a software layer providing sufficient redundancy
to make this cost-effective hardware dependable.
• These large clusters or Warehouse Scale Computers offer economies of scale.
• Taking advantage of economies of scale, some Cloud Computing providers offer
this hardware infrastructure as low-cost utility computing that anyone can use on
a pay-as-you-go basis, acquiring resources immediately as your customer demand
grows and releasing them immediately when it drops.

## 1.7 Beautiful vs. Legacy Code . . . . . . . . . . . . . . . . . . . . . . . . . . . 24
## 1.8 Software Quality Assurance: Testing . . . . . . . . . . . . . . . . . . . . . . 25
## 1.9 Productivity: Conciseness, Synthesis, Reuse, and Tools . . . . . . . . . . . . 26
## 1.10 Guided Tour of the Book . . . . . . . . . . . . . . . . . . . . . . . . . . . . 29
## 1.11 How NOT to Read this Book . . . . . . . . . . . . . . . . . . . . . . . . . . 32
## 1.12 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 34
## 1.13 Engineering Software is More Than Programming . . . . . . . . . . . . . . . 34
## 1.14 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 36
## 1.15 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 39
## I Software as a Service 41

# 2 The Architecture of SaaS Applications 42
## Concepts
Software architecture describes how the subsystems that make up a piece of software
are connected together to meet the application's functional and non-functional require-
ments. A design pattern describes a general architectural solution to a family of similar
problems, obtained by generalizing from the experience of developers who have solved
those problems before. Examining SaaS apps, design patterns are evident at all levels of
detail:
• SaaS apps follow the client-server pattern, in which a client makes requests and
a server responds to the requests of many clients.
• A SaaS server follows the three-tier architecture pattern, which separates the re-
sponsibilities of different SaaS server components and enables horizontal scal-
ing to accommodate millions of users.
• SaaS app code lives in the application tier. Many SaaS apps, including those
based on Rails, follow the Model-View-Controller design pattern, in which Models
deal with the app's resources such as users or blog posts, Views present information
to the user via the browser, and Controllers map the user's browser actions to
application code.
• For Models, Rails uses the Active Record pattern because it is a good t to
relational databases, the most popular way of storing SaaS data. For Views,
Rails uses the Template View pattern to create Web pages to send to the
browser. For Controllers, Rails follows the Representational State Transfer or
REST principle, in which each controller action describes a single self-contained
operation on one of the app's resources.
Modern SaaS frameworks such as Rails capture a decade's worth of developer expe-
rience by encapsulating these SaaS design patterns so that SaaS app writers can easily
apply them.

## 2.1 100,000 Feet: Client-Server Architecture . . . . . . . . . . . . . . . . . . . . 44
* __Client Server Architecture__
    * Client requests, server replies
    * Design pattern
        * A reusable structure, behaviour, strategy, or technique that captures a proven solution to a collection of similar prblems by separating the things that change from those that stay the same
    * SaaS can mean:
        * "client-server systems built to operate using the open standards of the World Wide Web"
* __Peer-to-Peer__
    * Alternate design pattern where each node is both client and server

### Summary
SaaS Web apps are examples of the client-server architectural pattern, in which
client software is typically specialized for interacting with the user and sending re-
quests to the server on the user’s behalf, and the server software is specialized for
handling large volumes of such requests.
• Because Web apps use open standards that anyone can implement royalty-free, in
contrast to proprietary standards used by older client-server apps, the Web browser
has become the “universal client.”
• An alternative to client-server is peer-to-peer, in which all entities act as both clients
and servers. While arguably more flexible, this architecture makes it difficult to
specialize the software to do either job really well.

## 2.2 50,000 Feet: Communication—HTTP and URIs . . . . . . . . . . . . . . . . 46
* __Network Protocol__
    * A set of communication rules on which agents participating in a network agree.
    * Agents are clients and server.
* __HTTP__
    * Relies on TCP/IP
        * Allows a pair of agents to communicate via ordered sequences of bytes.
    * HTTP Request:
        * `<http-method> <scheme>://<hostname>:<port>/<resource-path>/?<query-terms>#<fragment>`
        * eg. `GET http://srch.com:80/main/search?q=cloud&lang=en#top`
    * A _stateless_ protocol
        * Every request is independent of and unrelated to all previous requests
        * If an app wants to track state must provide its own mechanism for doing so, as HTTP does not
            * eg. cookies holding a user's session - client browser responsibility

* __Domain Name System__
    * Protocol for name resolution
    * Also relies on TCP/IP
* __Uniform Resource Identifier (URI)__
    * A resource generally means anything that can be delivered to the browser

### Summary
• Web browsers and servers communicate using the HyperText Transfer Proto-
col . HTTP relies on TCP/IP (Transmission Control Protocol/Internet Protocol) to
reliably exchange ordered sequences of bytes.
• Each computer connected to a TCP/IP network has an IP address such as
128.32.244.172, although the Domain Name System (DNS) allows the use of
human-friendly names instead. The special name localhost refers to the local
computer and resolves to the special IP address 127.0.0.1.
• Each application running on a particular computer must “listen” on a distinct TCP
port, numbered from 1 to 65535 (216 − 1). Port 80 is used by HTTP (Web) servers.
• To run a SaaS app locally, you activate an HTTP server listening on a port on
localhost. WEBrick, Rails’ lightweight server, uses port 3000 by default, but on
Cloud9 you must force it to use the port number specified by the $PORT environment
variable.
• A Uniform Resource Identifier (URI) names a resource available on the Internet.
The interpretation of the resource name varies from application to application.
• HTTP is a stateless protocol in that every request is independent of every other
request, even from the same user. HTTP cookies allow the association of HTTP
requests from the same user. It’s the browser’s responsibility to accept a cookie from
an HTTP server and ensure that the cookie is included with future requests sent to
that server.


## 2.3 10,000 Feet: Representation—HTML and CSS . . . . . . . . . . . . . . . . 50
* HTML
* CSS
### Summary
• An HTML (HyperText Markup Language) document consists of a hierarchically
nested collection of elements. Each element begins with a tag in <angle brackets>
that may have optional attributes. Some elements enclose content.
• A selector is an expression that identifies one or more HTML elements in a docu-
ment by using a combination of the element name (such as body), element id (an
element attribute that must be unique on a page), and element class (an attribute
that need not be unique on a page).
• Cascading Style Sheets (CSS) is a stylesheet language describing visual attributes
of elements on a Web page. A stylesheet associates sets of visual properties with
selectors. A special link element inside the head element of an HTML document
associates a stylesheet with that document.
• The “developer tools” in each browser, such as the Firefox Web Developer toolbar,
are invaluable in peeking under the hood to examine both the structure of a page and
its stylesheets.


## 2.4 5,000 Feet: 3-Tier Architecture & Horizontal Scaling . . . . . . . . . . . . . 53
* 3 tier architecture
    1. Presentation - HTTP server
    2. Logic - application backend
    3. Persistence tier - DB

### Summary
• The three-tier architecture includes a presentation tier, which renders views and in-
teracts with the user; a logic tier, which runs SaaS app code; and a persistence tier,
which stores app data.
• HTTP’s statelessness allows the presentation and logic tiers to be shared-nothing ,
so cloud computing can be used to add more computers to each tier as demand
requires. However, the persistence tier is harder to scale.
• Depending on the scale (size) of the deployment, more than 1 tier may be hosted on
a single computer, or a single tier may require many computers.

## 2.5 1,000 Feet: Model-View-Controller Architecture . . . . . . . . . . . . . . . 56
* __Model-View-Controller (MVC)__
    * Models
        * concerned with the data manipulated by the application
    * Views
        * presented to the user and contain information about the models with which users can interact
    * Controllers
        * mediate the interaction between models and views
### Summary
• The Model-View-Controller or MVC design pattern distinguishes models that im-
plement business logic, views that present information to the user and allow the user
to interact with the app, and controllers that mediate the interaction between views
and models.
• In MVC SaaS apps, every user action that can be performed on a web page—
clicking a link or button, submitting a fill-in form, or using drag-and-drop—is even-
tually handled by some controller action, which will consult the model(s) as needed
to obtain information and generate a view in response.
• MVC is appropriate for interactive SaaS apps with a variety of model types, where
it makes sense to situate controllers and views along with each type of model. Other
architectural patterns may be more appropriate for smaller apps with fewer models
or a smaller repertoire of operations.

## 2.6 500 Feet: Active Record for Models . . . . . . . . . . . . . . . . . . . . . . 59
## 2.7 500 Feet: Routes, Controllers, and REST . . . . . . . . . . . . . . . . . . . 61
## 2.8 500 Feet: Template Views . . . . . . . . . . . . . . . . . . . . . . . . . . . 64
## 2.9 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 66
## 2.10 Concluding Remarks: Patterns, Architecture, and Long-Lived APIs . . . . . . 67
## 2.11 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 68
## 2.12 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 69

# 3 SaaS Framework: Introduction to Ruby 70
## 3.1 Overview and Three Pillars of Ruby . . . . . . . . . . . . . . . . . . . . . . 72
## 3.2 Everything is an Object . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 75
## 3.3 Every Operation is a Method Call . . . . . . . . . . . . . . . . . . . . . . . 77
## 3.4 Classes, Methods, and Inheritance . . . . . . . . . . . . . . . . . . . . . . . 80
## 3.5 All Programming is Metaprogramming . . . . . . . . . . . . . . . . . . . . . 84
## 3.6 Blocks: Iterators, Functional Idioms, and Closures . . . . . . . . . . . . . . . 86
## 3.7 Mix-ins and Duck Typing . . . . . . . . . . . . . . . . . . . . . . . . . . . . 90
## 3.8 Make Your Own Iterators Using Yield . . . . . . . . . . . . . . . . . . . . . 91
## 3.9 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 94
## 3.10 Concluding Remarks: Idiomatic Language Use . . . . . . . . . . . . . . . . 95
## 3.11 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 96
## 3.12 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 97

# 4 SaaS Framework: Introduction to Rails 100
## 4.1 Rails Basics: From Zero to CRUD . . . . . . . . . . . . . . . . . . . . . . . 102
## 4.2 Databases and Migrations . . . . . . . . . . . . . . . . . . . . . . . . . . . . 106
## 4.3 Models: Active Record Basics . . . . . . . . . . . . . . . . . . . . . . . . . 109
## 4.4 Controllers and Views . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 113
## 4.5 Debugging: When Things Go Wrong . . . . . . . . . . . . . . . . . . . . . . 119
## 4.6 Form Submission: New and Create . . . . . . . . . . . . . . . . . . . . . . . 122
## 4.7 Redirection and the Flash . . . . . . . . . . . . . . . . . . . . . . . . . . . . 124
## 4.8 Finishing CRUD: Edit/Update and Destroy . . . . . . . . . . . . . . . . . . 128
## 4.9 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 131
## 4.10 Concluding Remarks: Designing for SOA . . . . . . . . . . . . . . . . . . . 132
## 4.11 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 133
## 4.12 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 134

# 5 SaaS Framework: Advanced Rails 136
## 5.1 DRYing Out MVC: Partials, Validations and Filters . . . . . . . . . . . . . . 138
## 5.2 Single Sign-On and Third-Party Authentication . . . . . . . . . . . . . . . . 144
## 5.3 Associations and Foreign Keys . . . . . . . . . . . . . . . . . . . . . . . . . 149
## 5.4 Through-Associations . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 153
## 5.5 RESTful Routes for Associations . . . . . . . . . . . . . . . . . . . . . . . . 157
## 5.6 Composing Queries With Reusable Scopes . . . . . . . . . . . . . . . . . . . 160
## 5.7 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 162
## 5.8 Concluding Remarks: Languages, Productivity, and Beauty . . . . . . . . . . 163
## 5.9 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 163
## 5.10 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 164

# 6 SaaS Client Framework: JavaScript Introduction 166
## 6.1 JavaScript: The Big Picture . . . . . . . . . . . . . . . . . . . . . . . . . . . 168
## 6.2 Client-Side JavaScript for Ruby Programmers . . . . . . . . . . . . . . . . . 171
## 6.3 Functions and Constructors . . . . . . . . . . . . . . . . . . . . . . . . . . . 176
## 6.4 The Document Object Model and jQuery . . . . . . . . . . . . . . . . . . . 179
## 6.5 Events and Callbacks . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 182
## 6.6 AJAX: Asynchronous JavaScript And XML . . . . . . . . . . . . . . . . . . 188
## 6.7 Testing JavaScript and AJAX . . . . . . . . . . . . . . . . . . . . . . . . . . 193
## 6.8 Single-Page Apps and JSON APIs . . . . . . . . . . . . . . . . . . . . . . . 202
## 6.9 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 206
## 6.10 Concluding Remarks: JavaScript Past, Present and Future . . . . . . . . . . . 209
## 6.11 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 211
## 6.12 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 213

## II Software Development: Agile vs. Plan-and-Document 217

# 7 Requirements: BDD and User Stories 218
## 7.1 Introduction to Behavior-Driven Design and User Stories . . . . . . . . . . . 220
## 7.2 Points, Velocity, and Pivotal Tracker . . . . . . . . . . . . . . . . . . . . . . 223
## 7.3 SMART User Stories . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 225
## 7.4 Lo-Fi User Interface Sketches and Storyboards . . . . . . . . . . . . . . . . 227
## 7.5 Agile Cost Estimation . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 229
## 7.6 Introducing Cucumber and Capybara . . . . . . . . . . . . . . . . . . . . . . 231
## 7.7 Running Cucumber and Capybara . . . . . . . . . . . . . . . . . . . . . . . 233
## 7.8 Enhancing RottenPotatoes . . . . . . . . . . . . . . . . . . . . . . . . . . . 234
## 7.9 Explicit vs. Implicit and Imperative vs. Declarative Scenarios . . . . . . . . . 240
## 7.10 The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 242
## 7.11 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 249
## 7.12 Concluding Remarks: Pros and Cons of BDD . . . . . . . . . . . . . . . . . 251
## 7.13 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 253
## 7.14 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 254

# 8 Testing: Test-Driven Development 256
## 8.1 Background: A RESTful API and a Ruby Gem . . . . . . . . . . . . . . . . 258
## 8.2 FIRST, TDD, and Red–Green–Refactor . . . . . . . . . . . . . . . . . . . . 260
## 8.3 Seams and Doubles . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 263
## 8.4 Expectations, Mocks, Stubs, Setup . . . . . . . . . . . . . . . . . . . . . . . 268
## 8.5 Fixtures and Factories . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 272
## 8.6 Implicit Requirements and Stubbing the Internet . . . . . . . . . . . . . . . . 274
## 8.7 Coverage Concepts and Unit vs. Integration Tests . . . . . . . . . . . . . . . 279
## 8.8 Other Testing Approaches and Terminology . . . . . . . . . . . . . . . . . . 283
## 8.9 The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 285
## 8.10 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 289
## 8.11 Concluding Remarks: TDD vs. Conventional Debugging . . . . . . . . . . . 291
## 8.12 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 291
## 8.13 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 292

# 9 Maintenance: Legacy, Refactoring, and Agile 296
## 9.1 What Makes Code “Legacy” and How Can Agile Help? . . . . . . . . . . . . 298
## 9.2 Exploring a Legacy Codebase . . . . . . . . . . . . . . . . . . . . . . . . . 301
## 9.3 Establishing Ground Truth With Characterization Tests . . . . . . . . . . . . 304
## 9.4 Comments . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 308
## 9.5 Metrics, Code Smells, and SOFA . . . . . . . . . . . . . . . . . . . . . . . . 309
## 9.6 Method-Level Refactoring . . . . . . . . . . . . . . . . . . . . . . . . . . . 313
## 9.7 The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 318
## 9.8 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 324
## 9.9 Concluding Remarks: Continuous Refactoring . . . . . . . . . . . . . . . . . 325
## 9.10 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 326
## 9.11 Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 327

# 10 Project Management: Scrum, Pairs, and VCS 330
## 10.1 It Takes a Team: Two-Pizza and Scrum . . . . . . . . . . . . . . . . . . . . . 332
## 10.2 Pair Programming . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 333
## 10.3 Agile Design and Code Reviews? . . . . . . . . . . . . . . . . . . . . . . . . 335
## 10.4 Version Control for the Two-Pizza Team: Merge Conflicts . . . . . . . . . . 336
## 10.5 Using Branches Effectively . . . . . . . . . . . . . . . . . . . . . . . . . . . 339
## 10.6 Reporting and Fixing Bugs: The Five R’s . . . . . . . . . . . . . . . . . . . 343
## 10.7 The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 345
## 10.8 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 353
## 10.9 Concluding Remarks: Teams, Collaboration, and Four Decades of Version
## Control . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 355
## 10.10To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 356
## 10.11Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 358

# 11 Design Patterns for SaaS Classes 360
## 11.1 Patterns, Antipatterns, and SOLID Class Architecture . . . . . . . . . . . . . 362
## 11.2 Just Enough UML . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 366
## 11.3 Single Responsibility Principle . . . . . . . . . . . . . . . . . . . . . . . . . 369
## 11.4 Open/Closed Principle . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 371
## 11.5 Liskov Substitution Principle . . . . . . . . . . . . . . . . . . . . . . . . . . 375
## 11.6 Dependency Injection Principle . . . . . . . . . . . . . . . . . . . . . . . . . 378
## 11.7 Demeter Principle . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 382
## 11.8 The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 386
## 11.9 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 387
## 11.10Concluding Remarks: Frameworks Capture Design Patterns . . . . . . . . . 388
## 11.11To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 389
## 11.12Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 391

# 12 Performance, Releases, Reliability, and Security 392
## 12.1 From Development to Deployment . . . . . . . . . . . . . . . . . . . . . . . 394
## 12.2 Quantifying Responsiveness . . . . . . . . . . . . . . . . . . . . . . . . . . 396
## 12.3 Continuous Integration and Continuous Deployment . . . . . . . . . . . . . 398
## 12.4 Releases and Feature Flags . . . . . . . . . . . . . . . . . . . . . . . . . . . 400
## 12.5 Quantifying Availability . . . . . . . . . . . . . . . . . . . . . . . . . . . . 403
## 12.6 Monitoring and Finding Bottlenecks . . . . . . . . . . . . . . . . . . . . . . 405
## 12.7 Improving Rendering and Database Performance With Caching . . . . . . . . 407
## 12.8 Avoiding Abusive Database Queries . . . . . . . . . . . . . . . . . . . . . . 411
## 12.9 Security: Defending Customer Data in Your App . . . . . . . . . . . . . . . 414
## 12.10The Plan-And-Document Perspective . . . . . . . . . . . . . . . . . . . . . 419
## 12.11Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 421
## 12.12Concluding Remarks: Performance, Reliability, Security, and Leaky Abstrac-
## tions . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 424
## 12.13To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 425
## 12.14Suggested Projects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 428

# 13 Afterword 432
## 13.1 Perspectives on SaaS and SOA . . . . . . . . . . . . . . . . . . . . . . . . . 432
## 13.2 Looking Backwards . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 432
## 13.3 Looking Forwards . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 435
## 13.4 Last Words . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 437
## 13.5 To Learn More . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 438

# A Using the Bookware 440
## A.1 General Guidance: Read, Ask, Search, Post! . . . . . . . . . . . . . . . . . . 442
## A.2 Overview of the Bookware . . . . . . . . . . . . . . . . . . . . . . . . . . . 442
## A.3 Development Using the Cloud9 IDE . . . . . . . . . . . . . . . . . . . . . . 443
## A.4 Working With Code: Editors . . . . . . . . . . . . . . . . . . . . . . . . . . 443
## A.5 Getting Started With Secure Shell (ssh) . . . . . . . . . . . . . . . . . . . . 444
## A.6 Getting Started With Git for Version Control . . . . . . . . . . . . . . . . . . 445
## A.7 Getting Started With GitHub . . . . . . . . . . . . . . . . . . . . . . . . . . 447
## A.8 Deploying to the Cloud Using Heroku . . . . . . . . . . . . . . . . . . . . . 449
## A.9 Checklist: Starting a New Rails App . . . . . . . . . . . . . . . . . . . . . . 452
## A.10 Fallacies and Pitfalls . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 455
## A.11 To Learn More .
