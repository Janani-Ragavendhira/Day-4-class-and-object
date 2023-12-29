public class Account {
    double balance;

    public Account(){       //No argument constructor
        this.balance = 0.0;
    }

    public Account(double initialBalance){   // argument constructor
        if (initialBalance >= 0){
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. setting the balance into 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit amount
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposit successful. New balance : Rs. " + this.balance);
        } else{
            System.out.println("Invalid amount.Please enter a positive value");
        }
    }

    // Method to withdraw the amount
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("Withdrawal Successful. New Balance : Rs. " + this.balance);
        }else if (amount <= 0){
            System.out.println("Invalid amount. Please enter a proper amount");
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display Balance
    public void displayBalance(){
        System.out.println("Current Balance : " + this.balance);
    }

    public  static  void main(String[] args){
        //crate an account with initial balance
        Account account1 = new Account();

        //Display the initial balance
        account1.displayBalance();

        //Deposit 10000 into the account
        account1.deposit(10000);

        //Withdraw 2000 from the account
        account1.withdraw(2000);

        //display the final balance
        account1.displayBalance();
    }
}
