Creational design patterns are concerned with the process of object creation, providing mechanisms to increase flexibility and reuse of code. These patterns abstract the instantiation process, allowing the system to be independent of how its objects are created, composed, and represented.


1. Singleton Pattern
Ensures a class has only one instance and provides a global point of access to it.

Use Case: Managing shared resources like configurations, logging, or database connections.
Example:
A logging class (like LogManager).
Spring Beans (@Service, @Repository, etc.).

2. Factory Method Pattern
Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

Use Case: When the exact type of object to be created is determined at runtime.
Example:
Payment gateways producing CreditCardProcessor, PayPalProcessor, etc.
Spring’s BeanFactory.

3. Abstract Factory Pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Use Case: When a system needs to create multiple related objects without knowing their concrete implementations.
Example:
GUI Toolkits producing related components like buttons, checkboxes, and text fields.
Hibernate SessionFactory.

4. Builder Pattern
Separates the construction of a complex object from its representation so that the same construction process can create different representations.

Use Case: When creating objects with many optional or required parameters.
Example:
Building SQL queries.
Spring’s UriComponentsBuilder.

5. Prototype Pattern
Creates new objects by copying an existing object, known as the prototype.

Use Case: When the cost of creating an object is expensive, and you need to clone it instead of creating it from scratch.
Example:
Duplicating database records for testing.
Cloning graphical objects in applications like Photoshop.

6. Object Pool Pattern
Manages a pool of reusable objects that clients can request and release.

Use Case: When managing expensive-to-create resources like database connections or threads.
Example:
Thread Pools.
Database Connection Pools.

