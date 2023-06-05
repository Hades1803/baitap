public class Triangle {
    private double ma;
    private double mb;
    private double mc;
    public Triangle() {
        ma = 0;
        mb = 0;
        mc = 0;
    }

    public Triangle(double ma, double mb, double mc) {
        if (ma <= 0 || mb <= 0 || mc <= 0 || !isValidTriangle(ma, mb, mc)) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    // Phương thức kiểm tra tính hợp lệ của tam giác
    private boolean isValidTriangle(double ma, double mb, double mc) {
        return ma + mb > mc && mb + mc > ma && mc + ma > mb;
    }

    // Getter và setter
    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        if (ma > 0 && isValidTriangle(ma, mb, mc)) {
            this.ma = ma;
        }
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        if (mb > 0 && isValidTriangle(ma, mb, mc)) {
            this.mb = mb;
        }
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        if (mc > 0 && isValidTriangle(ma, mb, mc)) {
            this.mc = mc;
        }
    }

    // Phương thức tính chu vi tam giác
    public double calculatePerimeter() {
        return ma + mb + mc;
    }

    // Phương thức tính diện tích tam giác bằng công thức Heron
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    // Phương thức trả về thông tin về tam giác
    public String getTriangleType() {
        if (ma == mb && mb == mc) {
            return "Tam giác đều";
        } else if (ma == mb || mb == mc || mc == ma) {
            return "Tam giác cân";
        } else if (ma * ma == mb * mb + mc * mc || mb * mb == ma * ma + mc * mc || mc * mc == ma * ma + mb * mb) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Thông tin tam giác: " +
                "cạnh a = " + ma +
                ", cạnh b = " + mb +
                ", cạnh c = " + mc +
                ", loại tam giác: " + getTriangleType() +
                ", chu vi = " + calculatePerimeter() +
                ", diện tích = " + calculateArea();
    }
}

