import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        Deque<Integer> q = new LinkedList<>();
        for(int i =1;i<=num;i++){
            q.push(i);
        }

        while(q.size()>1){
            q.pollLast();
            q.offerFirst(q.pollLast());
        }
        System.out.println(q.poll());


    }
}
