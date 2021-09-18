public class Kata {
  public static String highAndLow(String str) {
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        int min = numArr[0];
        int max = numArr[0];
        for (int i = 0; i < numArr.length; ++i) {
            System.out.println(numArr[i]);
            if (numArr[i] < min) {
                min = numArr[i];
            }
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        return (max + " " + min);
  }
}