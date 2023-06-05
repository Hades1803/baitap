// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);

        // Sử dụng constructor đủ tham số
        Triangle triangle2 = new Triangle(3, 4, 6);
        System.out.println(triangle2);

        // Sử dụng setter để thay đổi giá trị cạnh
        triangle2.setMa(6);
        triangle2.setMb(8);
        triangle2.setMc(10);
        System.out.println(triangle2);
    }
}