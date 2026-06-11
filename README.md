# NoLine-SE350
SE 350 Project

# NoLine - Virtual Queue System

## Project Description
NoLine is a virtual queue management system that allows businesses to manage customer queues digitally. Customers can join a queue, receive notifications, and update their queue status.


# Sprint 1 Checklist - Jash Maisuria

## Checklist

### Are you in a Group?
No

### If so, who else is in your group?
No

### What programming language are you selecting? Which version?
Java (JDK 17)

### Do you have your GitHub account set up?
Yes

### Do you have a public repository for your Project?
Yes

### What is the link to your GitHub repository?
https://github.com/jashmaisuria2003/NoLine-SE350

### If you are in a group, does everyone have access to the GitHub repo?
No

### Do you have a "Hello World" program that compiles and runs?
Yes.

### Where is the entry point to your project?
src/Main.java

## Project Structure

project_root/

├── src/

│   ├── Main.java

│   ├── Customer.java

│   ├── QueueManager.java

│   ├── NotificationService.java

│   └── ...

├── lib/

├── README.md

### Description

The NoLine project is a virtual queue management system that allows customers to join a queue and receive notifications when it is their turn. Businesses can manage customer queues efficiently through a command-line interface.

### Hello World Verification

The project was successfully compiled and executed. The initial setup included a Hello World program to verify that the Java development environment was configured correctly.

### Repository Access

The project repository is public and accessible through GitHub.



## Programming Language
Java

## Entry Point
src/Main.java

## Design Patterns Used

### Singleton Pattern
QueueManager uses the Singleton Pattern to ensure only one queue manager instance exists.

### Factory Pattern
UserFactory creates Customer and BusinessOwner objects.

### Observer Pattern
Customers receive queue notifications through the Observer Pattern.

### State Pattern
Customers can move between Waiting, Served, and Cancelled states.

## Sprint Progress
Sprint 4 includes catch-up progress from Sprint 1, Sprint 2, and Sprint 3. The project now contains a working console-based application with four implemented design patterns.

## Final Submission Goal
The goal for the final project is to expand the NoLine queue system with additional queue features and improved functionality.

## Problems Encountered
Some challenges included setting up GitHub CLI authentication and organizing the project structure while implementing multiple design patterns together.


## Sprint 5 Progress

### Design Patterns Implemented
- Singleton Pattern
- Factory Pattern
- Strategy Pattern
- Observer Pattern
- State Pattern
- Command Pattern

### Final Demonstration
The final project will demonstrate a virtual queue management system where customers can join a queue, business owners can manage the queue, and customers receive updates. The project uses multiple design patterns to make the code modular and easy to extend.

### Challenges
The biggest challenge was integrating multiple design patterns into one project while keeping the code organized and ensuring that each pattern was actually used.



# Final Submission

## Project Overview

NoLine is a console-based virtual queue management system designed to help businesses manage customer queues efficiently. Customers can join a queue, receive notifications about their status, and businesses can manage the queue through an interactive terminal interface. The project demonstrates object-oriented software development principles and the implementation of multiple design patterns to create a modular and maintainable application.

---

## Features

* Interactive terminal-based menu
* Add customers to the queue
* Serve the next customer
* Cancel the next customer
* Display the current queue
* Display queue statistics
* Customer notification system

---

## Design Patterns Implemented

### Singleton Pattern

**Class:** `QueueManager`

Ensures there is only one instance responsible for managing the queue throughout the application.

### Factory Pattern

**Class:** `UserFactory`

Creates different types of users such as `Customer` and `BusinessOwner` without exposing object creation logic.

### Observer Pattern

**Classes:** `QueueObserver`, `Customer`

Customers receive notifications whenever queue events occur.

### Strategy Pattern

**Classes:** `QueueStrategy`, `FIFOQueueStrategy`

Allows queue management strategies to be changed independently from the rest of the system.

### State Pattern

**Classes:**

* `CustomerState`
* `WaitingState`
* `ServedState`
* `CancelledState`

Represents different customer states during the queue lifecycle.

### Command Pattern

**Classes:** `Command`, `ShowStatisticsCommand`

Encapsulates operations such as displaying queue statistics into command objects.


## Demonstration

The application demonstrates the following workflow:

1. Business owner opens the queue
2. Customer joins the queue
3. Additional customers join the queue
4. Display the current queue
5. Serve the next customer
6. Cancel the next customer
7. Display queue statistics
8. Exit the application


## Current Limitations

* Data is stored only during program execution.
* No persistent database integration.
* No graphical user interface.
* Queue information resets when the application closes.


## Future Improvements

* Database integration
* Web and mobile interface
* Appointment scheduling
* Email and SMS notifications
* Multiple queue strategies
* Enhanced business analytics dashboard


## Final Notes

This project demonstrates the practical application of Object-Oriented Software Development concepts by implementing six custom design patterns:

* Singleton
* Factory
* Observer
* Strategy
* State
* Command

The primary goal of the project was to create a modular, maintainable, and extensible virtual queue management system while providing a functional working application for demonstration.


## How to Run

Compile:
javac src/*.java

Run:
java -cp src Main


