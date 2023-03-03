package assigment_2;

// a Java program with a default constructor:
public class j_a2 {
    String name;
    int age;
    
    // Default constructor
    public j_a2() {
       name = "sandipan pradhan";
       age = 19;
    }
    
    public static void main(String[] args) {
       // Creating an object of Person class using default constructor
       j_a2 person = new j_a2();
       
       // Accessing instance variables and printing their values
       System.out.println("Name: " + person.name);
       System.out.println("Age: " + person.age);
    }
 }
 /* 
 Name: sandipan pradhan
 Age: 19 
 */