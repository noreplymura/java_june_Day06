public class PalindromeNumber {
    static void palindrome(int num){
          int newNum = 0, reminder, temp;
          temp = num;
          while(temp != 0){
                reminder = temp % 10;
                newNum = newNum*10 + reminder;
                temp = temp/10;
          }
          if(newNum == num){
                System.out.println(num +" is palindrome.");
          }else{
                System.out.println(num +" is not palindrome.");
          }
    }    

    public static void main(String args[]){
          palindrome(12321);
    }
}
