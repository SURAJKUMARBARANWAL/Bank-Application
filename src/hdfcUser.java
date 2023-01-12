import java.util.Objects;
import java.util.UUID;

public class hdfcUser implements Bank {
    public String name;
    private double balance;
    private String password;
    public String accountNumber;
    public static double rateOfInterest=10;

    public hdfcUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String addMoney(double balance) {
        this.balance+=balance;
        return "YOUR NEW AMT:"+this.balance;
    }

    @Override
    public String withdrawMoney(double balance, String password) {
        if(Objects.equals(password,this.password)){
            //we can withdrawMoney
            if(this.balance>balance){
                this.balance-=balance;
                return "Successfully withdraw";
            }
            return "Your bal is not sufficient";
        }
        return "your passs is incorrect";
    }

    @Override
    public String checkBalance() {
        return "YOUR BAL:"+this.balance;
    }

    @Override
    public double calculateRateOfInterest(double time) {
       return (this.balance*rateOfInterest*time)/100;
    }

}
