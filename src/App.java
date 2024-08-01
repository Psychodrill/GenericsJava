public class App {
    public static void main(String[] args) throws Exception {
        Float result = new Calculator().divide(20.2, 2);
        Pair values = new Pair<Number, String>(68, "120");
        System.out.println(result);
        System.out.println(values.toString());
    }
}
