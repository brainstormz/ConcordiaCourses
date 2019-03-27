<h1> Creational Pattern </h1>

- best way to instantiate objects
- In java, simplest way to create object is "new"

<h3> Different creational patterns </h3>

- Factory pattern
- Abstract factory pattern
- builder pattern
- prototype pattern
- singleton pattern


<h1> Factory </h1>

<h5> Consider using factory when </h5>

- various objects are to be used polymorphically
- class specifies hierarchy of classes to specify which object it creates
- a class can't anticipate the kind of objects it must create
- you want to localize the knowledge of which class gets created

<h5> How to recognize factory </h5>

- The base class is (most often) abstract.
- the base class contains default methods and is only subclassed for cases
where the default methods are insufficient.
- Parameters are passed to the factory telling it which of several class types to
return.
- Classes may share the same method names but may do something quite
different.
- Also often called a “factory method”
