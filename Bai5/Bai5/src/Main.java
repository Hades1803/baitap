import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date pastDate = new Date(currentDate.getTime() - 86400000); // 1 day ago
        Date nextDate = new Date(currentDate.getTime() + 86400000); // 1 day ago

        HangThucPham hang1 = new HangThucPham("H001");
        HangThucPham hang2 = new HangThucPham("H002", "YYY", 10000, currentDate, currentDate);
        HangThucPham hang3 = new HangThucPham("H003", "ZZZ", 20000, pastDate, nextDate);

        System.out.println(hang1);
        System.out.println(hang2);
        System.out.println(hang3);
    }
}