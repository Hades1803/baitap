// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         //Tạo đối tượng tọa độ bằng constructor mặc định
        Coordinate coordinate1 = new Coordinate();
        coordinate1.setX(10);
        coordinate1.setY(20);
        coordinate1.setName("A");

         //Tạo đối tượng tọa độ bằng constructor đầy đủ tham số
        Coordinate coordinate2 = new Coordinate(30, 40, "B");

         //In thông tin tọa độ
        System.out.println(coordinate1.toString());
        System.out.println(coordinate2.toString());
    }
}