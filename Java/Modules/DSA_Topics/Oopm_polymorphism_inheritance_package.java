package topics;
// import topics.Oopm_class_constructor; <--  we can import packages using "import" keyword. then we can use its public things.
// Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined. 
// Built-in packages: java, util, io etc.

// ploymorphism --> poly = many, morphism = forms, Polymorphism is the ability to present the same interface for differing underlying forms (data types)
class Oopm_polymorphism_inheritance_package {
    // 2 types:

    class overloading {
        
        // overloading --> compile time polymorphism --> show errors in compiler
        // Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. 
        public void overloading(){
            
        }
        public void overloading(String str){
            
        }
        public void overloading(String str, int name){

        }
    }

    class Overridding{

        // overridding --> run time polymorphism --> because the methods get resolved at the Run-Time.
        // Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class.

        class Over{
            String over = "Over";
        }

        class ridding extends Over{
            public void overridding(String ridding){
                System.out.println(over + "ridding");
            }
        }
    }
}

// inheritance --> one object acquires all the properties and behaviors of a parent object by using "extends" keyword.
class Inheritance{
    // 4 types:

    class Single_inheritance{

        // single inheritance:- ek level niche tk class inherit kr rahi hai, When one class inherits another class, it is known as single level inheritance 
        class Inhe{

        }
        class ritance extends Inhe{
    
        }
    }
    
    class Multilevel_inheritance{

        // Multilevel inheritance:- multiple level niche tk class inherit kr rahi hai, Multilevel inheritance is a process of deriving a class from another derived class. 
        class Inhe{

        }
        class rit extends Inhe{
    
        }
        class ance extends rit{

        }
    }

    class Hierarchical_inheritance{

        // Hierarchial inheritance:- ek base class alag alag subclasses me inherit kr rahi hai,  Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 
        class Inhe{

        }
        class rit extends Inhe{
    
        }
        class ance extends Inhe{
            
        }
    }

    class Hybrid_inheritance{
        // Hybrid inheritence:- different different types ke inheritence ek hi jage pe, Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 
    }
}