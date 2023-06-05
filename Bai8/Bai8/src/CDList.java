public class CDList {
    private CD[] cdList;
    private int n;

    public CDList(int i) {
    }

    public void addCD(CD cd){
        if(this.cdList.length < this.n){
            int tmp = 0;
            for(int i = 0; i < this.cdList.length ; i++){
                if (cd.getMaCD()==this.cdList[i].getMaCD()){
                    tmp++;
                    System.out.println("mã CD bị trùng");
                }

            }
            if (tmp == 0){
                this.cdList[this.cdList.length] = cd;
                System.out.println("add thanh cong");
            }
        }else
            System.out.println("Danh sách đã đầy!!");
    }

    public void setN(int i) {
    }

    public void setCdList(CD[] list) {
    }

    public CD[] getCdList() {
    }
}

