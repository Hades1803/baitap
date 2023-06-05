class Coordinate {
    private int x;
    private int y;
    private String name;

    // Constructor mặc định
    public Coordinate() {
        this.x = 0;
        this.y = 0;
        this.name = "";
    }

    // Constructor đầy đủ tham số
    public Coordinate(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // Setter và Getter cho tọa độ x
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    // Setter và Getter cho tọa độ y
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // Setter và Getter cho tên tọa độ
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Phương thức toString
    public String toString() {
        return name + "(" + x + "," + y + ")";
    }
}




