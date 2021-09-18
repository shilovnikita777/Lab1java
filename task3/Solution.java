public class Switch {
  public static String switcheroo(String x) {
        x = x.replaceAll("a", "1");
        x = x.replaceAll("b", "2");
        x = x.replaceAll("1", "b");
        x = x.replaceAll("2", "a");

        return x;
  }
}