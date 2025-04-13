import java.util.*;
public class Stack {
    public static void main(String[] args) {
        //String str = "((a+b)*(c-d))";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }
    static boolean check(String str){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        char[] str2 = str.toCharArray();
        for(char c : str2){
            if(c == '(') stack.push(c);
            else if(c == ')'){
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

}