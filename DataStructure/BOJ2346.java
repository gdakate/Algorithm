import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Deque<int[]> q = new LinkedList<>();
        String[] line = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++){
            q.add(new int[]{i + 1, Integer.parseInt(line[i])});  // 풍선 번호와 종이에 적힌 수를 함께 저장
        }

        int[] curr = q.poll();
        sb.append(curr[0]).append(" ");  // 첫 번째 풍선 번호 추가

        while(!q.isEmpty()){
            int steps = curr[1];
            if (steps > 0) {
                steps--;  // 오른쪽으로 이동할 때 현재 위치는 무시(OMG)
                while(steps-- > 0) {
                    q.add(q.poll());
                }
            } else {
                while(steps++ < 0) {
                    q.addFirst(q.pollLast());
                }
            }
            curr = q.poll();
            sb.append(curr[0]).append(" ");  // 터진 풍선의 번호를 추가
        }
        System.out.println(sb);
    }
}
