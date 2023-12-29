import java.util.Scanner;

class Product {
    //defining the class with attributes pid,price and quantity
    int pid;
    double price;
    int quantity;
     public Product(int pid,double price,int quantity) {    //initialize the data member in  parametrized constructor
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

//    Method to calculate the total amount on each product
    public double calculateEachProdTotal(){
         return price * quantity;
    }
}

public class ProdInfo {


    public static  void main(String[] args) {
        // 1. Accept number of product information from the user and store in an array
        int n;
        //float t = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num of products : ");
        n = scan.nextInt();

        Product[] products = new Product[n];    // Create an array to store product objects
        getProductDetails(products);

        int highestPricePid = findHighestPriceProduct(products);            // 2. Find pid of the product with the highest price
        System.out.println("Product with Highest price (Pid) : " + highestPricePid);

        calAndDisplayEachProdTotal(products);               // 3. Calculate and display the total amount spent on each product

        double totalAmountSpent = calculateTotal(products);             // 4. Calculate and return the total amount spent on all products
        System.out.println("Total : RS." + totalAmountSpent);

    }
    // Function to accept product details
     static void getProductDetails(Product[] products) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter the pid : ");
            int pid = sc.nextInt();
            System.out.println("Enter the price : ");
            double price = sc.nextFloat();
            System.out.println("Enter the quantity : ");
            int quantity = sc.nextInt();

            // Create a Product as array of object with the entered details
            products[i] = new Product(pid, price, quantity);

        }
    }
    // Function to find pid of the product with the highest price
    static int findHighestPriceProduct(Product[] products){
        double maxPrice = Double.MIN_VALUE;
        int highestPricePid = -1;

        // Accept product details and find the highest-priced product
            for(Product product : products){
                if(product.price > maxPrice){
                    maxPrice = product.price;
                   highestPricePid = product.pid;
                }
          }
        return highestPricePid;
    }
    // Function to calculate and display the total amount spent on each product
    static void calAndDisplayEachProdTotal(Product[] products){
        System.out.println("Total amount spent on each product: ");

        for(Product product : products){
            double totalAmount =product.calculateEachProdTotal();
            System.out.println("Product : " + product.pid +  "  Rs. " + totalAmount);
        }
    }
    // Function to calculate and return the total amount spent on all product
    static double calculateTotal(Product[] products){
        double totalAmount = 0;

        for(Product product : products){
            totalAmount += product.price * product.quantity;
        }
        return  totalAmount;
    }
}