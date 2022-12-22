package R_3_NEW.Z_3;

import java.text.NumberFormat;
import java.util.Locale;

public class start {
    public static void main(String[] args) {
        NumberFormat.getPercentInstance(Locale.GERMANY);
        double money = 67;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(numberFormat.format(money));
        System.out.println(numberFormat1.format(money / 62.45 ));
    }
}
