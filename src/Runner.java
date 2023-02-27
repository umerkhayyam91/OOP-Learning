public class Runner {
    public static void main(String[] args) {
        Abstraction abs = new Abstraction();
        abs.info();
        int x = abs.add(5, 6);
        System.out.println(x);
    }
}
