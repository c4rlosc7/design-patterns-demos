# Design-patterns - Creational

Creational design patterns are all about how objects are born. Instead of just using the new keyword directly everywhere 
(which can make code rigid and messy), these patterns give you flexible, reusable ways to create objects.

Here are the 5 main Creational Patterns in Java, illustrated with concepts and code.

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

## Singleton Pattern?

The "One and Only"

Concept: Ensures a class has only one instance and provides a global point of access to it. Think of it like a 
government or a printer spooler—you don't want five different governments running the country at once.

```
[ Client A ] --\
                \
[ Client B ] ----> [ Singleton Instance ]
                /
[ Client C ] --/
```

**Use Case:** Database connections, Logging services, Configuration settings.

## Factory Method

Defines an interface for creating an object but lets subclasses decide which specific class to instantiate. 
Logistics Company. The boss says "Deliver this package." They don't care how.

If the delivery is on land, the Road Department creates a Truck.
If the delivery is overseas, the Sea Department creates a Ship.

**Use Case:** Frameworks where the specific types of objects (like Windows vs. Mac buttons) aren't known until runtime.

```
          [ Logistics App ]
                  |
        (Calls createTransport)
          /                \
 [RoadLogistics]       [SeaLogistics]
       |                     |
 Creates [Truck]       Creates [Ship]
```

## Abstract Factory 

Allows you to create families of related objects without specifying their concrete classes. 
Furniture Store. When you buy a furniture set, everything needs to match.

Imagine buying furniture. You want a Modern style. The factory gives you a Modern Chair, Modern Table, and Modern Sofa. 
If you switch to Victorian style, you get a Victorian Chair, Table, and Sofa. You never mix a Victorian Chair with a 
Modern Table.

**Use Case:** GUI Skins (Dark Mode vs. Light Mode widgets), Cross-platform UI (Mac vs. Windows components).

```
         [ Abstract Factory ]
        /                    \
 [Modern Factory]      [Victorian Factory]
    |        |             |          |
 [M.Chair] [M.Table]    [V.Chair]  [V.Table]
    \        /              \        /
     (Matching Set)        (Matching Set)
```



## Builder

Separates the construction of a complex object from its representation. It allows you to construct complex objects 
step-by-step.

"Start with a bun."
"Add cheese."
"No onions."
"Add bacon."
"Finish."
You don't want a constructor with 10 null values like new Burger(true, false, null, true, null...).

```
[ Builder ]
    |
(.setBun) --> (.setPatty) --> (.setCheese) --> [ Final Burger ]
```

## Prototype

Concept: Creates new objects by copying (cloning) an existing object instead of creating a new one from scratch.

Real-World Example: Bacterial Division (Mitosis) or Dolly the Sheep. Nature doesn't "build" a new cell by reading a
blueprint every time; it just duplicates the DNA of an existing cell.

Use Case: When creating an object is expensive (e.g., heavy database query, complex calculations) or you need an exact 
copy of a runtime state.

```
        [ Original Document ]
(Contains complex formatting & data)
                 |
              (CLONE)
                 |
        [ Copy 1 ]  [ Copy 2 ]
(Exact duplicates, created instantly)
```