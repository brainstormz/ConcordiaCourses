<h1> Creational Pattern </h1>

- best way to instantiate objects
- In java, simplest way to create object is "new"

<h3> Different creational patterns </h3>

- Factory pattern
- Abstract factory pattern
- builder pattern
- prototype pattern
- singleton pattern


<h3> Builder pattern </h3>

- relies on interface called iterator

```
    << interface >> 
     hasNext()
     next()
```
- once we have the iterator interface, we ca create a iterator for any kind of object by defining concrete iterator
- reduce dependency by programming to interface, but not concrete class
  - each class implements interface that assumes responsbility of implementing concrete iterator, that is
    responsible for internal implementation of the menu items
- allows you to write polymorphic code that can iterate through any collection of object as long as you get a hold of
 iterator
 - The Iterator Pattern allows traversal of the elements of an aggregate without exposing the underlying implementation.
It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be.
    - this results in single responsbility principal, where a class only does one thing and has only one reason to change
    - cohesion is a more generally term, where high cohesion means that a class has a closely related responsbilities.
    
- NOW.. how is builder pattern similar to iterator pattern?
    - in iterator we hide the internal implementation by separate iterator object, and hid the internal representation of the collection
    - builder is similar in that we encapsulate how complex object is built
- Builder benefits
    - Product implementations can be swapped in and out because the client only sees an abstract interface (increase modularity)
    - encapsulates way a complex object is built
    - hides internal representation of product from client
    - allows object to be created in multi steps (as opposed to factory)
- Builder pattern should be used?
    - Algorithm for creation is independent of parts that make up the object and how they are assembled
    - construction have same process, but different representation of objects
    - Complex objects have common structure, even though internal state and behaviour will be different.
- Consequences of using builder pattern?
    - let's you vary internal representation of the product and vary the the order of assembly (construction abstraction)
    - 
