public interface Bank {
    String addMoney(double balance);
    String withdrawMoney(double balance, String password);
    String checkBalance();
    double calculateRateOfInterest(double time);

}
