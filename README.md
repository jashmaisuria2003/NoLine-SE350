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



## How to Run

Compile:
javac src/*.java

Run:
java -cp src Main


