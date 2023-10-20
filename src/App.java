public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Holydayzer today = new Holydayzer();
        System.out.println(today.isHolyday("12/10/2023"));
    }
}
