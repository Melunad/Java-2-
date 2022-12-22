package R_4;
enum marc{
    Msi,
    Phil,
    Sams,
    intel
}

public class Comp {
    String name;
    cpu obj;
    mon obj1;
    Memor obj2;

    public Comp(marc e, marc r,marc c, marc m) {
        if(e == e.Msi)
            this.name = "MSI";
        this.obj = new cpu(c);
        this.obj1 = new mon(m);
        this.obj2 = new Memor(r);
    }


    public String toString() {
        return "Firm Comp = "  + name + '\n' + obj + '\n' + obj1 + '\n' +obj2 ;
    }
}

class cpu{
    String name;

    public cpu(marc f) {
        if(f == f.intel)
        this.name = "INTEL";
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "cpu firm = " + name ;
    }
}

class mon{
    String name;

    public mon(marc f) {
        if(f == f.Phil)
            this.name = "PHILIPS";
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "monitor firm = " + name;
    }
}

class Memor{
    String name;

    public Memor(marc f) {
        if(f == f.Sams)
            this.name = "Samsung";
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Memory firm = " + name ;
    }
}