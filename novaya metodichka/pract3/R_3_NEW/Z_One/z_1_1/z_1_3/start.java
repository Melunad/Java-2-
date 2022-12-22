package R_3_NEW.Z_One.z_1_1.z_1_3;
import java.util.Random;

public class start {
    public static void main(String[] args){
        Random rand = new Random();
        int []a = new int[4];
        for(int i = 0; i < 4; i++)
            a[i] = 10 + rand.nextInt(90);
        for(int i = 0; i < 4; i++)
            System.out.println(a[i]);
        int f = 0;
        for(int i = 0; i < 3; i++){
            if(a[i] > a[i+1])
                f =1;
        }
        if(f == 0)
            System.out.println("строго возрастающая последовательность");
    }
}
