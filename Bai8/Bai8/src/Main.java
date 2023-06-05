// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CD cd2 = new CD(12346,"nhac tru trinh",20,202000);
        CD[] list = {};
        CDList cdl = new CDList(2);
        cdl.setN(2);
        cdl.setCdList(list);
        cdl.addCD(cd2);
        System.out.println(cdl.getCdList()[0].getMaCD());
    }
}