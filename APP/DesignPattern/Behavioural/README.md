<h1> Strategy Pattern </h1>

<h5> motivation </h5>
- Change the behaviour of the class at run time without changing the code

<h5> intent </h5>
- Make group of algorithms that applies to a family
- Make these algorithms interchangeable at run time within that family

<h5> Key Elements </h5>
- Context class
  - Class that has a strategy
  - uses that certain strategy
  - has a setter and compute method to change behaviour and use the behaviour at run time
- Strategy Abstract class
  - Abstract super class where all strategy is derived from
  - Context class can only use strategy from this subclass of abstract class (this family)
- Concrete Strategies
  - concrete strategies that implements the super class abstract strategies
  - provides different behaviour

