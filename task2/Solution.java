public class Kata {
  public static String createPhoneNumber(int[] numbers) {
        String number = java.util.Arrays.toString(numbers).replaceAll("\\[|\\]|,|\\s", "");
        String n = "(";
        StringBuilder phoneNumber = new StringBuilder(n);

        for (int i = 0; i < 3; ++i) {
            phoneNumber.append(number.charAt(i));
        }

        phoneNumber.append(") ");

        for (int i = 3; i < 6; ++i) {
            phoneNumber.append(number.charAt(i));
        }

        phoneNumber.append("-");

        for (int i = 6; i < 10; ++i) {
            phoneNumber.append(number.charAt(i));
        }

        return phoneNumber.toString();
  }
}