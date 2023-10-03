import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Deque<String> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();



        for(int i=0;i<n;i++){
            String[] line = bf.readLine().split(" ");

            if(line[0].equals("push_front")){
                q.offerFirst(line[1]);
            }
            else if(line[0].equals("push_back")){
                q.offerLast(line[1]);
            }
            else if(line[0].equals("pop_front")){
                if(q.isEmpty()) sb.append("-1"+"\n");
                else sb.append(q.pollFirst()+"\n");
            }
            else if(line[0].equals("pop_back")){
                if(q.isEmpty()) sb.append("-1"+"\n");
                else sb.append(q.pollLast()+"\n");
            }
            else if(line[0].equals("size")){
                sb.append(q.size()+"\n");
            }
            else if(line[0].equals("empty")){
                if(q.isEmpty())sb.append("1"+"\n");
                else sb.append("0"+"\n");}
            else if(line[0].equals("front")){
                if(q.isEmpty())sb.append("-1"+"\n");
                else sb.append(q.peek()+"\n");
                }
            else if(line[0].equals("back")){
                if(q.isEmpty())sb.append("-1"+"\n");
                else {
                    String last=q.pollLast();
                    sb.append(last+"\n");
                    q.offerLast(last);
                }
            }

            }
        System.out.println(sb);


    }
}
