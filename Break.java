public class Break {
    public static void main(String[] args) {

        int x = 10;
        int i = 0;

        while(i < x) {
            if(i == 5) {
                break;
            }
            i++;
        }

        System.out.println("Hello World");
    }
}
