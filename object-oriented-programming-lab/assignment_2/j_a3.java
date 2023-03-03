package assigment_2;

// a Java program with a parameterized constructor:

public class j_a3 {
    String name;
    int age;
    
    // Parameterized constructor
    public j_a3(String name, int age) {
       this.name = name;
       this.age = age;
    }
    
    public static void main(String[] args) {
       // Creating an object of Person class using parameterized constructor
       j_a3 person = new j_a3("sandipan pradahan", 25);
       
       // Accessing instance variables and printing their values
       System.out.println("Name: " + person.name);
       System.out.println("Age: " + person.age);
    }
 } 