import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        Deque<String> queue = new LinkedList<>();

        StringTokenizer command;
        while(n--> 0){
            command = new StringTokenizer(bf.readLine()," ");
            switch (command.nextToken()){
                case "push":
                    queue.offer(command.nextToken());
                    break;
                case "pop":
                    if(queue.size()==0) sb.append("-1"+"\n");
                    else {sb.append(queue.peek()+"\n");
                        queue.pop();}
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.size()==0) sb.append("1"+"\n");
                    else sb.append("0"+"\n");
                    break;
                case "front":
                    if(queue.size()==0) sb.append("-1"+"\n");
                    else sb.append(queue.peek()+"\n");
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append("-1"+"\n");
                    else sb.append(queue.peekLast()+"\n");
            }
        }
        System.out.println(sb);
    }
}

