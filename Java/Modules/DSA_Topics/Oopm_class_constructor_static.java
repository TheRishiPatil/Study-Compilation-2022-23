package topics;

// Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.

/*NOTE:-
    we don't write distructor, because java already have garbage collector

    new --> it creates an storage to store objects in heap memory.

    When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.
*/


class Class{
        /* 
            Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data
            Object is a run-time entity. It is an instance of the class.
        */ 

        /*
            Constructors -->
            3 properties:-
            constructor always have same name as class.
            constructors never return anything, they don't have return type and not void. they just used for constructing objects.
            we can call consrtuctor only one time after creating object.
        */
    Class(){
            // non parameterized constructor --> A constructor which has no argument
    }

    Class(int c){
            // Parameterized constructor --> Constructor which has parameters
    }

    Class(Class a){
            // Copy Constructor --> A Copy constructor is an overloaded constructor used to declare and initialize an object from another object. 
    }

}

    /*
        static -->  if we have limited memory and there are repeated info then we use static.
        static is stored at once
        Static can be : 
        Variable (also known as a class variable)
        Method (also known as a class method)
        Block
        Nested class

    */
