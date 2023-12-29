class Persons {
   // Attributes of the base class
    protected String name;
    protected  int age;

    //Default constructor
    public Persons(){
        //provide default values if needed
        this.name = "None";
        this.age = 0;
    }
    // Parametrized Constructor for the base class
    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method to display information about the person
    public  void displayPersonsInfo(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}

    // Subclass Employee inheriting from Persons
class Employee extends Persons{
        // Additional attributes in the subclass
        private  int employeeID;
        private  double salary;

        // constructor for the Employee class using super to initialize base class attributes
        public  Employee(String name, int age,int employeeID, double salary){
            //call the constructor of the base class using super
            super(name,age);

            //Initialize attributes specific to the subclass
            this.employeeID = employeeID;
            this.salary = salary;
        }

        // Method to display information about the employee
        public void displayEmployeeInfo(){
            //Call the displayPersonsInfo methods from the base class
            displayPersonsInfo();

            System.out.println("EmployeeID = " +employeeID);
            System.out.println("Salary = " +salary);
        }
    }

public  class Main{
    public  static void  main(String[] args){
        // create an instance of the Employee class
        Employee employee1 = new Employee("Raven",32, 223675,78000);

        //Display information about the employee
        employee1.displayEmployeeInfo();
    }
}
