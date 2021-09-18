public class PrimeDecomp {
   
    public static String factors(int n) {
        StringBuilder output = new StringBuilder("(");
        //int n = 52714752;
        int n1 = n;

        int divisor = 2;
        int counter = 0;

        while (n1 > 1) {
            if (n1 % divisor == 0 && Simple(divisor)) {
                // if (n1 % divisor == 0) {
                while (n1 % divisor == 0) {
                    n1 /= divisor;
                    counter++;
                    // System.out.println(n1 + " : " + divisor);
                }
                if (counter > 1) {
                    output.append(divisor + "**" + counter + ")(");
                } else {
                    output.append(divisor + ")(");
                }
                //System.out.println(output.toString());
                // }
            }
            if (divisor % 2 == 0)
                divisor++;
            else
                divisor += 2;
            counter = 0;
        }
        output.deleteCharAt(output.length() - 1);
        return (output.toString());
    }
    
    public static boolean Simple(int n) {
        if (n == 2 || n == 3)
            return true;
        for (int i = 3; i <= Math.sqrt((double) n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
       
}