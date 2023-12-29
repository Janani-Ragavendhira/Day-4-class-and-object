public class Person {
    String name;
    int age;

    Person(int n){      //passing the age parameter as n in constructor
        age = n;
    }

    public static void main(String[] args){
        Person person = new Person(18);         //set the parameter value
        person.name = "Janani";
        person.personMethod();                  // calling method to print name and age
    }

    public void personMethod(){                 //initializing the method
        System.out.println("Name : "+ name);
        System.out.println("age : "+ age);
    }
}
