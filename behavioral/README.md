# Design-patterns - Strategy 

- Command
- Strategy
- Iterator

## What Is the Strategy Design Pattern?

The Strategy Pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate them, 
and make them interchangeable at runtime.

It helps you avoid using lots of if-else or switch statements to choose behavior.

## Real-world example

Imagine a payment system that supports:

- PayPal
- Credit Card
- Google Pay

Each payment method has a different algorithm, but the system should be flexible — we don’t want to hardcode every case.

## Structure

Strategy (interface): Defines a common behavior for all algorithms

Concrete Strategies: Implement the behavior in different ways

Context: Uses a Strategy and delegates the work to it

## Benefits

✅ Easy to add new algorithms (just implement PaymentStrategy).
✅ No need to modify existing code (Open/Closed Principle).
✅ Clean and maintainable.