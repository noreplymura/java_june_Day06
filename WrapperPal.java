//primitive to wrapper Pal
import java.util.Scanner;
public class WrapperPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int test = num;
        for(int i=0;i>=0;i++)
        {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
            if (num == 0)
                break;
        }
        if (num == rev)
            System.out.println(num + " is Palindrome");
    else System.out.println(test+" Not palindrome");
}
    }
