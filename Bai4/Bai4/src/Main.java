// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("quoc1","lambogini1",1000000,100);
        Vehicle vehicle2 = new Vehicle("quoc2","lambogini2",1000000,150);
        Vehicle vehicle3 = new Vehicle("quoc3","lambogini3",1000000,250);


//       Tien thue phai tra



        System.out.println("Tien thue phai tra trc khi mua xe la : " + vehicle1.tienThue());
        System.out.println("Tien thue phai tra trc khi mua xe la : " + vehicle2.tienThue());
        System.out.println("Tien thue phai tra trc khi mua xe la : " + vehicle3.tienThue());


    }
}