public class HinhTron {
    private ToaDo tam;
    private double banKinh;

    private final double PI = 3.14;

    public HinhTron() {
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double chuVi(){
        return 2*PI*this.banKinh;
    }
    public double dienTich(){
        return PI*(this.banKinh)*(this.banKinh);
    }
    @Override
    public String toString(){
        return "Hinh tron co tam " + this.tam.toString() + "voi ban kinh la : "+ this.banKinh+"\n"+
                "Co Chu Vi la : " + this.chuVi() +"\n"+
                "Co Dien Tich la :" + this.dienTich();
    }
}
