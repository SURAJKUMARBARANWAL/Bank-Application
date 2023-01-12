public class Main {
    public static void main(String[] args) {

        hdfcUser user1=new hdfcUser("SURAJ KUMAR",1000000,"Kumar#123");
        hdfcUser user2=new hdfcUser("NEERAJ KUMAR",5000000,"Neeraj#123");
        System.out.println(user1.checkBalance());
        System.out.println(user1.getPassword());
        user1.addMoney(120000);
        System.out.println(user1.checkBalance());
        System.out.println(user1.calculateRateOfInterest(1));

    }
}