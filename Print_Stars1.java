public class Print_Stars1 {
    public static void print_multiple_stare(int i) {
        int k  = 0;
        for (; k <= i; k = k + 1) {
            System.out.print(" * ");
        }
    }
    public static void main(String[] args) {
        int j = 5;
        print_multiple_stare(j);
        System.out.println(" ");
    }
}
