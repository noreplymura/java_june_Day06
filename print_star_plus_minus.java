import java.util.*;
public class print_star_plus_minus{
    public static void print_multiple_char(int i,char c) {
        int k  = 0;
        for (k = 1;k <= i; k = k + 1) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        char ch = sc.next().charAt(0);
        print_multiple_char(j,ch);
        print_multiple_char(j+1,ch);
        print_multiple_char(j+ 2,ch);
       
    }
}
