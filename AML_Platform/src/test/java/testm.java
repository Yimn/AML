import java.math.BigDecimal;
import java.math.RoundingMode;

public class testm {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(23);
        System.out.println(bigDecimal.divide(bigDecimal1, 4, RoundingMode.HALF_UP));
    }
}