package topics;

public class Bit_manipulation {
    public static void main(String[] args) {
        int a = 5; // binary value :- 0101
        int position = 1;
        int condition = 1;
        
        get_my_bit(a, position);
        set_my_bit(a, position);
        clear_my_bit(a, position);
        update_my_bit(a, position, condition);
    }

    public static void get_my_bit(int a, int position) { // here we get number of bit is zero or one
        int bitmask = 1 << position; // bitmask : 1 << a
        if ((bitmask & a) == 0) {    // operation : AND with Bitmask
            System.out.println("zero");
        } else
        System.out.println("one");
    }

    public static void set_my_bit(int a, int position) { // here we set one number atleast  1 in the final ans
        int bitmask = 1 << position; // bitmask : 1 << a
        int newnumber = bitmask | a; // operation : OR with Bitmask
        System.out.println(newnumber);
    }

    public static void clear_my_bit(int a, int position) { // here we clear the bit number due to atleast one 0 in final ans.
        int bitmask = 1 << position; // bitmask : 1 << a
        int changenumber = ~(bitmask); // operation : AND with NOT Bitmask
        int newnumber = changenumber & a;
        System.out.println(newnumber);
    }

    public static void update_my_bit(int a, int position, int condition) {
        int bitmask = 1 << position;
        if (condition == 1) {
            int newnumber = bitmask | a; // if condition = 1 do set operation
            System.out.println(newnumber);
        } else{
            int changenumber = ~(bitmask); // if condition = 0 do clear operation
            int newnumber = changenumber & a;
            System.out.println(newnumber);
        }
    }
}