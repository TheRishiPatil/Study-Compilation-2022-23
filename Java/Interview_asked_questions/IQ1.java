package Interview_asked_questions;
// print 1-100 without using loop
public class IQ1 {
 public static void main(String[] args) {
      num(1);
 }   
 static public void num(int a){
    if (a <= 100) {
        System.out.println(a);
        num(a+1);
    }
 }
}