public class sinhVien {
    private int ID;
    private String name;
    private double diemLT;
    private double diemTH;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public sinhVien() {
    }

    public sinhVien(int ID, String name, double diemLT, double diemTH) {
        this.ID = ID;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public double diemTB(){
        return (diemLT+diemTH)/2;
    }
}