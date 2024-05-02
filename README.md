# pizza-ordering-system-oops-
Introduction
PizzaPay is a Java project aimed at simplifying the process of ordering pizzas. Leveraging Object-Oriented Programming (OOP) principles, this project utilizes inheritance to create a modular and efficient system.

Classes
Pizza: Represents a pizza with various attributes such as size, toppings, and price. This class serves as the base for pizza-related operations.
FarmPizza: Inherits from the Pizza class, adding functionality for billing and takeaway options. This class extends the features of the base pizza, incorporating billing methods and takeaway options.

Features
Ordering: Easily order pizzas by specifying size and toppings.
Billing: Calculate bills for orders with FarmPizza's built-in billing methods.
Takeaway: Option to choose takeaway service for added convenience.

How to Use
Clone the repository or download the source code.
Compile the Java files.
Run the main program to start ordering pizzas.
Follow the prompts to specify pizza details and select billing/takeaway options.

Usage Example
java
Copy code
// Create a new FarmPizza object
FarmPizza myPizza = new FarmPizza("Large", "Pepperoni");
// Calculate bill
double billAmount = myPizza.calculateBill();
// Choose takeaway option
myPizza.takeaway();

Contributing
Contributions to improve PizzaPay are welcome! Fork the repository, make your changes, and submit a pull request.
