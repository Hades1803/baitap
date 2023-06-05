// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Account account1 = new Account(1,"quoc",300000.00) ;
        Account account2 = new Account(2,"quoc",500000.00) ;
        Account account3 = new Account(3,"quoc",500000.00) ;



        account1.deposit(400000.00);
        account2.deposit(500.00);
        account2.withDraw(450.75,1.50);
        account3.addIntersest();
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());



    }
}