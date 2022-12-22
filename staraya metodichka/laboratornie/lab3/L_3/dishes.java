package L_3;

public abstract class dishes {

    public abstract void description();

}

class knife extends dishes{
    int l = 35;
    String mat = "сталь";
    public void description() {
        System.out.println("длина лезвия = " + l + " материал = " + mat);
    }
}

class samovar extends dishes{
    double mas = 2.3;
    String mat = "сталь";
    int ob;
    public void description() {
        System.out.println("масса = " + mas + " материал = " + mat);
    }

}