public class Palindrome {
    public static boolean palindrome(String s){
        int n = s.length();
        if(n<=1){
            return false;
        }
        StringBuffer s_reverse = new StringBuffer(s);
        s_reverse.reverse();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s_reverse.charAt(i)) {
                count++;
            }
        }
        if (count == n) {
            System.out.println("Palindrome!");
            return true;
        }

        System.out.println("Not Palindrome!");
        return false;

    }

    public static void main(String[] args) {
        String string = "abbba";
        palindrome(string);
    }
}
