import com.sun.jdi.StackFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ9012 {
    //문 알맞게 닫으면 됨
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String line = bf.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.empty()) {
                        stack.push(c);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}

