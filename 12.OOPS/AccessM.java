public class AccessM {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Chandana";
        myAcc.setPassword("abcd");
    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
        System.out.println(password);
    }
}
