package R_3_NEW.Z_One.z_1_1.z_1_1;

public class start {
    public static void main(String[] args) {
        double[] a = new double[10];
        for(int i = 0; i < 10; i++) {
            a[i] = Math.random();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if(a[j] > a[j+1]){
                    double buf = a[j];
                    a[j] = a[j+1];
                    a[j+1] = buf;
                }
            }
        }
        System.out.println("array sort -----------------------------------");
        for(int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
