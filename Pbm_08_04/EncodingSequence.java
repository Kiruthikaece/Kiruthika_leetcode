import java.util.Scanner;
import java.util.Stack;

class EncodingSequence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        String result=Encoding(str);
        System.out.println(result);
         
    }
    public static String Encoding(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= s.length(); i++) {
            stack.push(i + 1);
            if (i == s.length() || (i < s.length() && s.charAt(i) == 'I')) {
                while (!stack.isEmpty()) {
                    ans.append(stack.pop());
                }
            }
        }

        return ans.toString();
    }
}