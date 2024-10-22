# Design Patterns Projects

This repository demonstrates various design patterns implemented in different use-case scenarios. Each pattern is used to solve a specific problem and is demonstrated with simple examples, including core classes and usage in a `Main` class.

## Table of Contents

1. [Strategy Pattern: Payment Processing System](#1-strategy-pattern-payment-processing-system)
2. [Observer Pattern: Weather Monitoring System](#2-observer-pattern-weather-monitoring-system)
3. [Command Pattern: Remote Control for Smart Home Devices](#3-command-pattern-remote-control-for-smart-home-devices)
4. [State Pattern: Order Processing System](#4-state-pattern-order-processing-system)
5. [Chain of Responsibility: Expense Approval System](#5-chain-of-responsibility-expense-approval-system)
6. [Mediator Pattern: Chat Room Application](#6-mediator-pattern-chat-room-application)
7. [Memento Pattern: Document Version Control System](#7-memento-pattern-document-version-control-system)
8. [Visitor Pattern: Shape Area Calculator](#8-visitor-pattern-shape-area-calculator)
9. [Template Method Pattern: Report Generation System](#9-template-method-pattern-report-generation-system)
10. [Iterator Pattern: Playlist Management System](#10-iterator-pattern-playlist-management-system)

---

## 1. Strategy Pattern: Payment Processing System

**Objective**: Implement a payment processing system that supports multiple payment methods for an e-commerce platform.

### Key Components:
- `PaymentStrategy` Interface
- `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment` Strategy Classes
- `ShoppingCart` Class that uses the strategy to process payments
- Ability to switch between different payment methods at runtime.

---

## 2. Observer Pattern: Weather Monitoring System

**Objective**: Implement a weather monitoring system that notifies various display devices when the weather data changes.

### Key Components:
- `WeatherStation` (Subject)
- `WeatherDisplay` (Observer) Interface
- `CurrentConditionsDisplay`, `StatisticsDisplay`, `ForecastDisplay` Observers
- `WeatherData` Class to manage displays and weather data

---

## 3. Command Pattern: Remote Control for Smart Home Devices

**Objective**: Design a universal remote control that can operate multiple smart home devices using the Command pattern.

### Key Components:
- `Command` Interface
- Concrete commands: `TurnTVOn`, `SetVolume`, `DimLights`
- Smart devices: `TV`, `Stereo`, `Light`
- `RemoteControl` Class with undo functionality

---

## 4. State Pattern: Order Processing System

**Objective**: Implement an order processing system that changes behavior based on the current state of the order (e.g., New, Paid, Shipped).

### Key Components:
- `State` Interface with order actions
- Concrete state classes: `NewOrderState`, `PaidOrderState`, `ShippedOrderState`
- `Order` Class that manages the current state and transitions between them

---

## 5. Chain of Responsibility: Expense Approval System

**Objective**: Create an expense approval system where approval requests are passed through a chain of approvers based on the expense amount.

### Key Components:
- `Approver` Base Class
- Concrete approvers: `TeamLead`, `Manager`, `Director`, `CEO`
- `ExpenseRequest` Class for expense details
- `ApprovalChain` Class to set up the chain and process requests

---

## 6. Mediator Pattern: Chat Room Application

**Objective**: Design a chat room application where users send messages to each other through a mediator (chat room).

### Key Components:
- `ChatMediator` Interface
- `ChatRoom` Class (Concrete Mediator)
- `User` Abstract Class
- `RegularUser`, `PremiumUser` Classes

---

## 7. Memento Pattern: Document Version Control System

**Objective**: Implement a document version control system that allows saving and restoring different versions of a document.

### Key Components:
- `Document` Class (Originator)
- `DocumentVersion` Class (Memento)
- `VersionControl` Class (Caretaker)
- Methods to save, list, and restore document versions

---

## 8. Visitor Pattern: Shape Area Calculator

**Objective**: Design a system that calculates the area of different shapes using the Visitor pattern.

### Key Components:
- `Shape` Interface with `accept(Visitor visitor)` method
- Concrete shape classes: `Circle`, `Rectangle`, `Triangle`
- `Visitor` Interface with methods to visit different shapes
- `AreaCalculator` Concrete Visitor Class to calculate areas of shapes
- `Drawing` Class that holds a collection of shapes and uses the `AreaCalculator`

---

## 9. Template Method Pattern: Report Generation System

**Objective**: Implement a report generation system that creates different types of reports (e.g., PDF, HTML, Plain Text) while maintaining a consistent process.

### Key Components:
- `ReportGenerator` Abstract Class with the template method `generateReport()`
- Concrete report generator classes: `PDFReportGenerator`, `HTMLReportGenerator`
- Methods for formatting header, body, and footer
- `ReportingSystem` Class to use different generators

---

## 10. Iterator Pattern: Playlist Management System

**Objective**: Design a playlist management system for a music streaming service that allows traversal of songs in different orders (e.g., sequential, shuffle, filtered by genre).

### Key Components:
- `Playlist` Class to store a collection of `Song` objects
- Iterators: `SequentialIterator`, `ShuffleIterator`, `GenreFilterIterator`
- Each iterator provides `hasNext()` and `next()` methods for traversal
- Demonstration of traversing the playlist using different iterator types
