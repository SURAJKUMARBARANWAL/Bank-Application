public class Main {
    public static void main(String[] args) {

        hdfcUser user1=new hdfcUser("SURAJ KUMAR",1000000,"Kumar#123");
        System.out.println(user1.checkBalance());
        System.out.println(user1.withdrawMoney(1000000,"Kumar#123"));
        user1.addMoney(120000);



    }
}