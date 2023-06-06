import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),c=sc.nextInt();
        if (a > b) {
            if (a > c) 
                System.out.println(a + " is a Largest Number ");
            else
                System.out.println(c + " is a Largest Number ");
        }
        else if (b > c)
            System.out.println(b + " a Largest Number");
            else
        System.out.println(c+ "a Largest Number");
    }
}
