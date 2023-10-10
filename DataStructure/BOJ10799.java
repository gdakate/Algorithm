import java.io.*;
import java.util.Stack;

public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        /*
        () 쌍이 막대기 개수
        레이저로 쇠막대기 자름 -> 레이저 개수 +1 개 만큼 잘림
        레이저 ()로 표현
        잘린 최종 막대 수 구하기
        * */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        Stack<Character> stack = new Stack<>();


        int sum =0;


        for(int i=0;i<line.length();i++) {
            char bracket = line.charAt(i);
            if (bracket == '(') {
                stack.push('(');

            } else if (bracket == ')') {
                stack.pop();
                if (line.charAt(i-1) == '(') {
                    //() laser -> 남은 애들 더함
                    sum += stack.size();
                } else {
                    // )) -> 닫는 것 -> +1
                    sum++;
                }

            }
        }

        System.out.println(sum);
    }

}
