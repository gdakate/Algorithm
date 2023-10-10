import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int value =1;
        int result =0;

        for(int i=0;i<line.length();i++){
            char bracket = line.charAt(i);
            if(bracket=='('){
                stack.push('(');
                value*=2;
            }
            else if(bracket=='['){
                stack.push('[');
                value*=3;
            }
            else if(bracket==')'){
                if(stack.isEmpty()||stack.peek()!='(') {
                    result=0;
                    break;
                }
                else if(line.charAt(i-1)=='('){
                    result+=value;
                }
                stack.pop();
                value/=2;
            }
            else if(bracket==']'){
                if(stack.isEmpty()||stack.peek()!='[') {
                    result=0;
                    break;
                }
                else if(line.charAt(i-1)=='['){
                    result+=value;
                }
                stack.pop();
                value/=3;
            }
        }
        if(!stack.isEmpty()) sb.append(0).append("\n");
        else sb.append(result).append("\n");
        System.out.println(sb);
    }

}
