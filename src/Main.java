import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        String pal = "", reversePal = "";


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
         pal=sc.next();

        int palLength = pal.length();
        for (int i = (palLength - 1); i >=0; --i) {
            reversePal = reversePal + pal.charAt(i);
        }
        System.out.println( reversePal);
          if (pal.toLowerCase().equals(reversePal.toLowerCase())) {
            System.out.println(pal + " is a Palindrome String.");
        }
        else {
            System.out.println(pal + " is not a Palindrome String.");
        }
    }
}
