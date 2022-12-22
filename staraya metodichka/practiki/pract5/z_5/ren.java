package z_5;


public class ren {
    int k,s, numb, sumk, f = 0;
    public ren(int k, int s) { // задача номер 4
        this.k = k;
        this.s = s;

        for(numb = (int) Math.pow(10,k-1); numb < (int) Math.pow(10,k) - 1; numb++) {

            sumk = 0;
            sumcoun(numb);

            if(sumk == s) {
                System.out.println(numb + " = " + sumk);
                f = f+1;
            }
        }
        System.out.println("всего =  " + f);

    }

    public ren(int k) { // задача номер 5
        this.k = k;
        sumcoun(k);
        System.out.println("сумма цифр числа =  " + sumk);
    }

    public ren(double k){ // номер 6
        int m = (int) k;
        natur(m,1);
        if(f <= 2){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }

    public ren(int x,double y){
        
    }

    public void sumcoun(int numb){
        if(numb != 0) {
            int b = numb;
            sumk = sumk + b % 10;
            b /= 10;
            sumcoun(b);
        }
    }

    public void natur(int n,int m ){

        if (m <= n) {
            if (n % m == 0) {
                f++;
            }
            natur(n, m + 1);
        }
    }




}
