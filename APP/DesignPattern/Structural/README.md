<h1> Structural Pattern </h1>

- Describe how objects and classes can be combined to form larger structures
- What is the difference between class pattern and object pattern?
  - class pattern - describes inheritance and how it can be used to provide more useful program interface
  - object pattern - describes composition (object composed to create larger structures)

<h5> Examples of Structural patterns are: </h5>

- adaptor - allow client class to another class that may provie service to it (namely, incompatible API)
  - benefits?
- composite 
- facade - make single class represent an entire subsystem
  - benefits?
- bridge
- decorator - add additional feature to objects dynamically
  - benefits?
- flyweight - sharing objects, where each object stores its state externally
  - benefits?

<h5> Adapter </h5>

- Motivation
  - bridge between 2 objects that have same functionality, but used in different manner (Eg: different specification
  to their interface)
  - Eg: an object expecting some type of object, and another object exposing same type of feature, but exposing it
  in different way (API)
  - you don't want to change the classes? 
- Intent
  - convert the interface of a class to another that the client expects
  - adapter lets classes work together that have different interfaces
- key roles:
  - Target - Interface that client uses
  - Adapter - adapts the adaptee to the target
  - Adaptee - defines existing interface that needs adapting (the interface client wants to use, but doesn know how)
    - ```if client only knows how to use A, but want to use B as well. Then B is an adaptee```
  - Client - collaborates with objects conforming to the target interface
- when is adapter pattern used?
  - adaptee and target uses the same service, but doesn't implement the same interface. This is the role of adapter
  - non of the existing code is changed 
  - adaptor is an interface that bridges client and adaptee
  
<h5> Adapter from Source making (https://sourcemaking.com/design_patterns/adapter) </h5>

- about making intermediatry abstraction that translates old component to new system
- client uses adaptor object, which redirect them into calls to the legacy component. 
- can be used with inheritance or aggregation
- Check list
  - identify clients and adaptee 
  - identify interface that client require
  - design wrapper class that match adaptee to client
  - ```adapter has a instance of adaptee class ```
  - adapter class maps the client interface to the adaptee interface
  - client uses new interface
- Object adapter uses composition to adapt the Adaptee
![image](https://user-images.githubusercontent.com/26092570/55203912-8c7c8280-51a3-11e9-9024-cdbbaf602323.png)

- Class adapter subclasses the Adaptee and the Target classes
![image](https://user-images.githubusercontent.com/26092570/55203882-7242a480-51a3-11e9-8005-48273b13ea99.png)


<h5> Decorator </h5>

- Motivation:
  - dynamically add data members or methods to an object at runtime
- intent:
  - add new functionality to the existing object without altering its sturcture
  - decorator class wraps the existing object
  - additional functionality while keeping class method signatures intact
  - inheritance is not feasible because it's done at run time, and inheritance is static and applies to the
  entire class
- Key Roles
  - Component - Abstract representing object to be decorated 
  - Concrete Component - many subclass that can be decorated
  - Decorator - Abstract class that wraps a component and will have some of its subclass to decorate it
  - Concrete Decorator - Differnt decorators that add different members to component.
- Key points:
  - Decorator have the same supertype as the object it is decorating
    - given that they have the same supertype we can pass around decorated object instead of original object
    - decorator adds its own behaviour before or after the delegating to the object it is decorating
  - flexible way of subclassing to give additional functionality
    - each decorator has an instance variable that reference the component it is decorating
    - implements the same interface/abstract class as the component the are decorating
    - change in behaviour is before or after the existing methods in the component you are decorating
    - we use inheritance to get type matching, but not to get same behaviour
- Difference between object and class adaptor
  - instead of having an adaptee object inside adapter (composition) to make use of its functionality adapter inherits the adaptee.
  
