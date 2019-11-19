public class X {
    public static void main(String[] args) {
        int x = 1;
        if (x != (x += 0.0f)) {
            System.out.println("WTF");
        }
    }
}
