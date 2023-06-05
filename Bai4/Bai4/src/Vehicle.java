public class Vehicle {
    private String name;
    private String loaiXe;
    private int price;
    private int CC;

    public Vehicle() {
    }

    public Vehicle(String name, String loaiXe, int price, int CC) {
        this.name = name;
        this.loaiXe = loaiXe;
        this.price = price;
        this.CC = CC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public void setPrice(int price) {
        if (price >= 0){
            this.price = price;
        }
    }

    public void setCC(int CC) {
        if (CC >= 0){
            this.CC = CC;
        }
    }

    public String getName() {
        return name;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getPrice() {
        return price;
    }

    public int getCC() {
        return CC;
    }
    public float tienThue(){
        float thue = 0;
        if (CC <= 100){
            thue = price/100;
        } else if (CC<=200) {
            thue = price/100*3;

        }else {
            thue = price/100*5;
        }
        return thue;
    }
}
