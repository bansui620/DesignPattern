package patterns.templateMethod;

public class Client {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        currentAccount.handle("admin","123456");
        System.out.println();
        Account savingAccount = new SavingAccount();
        savingAccount.handle("admin","123456");
    }
}
