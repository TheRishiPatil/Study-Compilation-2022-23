package topics;

// Access Modifiers --> it defines ki konsi chiz kisko access hogi
public class Oopm_accessModifier_abstraction_interface {
    // 4 types:

    public class Public{
        public String name;
        protected String email;
        // public --> accessed by anyone.  It can be accessed from within the class, outside the class, within the package and outside the package.
    }

    class Default{
        String number;
        // default -->  accessed by own package, but not other packages.  If you do not specify any access level, it will be the default.
    }

    protected void Protected() {
        // protected --> accessed by own package as well as other package through child class, If you do not make the child class, it cannot be accessed from outside the package.
    }

    private class Private{
        private String password;
        // private -->  accessed by within the class. It cannot be accessed from outside the class.
        // private can be accessed by getter(returns the value) and setter(set the value). we can't directly access private function.

        // Getter
        public String getpassword() {
            return password;
        }

        // Setter
        public void setpassword(String newpassword) {
            this.password = newpassword;
        }
    }

    /* 
    Encapsulation --> Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. 
    Thus, encapsulation makes the concept of data hiding possible.
    data hiding -->  we implement data hiding concept with the help of access modifier. 
    */
    
}

// abstraction --> imp chize user ko dhikana and non-imp chize hide krna. hiding the unnecessary details & showing only the essential parts/functionalities to the user.
class Abstraction{
    // Abstraction is achieved in 2 ways :
    
    // Abstract class
    abstract class AbStract{
    /*
        Properties:-
        An abstract class must be declared with an abstract keyword.
        It can have abstract and non-abstract methods.
        It cannot be instantiated.
        It can have constructors and static methods also.
        It can have final methods which will force the subclass not to change the body of the method.
    */
    }
    class NewAbstract extends AbStract{

    }

    // Interfaces (Pure Abstraction)
    interface Interface{
    /*
        we can't create constructors in interface
        we can't create any function in interface except abstract function
        we can acquire properties of parent class to child class using "implement" keyword. implement = use

        Properties:-
        All the fields in interfaces are public, static and final by default.
        All methods are public & abstract by default.
        A class that implements an interface must implement all the methods declared in the interface.
        Interfaces support the functionality of multiple inheritance.
    */
    }
    class NewInterface implements Interface{

    }
}