import java.io.*;
import java.util.*;

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        Stack<int[]> stack = new Stack<>();
        for(int i = 1; i <= n; i++) {
            int top = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()) {
                if(stack.peek()[1] >= top) {
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.print("0 ");
            }
            stack.push(new int[] {i, top});
        }
    }
}
