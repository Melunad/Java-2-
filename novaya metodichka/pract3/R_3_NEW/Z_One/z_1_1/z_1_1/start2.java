package R_3_NEW.Z_One.z_1_1.z_1_1;
import java.util.Random;

public class start2 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] a = new double[10];
        for(int i = 0; i < 10; i++) {
            a[i] = rand.nextDouble(1);
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
