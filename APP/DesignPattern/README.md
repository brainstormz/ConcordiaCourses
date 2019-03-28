<h1> Design Patterns </h1>

<h3> introduction </h3>

- Pattern has 4 essential elements
  - name  
    - It lets us design software at a higher level of abstraction without looking into specific details of code
    - It's basically what we use to describe design problems, its solution, consequences of using the solution and trade offds
    - helps us to communicate the software problem
  - problem
    - the problem that enables us to look for such design pattern and apply them 
    - there are usually different context of design problems
        - a) how to represent algorithms as objects
        - b) how to describe class and objects that results from a inflexible design
    - there may list of conditions to  *checklist* before a particular design pattern can be used
  - solultion
    - describes the elements that make up the design pattern solution (how the elements are related, responsibilities of each element,
    and how do elements collaborate)
    - a design pattern doesn't try to follow a partiular implementation or concrete design because
    they can be applied in many different situatinons
    - namely, pattern describes an abstract description of a problem and shows a general way of solving them
  - consequence
    - this is normally trade-offs of applying such pattern
    - tradeoffs often include questions like: is it flexible? is it extensible? portable?
    
<h3> Types of design patterns (Gang of Four; defines 23 design pattern) </h3>

- 3 types of design patterns
  - creation pattern
  - structural pattern
  - behavioral pattern
  
- creational pattern
  - creates objects for you, rather than having you instantiate objects directly
  - gives you flexibility in deciding when the object should be created
- structural pattern
  - used to compose group of objects into larger structure
  - used for creating complex UI
- behavioural pattern
  - help you define communication between objects in your systems and how the flow is controlled in complex program
  
  
<h4> programming to an interface </h4>

- focus your design on what the code is doing, but not how it does it
- if you write code based on how it accomplishes the task, then it's going to be harder for you to adopt changes in the future because
you are programming to a specific implementation. Namely, if you have to write program such that implementation can change depending on
requirement change.  
   

<h1> Techlead vid </h1>

- have one way data flow
  - if there is a problem in the code, you know it's going to be in business logic like controller
  - if there is UI error you know it's in the view
- limit objects in the program (so just have data objects, controlller and view)

<h3> single responsibility principal </h3>

- if you can't explain what a single responsbility of a class does, then it's to break it down
- singleton doesn't have a lot of dependencies (each team may create one singleton which may not affect others)
  - problem: easily introduce 2 way data flow - (singleton A talking with singleton B) - hard to tell what the programm is doing. 
  So, you have to start thinking about communication patterns (may be it can issue a notification and other singleton can listen to it;
  this will stop 2 way data flow). 
    - this is known is publish subscribe (encourages 1 way data flow)
    - another is known as delegate pattern (IOS), where object can give call back to another object explaining what it's doing
    - last one, chain of responsibility pattern (seen in hierarchical tree structure). Child will issue an event and parent will
    try to handle, if not then great parents.
      - event bubbling may be anti pattern? because it's a 2 way data flow? 
- OOP is pushed in school, inheritance especially? but, in reality, inheritance is poor design structure. If you don't do it right
you have subclass communicating to super then super super(). Namely, there is a communication between different levels of inheritance, and over time inheritance structure becomes deeply tied where it will be hard to refactor. 
  - maybe break subclass if you try to refactor superclass?
- so think about composition pattern (without getting into intertangled structure)
- LAZY initialization = great to improve performance time
- other important are adaptor (protocall or wrapper), factory builder (create heterogenous different component)
- other design pattern are mixins, plugins (but these get more advanced, so keep it simple!)
 
