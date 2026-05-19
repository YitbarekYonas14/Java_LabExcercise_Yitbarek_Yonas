# Java Lab Exercises and Assignments - Yitbarek Yonas

## 📚 About This Repository

Welcome to my Java Lab Exercise repository! This collection represents my journey through various Java concepts, from basic file operations to advanced networking and distributed systems. Each project here has taught me something valuable, and I've documented them to show my understanding of core Java principles.

---

## 📁 Lab Exercise 1: University Package

> **Focus Areas:** File I/O, Database Operations, Sockets, Serialization

This lab exercise implements a **University Management System** that demonstrates how Java handles data persistence and network communication.

### What I Learned:
- **File I/O Streams** - Reading/writing student and course data to files
- **Database Connectivity** - Storing and retrieving information from databases
- **Socket & ServerSocket** - Client-server communication within the university network
- **Serialization** - Converting objects to byte streams for storage/transmission

### Key Features:
- Add, view, update, and delete student records
- File-based data storage with backup functionality
- Database integration for persistent storage
- Client-server architecture using sockets

---

## 💻 Lab Exercise 2: UniversityJavaFX

> **Focus Areas:** GUI Development, University Package Integration

Building on Lab Exercise 1, this project adds a **Graphical User Interface** using JavaFX to make the University Management System more user-friendly.

### What I Learned:
- **JavaFX Scene Builder** - Designing intuitive interfaces
- **Event Handling** - Responding to button clicks, form submissions
- **Real-time Updates** - Reflecting database changes instantly in the UI

### Key Features:
- Login screen for administrators and staff
- Dashboard to manage students, courses, and professors
- Visual feedback for database operations
- Form validation and error handling

---

## 🌐 Lab Exercise 3: University-RMI

> **Focus Areas:** Remote Method Invocation, Distributed Systems

This project takes the university system **remote**! The file and database operations are moved to a server and accessed remotely using RMI.

### What I Learned:
- **Remote Interface** - Defining methods that can be called from other JVMs
- **UnicastRemoteObject** - Exporting remote objects
- **Registry** - Registering and looking up remote services
- **Distributed Architecture** - Separating server logic from client applications

### Key Features:
- Remote server hosting all university data operations
- Multiple clients can connect simultaneously
- Transparent remote method calls (they feel like local calls!)
- Centralized data management with distributed access

---

##  Assignments

### PokerGame
> **Understanding Collections Framework**

A fully functional poker game that helped me master Java's Collection Framework.

**Concepts Covered:**
- `ArrayList` and `LinkedList` for card management
- `HashMap` for player statistics
- `HashSet` for unique card tracking

**What I Built:**
- Deck shuffling and dealing mechanics
- Hand ranking system (pair, flush, straight, etc.)
- Multi-player support


---

### ChatApp
> **Understanding Multiple Client Connections & Threads**

A real-time chat application that demonstrates concurrent programming in Java.

**Concepts Covered:**
- **Multithreading** - Each client gets its own thread
- **Concurrent Connections** - Handling multiple clients simultaneously
- **Broadcasting** - Sending messages to all connected clients
- **Synchronization** - Managing shared resources safely

**What I Built:**
- Server that accepts multiple client connections
- Private messaging between specific users
- Public(group) chat rooms


---

### Notepad Application
> **Understanding File I/O Streams**

A simple but complete text editor that made file operations second nature to me.

**Concepts Covered:**
- **FileInputStream/FileOutputStream** - Reading/writing raw bytes
- **BufferedReader/BufferedWriter** - Efficient text operations
- **FileReader/FileWriter** - Character-based file handling

**What I Built:**
- Create, open, edit, and save text files
- Cut, copy, paste, and select all functionality
---
