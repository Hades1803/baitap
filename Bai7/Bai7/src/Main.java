// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToaDo td = new ToaDo(5,5);
        td.setTen("O");
        HinhTron ht = new HinhTron();
        ht.setTam(td);
        ht.setBanKinh(10.5);
        System.out.println(ht.toString());
        }
    }
