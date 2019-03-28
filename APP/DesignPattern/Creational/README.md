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
- once we have the iterator inteferface, we ca create a iterator for any kind of object by defining concrete iterator
- reduce dependency by programming to interface, but not concrete class
  - each class implements interface that assumes responsbility of implementing concrete iterator, that is
    responsible for internal implementation of the menun items
- allows you to write polymorphic code that can iterate through any collection of object as long as you get a hold of
 iterator
 - The Iterator Pattern allows traversal of the elements of an aggregate without exposing the underlying implementation.
It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be.
