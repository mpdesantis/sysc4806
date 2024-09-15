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
# 1 Introduction to SaaS and Agile Development 2
## 1.1 Introduction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 4
## 1.2 Software Development Processes: Plan and Document . . . . . . . . . . . . 5
## 1.3 Software Development Processes: The Agile Manifesto . . . . . . . . . . . . 11
## 1.4 Service Oriented Architecture . . . . . . . . . . . . . . . . . . . . . . . . . 16
## 1.5 Software as a Service . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 19
## 1.6 Cloud Computing . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 22
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
## 2.1 100,000 Feet: Client-Server Architecture . . . . . . . . . . . . . . . . . . . . 44
## 2.2 50,000 Feet: Communication—HTTP and URIs . . . . . . . . . . . . . . . . 46
## 2.3 10,000 Feet: Representation—HTML and CSS . . . . . . . . . . . . . . . . 50
## 2.4 5,000 Feet: 3-Tier Architecture & Horizontal Scaling . . . . . . . . . . . . . 53
## 2.5 1,000 Feet: Model-View-Controller Architecture . . . . . . . . . . . . . . . 56
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
