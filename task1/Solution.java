public class DigPow {
  
  public static long digPow(int n, int p) {

        int n1 = n;

        String k = String.valueOf(n1);
        int j = k.length();

        double divisor = 10;
        divisor = Math.pow(divisor, j - 1);

        double sum = 0;

        for (int i = 0; i < j; ++i) {
            double number = n1 / divisor;
            int numb1 = (int) number;

            sum += Math.pow(numb1, p);
            p++;
            n1 %= divisor;
            divisor /= 10;
        }

        if ((int) sum % n == 0) {
            return ((int) sum / n);
        } else {
            return (-1);
        }
  }
  
}