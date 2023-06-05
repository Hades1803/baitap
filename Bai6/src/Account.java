import java.text.NumberFormat;
import java.util.Locale;

public class Account {

        private int accountNumber;
        private String name;
        private double balance;
        private final double RATE = 0.035;

    public Account() {
            this.accountNumber = 999999;
            this.name = "Chua Xac Dinh";
            this.balance = 50000;
        }

        public Account(int accountNumber, String name, Double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }

        public Account(int accountNumber, String name) {
            this.accountNumber = accountNumber;
            this.name = name;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public Double getBalance() {
            return balance;
        }

        public boolean deposit(double amount){
            if(amount > 0){
                this.balance+=amount;
                return true;
            }else{
                return false;
            }
        }
        public boolean withDraw(double amount, double fee){
            if(amount > 0 && amount+fee<=balance){
                this.balance -= (amount + fee);
                return true;
            }else {
                return false;
            }
        }
        public Double addIntersest(){
            balance = balance + balance*RATE;
            return balance;
        }
        public boolean transfer(Account acc2,Double amount){
            if (amount>0){
                this.balance -= amount;
                acc2.balance+=amount;
                return true;
            }else {
                return false;
            }
        }
        public String toString(){
            return "Ten tai khoan :" + this.name + "\nSo tai khoan :" + this.accountNumber+"\nSo du : " + this.dinhdangtien() +"\n-----------------------------------------------";

        }
        public String dinhdangtien(){
            Locale local = new Locale("fr","fr");
            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
            return formatter.format(this.balance);
        }

    }


