# README
* Author: Michael De Santis
* CUID: 101213450
* Date: 2024/10/06

# Reading: Continuous Integration
* Martin Fowler
* [Continuous Integration](https://www.martinfowler.com/articles/continuousIntegration.html)

## Continuous Integration
__Continuous Integration__ aka __Trunk-Based Development__
* Continuous Integration is a software development practice where each member of a team merges their changes into a codebase together with their colleagues changes at least daily. Each of these integrations is verified by an automated build (including test) to detect integration errors as quickly as possible. Teams find that this approach reduces the risk of delivery delays, reduces the effort of integration, and enables practices that foster a healthy codebase for rapid enhancement with new features. 

## Building a Feature with Continuous Integration

## Practices of Continuous Integration

### Put everything in a version controlled mainline

### Automate the Build

### Make the Build Self-Testing

### Everyone Pushes Commits To the Mainline Every Day

### Every Push to Mainline Should Trigger a Build

### Fix Broken Builds Immediately

### Keep the Build Fast

### Hide Work-in-Progress

### Test in a Clone of the Production Environment

### Everyone can see what's happening

### Automate Deployment
## Styles of Integration



# Questions

## 1. What are the benefits of continuous integration?
The one main benefit of continuous integration that Fowler mentions is that anyone, with a clean machine, should be able to clone a repository and build its artifacts in a single command. This overarching benefit encompasses many other benefits to the codebase and to programmers. For example, the incorporation of build tools or scripts into the continuously integrated codebase ensures that the codebase can be reliably built by any pulling machine. Another advantage of continuous integration is avoiding all the pains of a heavy integration stage subsequent to development. Another benefit is that developers working on features are rarely ever too far behind the mainline, and can pull the mainline's changes into their feature branches before pushing their own changes back to the remote mainline. Yet another benefit is the ability to rollback to an earlier build to revert changes or to assist in diff debugging. Fowler also lists the benefit of communication amongst developers, as continuous integration allows developers inform other developers of the changes they have made, and the high frequency of communication allows people to know quickly as changes develop; Fowler emphasises this when he states that the "whole point of Continuous Integration is to provide rapid feedback." Continuous integration has many benefits.


## 2. What are the steps involved in continuous integration (starting from checking out the code from a repo and ending with a new deployment)?

1. A developer checks out code from a central repository.
2. A developer creates a new local feature branch from the mainline.
3. A developer develops, frequently pulling in the mainline and rebasing their changes on top of it to ensure their code is well-integrated and conflict free.
4. When a developer is satisfied with their work increment, and local builds and tests all pass, they push their changes to the remote mainline (through a pull request (PR) or merge request (MR), typically).
5. Once the code changes are pushed, the CI server performs its own build and tests of the updated mainline. If the build or tests fail, the changes should be rejected (or reverted). If the build and tests pass, the changes are accepted (or merged).
6. Any subsequent tests may be run as part of the CI pipeline, including component tests and integration tests that may rely on external components (eg. databases, other programs) in the CI reference environment.
7. If all CI stages of the pipeline are successful thus far, the build can be deployed to its execution environment (eg. hardware, servers, etc.). This is usually referred to as Continuous Deployment stage (and hence the enveloping term "CI/CD").

## 3. Is there anything that should NOT be checked into the common version control repository? If so, why?

There are many things that should not be checked in, and should be ignored (such as through a `.gitignore` file when using `git`). Most binaries are generally ignored, as they cannot be usefully tracked or diffed. For example, build artifacts generated within the repository directory should be ignored; these may be large files that bloat the repository, and should be easily reproducible if the source repository contains automated build scripts. Additionally, individual developer workflow files should be ignored (scratch pads, Vim swapfiles, user profiles, etc.), as while they may be present in local repository directories, they are not intended to be shared with the mainline. All build tools and dependencies should likewise be ignored if held locally, although configuration files and manifests for retrieving build dependencies (eg. IDE configuration files, Debian package lists, etc.) can be checked in to assist in retrieving these dependencies to the local machine pulling the repository.

## 4. (mini-investigation required) In git, how do you specify which files shouldn't be checked into the repository?

You can specify files for git to ignore in a text file called `.gitignore`. Each directory of a repository may specify an ignore file that affects their directory subtree, including the top-level directory (where it is usually defined). Both files and directories can be ignored, and there are several pattern specifiers to target files and directories according to specific rules.

## 5. Why are text files a preferable format for documents involved in continuous integration?

Text files have a few advantages for use in continuous integration. One advantage is that text files are generally very small, and therefore take up minimal space in a codebase; for example, it is preferable to store the source code and build scripts for some binary rather than the binary itself. Secondly, text files are easily diffable, meaning that when changes are introduced, it is easy to parse and compare text files to show those changes; diffing on binaries is possible, but does not usually produce any meaningful information for a debugging program or developer. Text files are also extremely portable, meaning that developers on disparate systems need only a text editor to view and edit any of the source.

## 6. Why should everyone commit to the mainline every day?

Each developer committing to the mainline at least every day is a primary criterion of Continuous Integration for Fowler. By committing to the mainline every day, developers ensure that their code is never too far out of step with the mainline, as in order to commit to it they must make sure there are no conflicts (eg. through a merge or preferably a rebase). This also ensures that any automated test suites (unit, component, integration, etc.) are run on the developer's code to check for compatibility, locate any bugs, etc. Continuous integration ensures that code develops quickly and stably in small increments, and helps prevent the need for big integration efforts on large quantities of code. Also, if every developer pushes to the mainline frequently, developers quickly find out if there is a conflict between two developers, and can therefore quickly resolve the conflicts before they develop into larger problems.

## 7. What does a continuous integration server do? Name one vendor.

A continuous integration server is a server that monitors the mainline (and possibly other branches) of a continuously integrated repository. The server provides version control integration with a remote repository (eg. GitHub or GitLab use `git`), as well as a reference environment within which to automate builds and tests (eg. a GitLab Runner, which executes CI/CD pipeline jobs). Since developers, working on local branches of the repository, may have disparate environments, a common environment is provided by the CI service, and this environment is taken as the reference. Generally, code is not considered integrated until it has been built and tested in the CI server pipeline.
One example of a continuous integration service is GitLab (my favourite one!).

## 8. What should happen when a build fails on the continuous integration server? Why?
When a build fails, the very first thing that should happen is notification: the server should communicate the failed build to any monitoring service, and directly to developers (eg via e-mail, Slack, etc.). Then, the reason for the failure should be quickly found and remedied, which is a capability prioritized in continuously integrated codebases. There are several methodologies for this, but the one that Fowler advocates is to immediately revert the breaking change (ie. perform a rollback to the most recent valid build). In doing so, this immediately brings the codebase back to a functional and safe state so that all developers may continue their development against a valid mainline. While developers continue their development, a subset of developers can (in parallel) begin looking for the bug introduced in the failing push, using diff debugging to aid in their efforts. When the bug is found and fixed, the code can then be rebased onto the mainline (with any conflicts that may have since arisen resolved) and merged in so that it may be checked again by the CI server.

Thanks!!

