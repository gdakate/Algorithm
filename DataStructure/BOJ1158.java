import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bf.readLine().split(" ");
        LinkedList<Integer> circle = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int num1= Integer.parseInt(nums[0]);
        int num2= Integer.parseInt(nums[1]);
        for(int i=1;i<=num1;i++){
            circle.add(i);
        }
        int index=0;
        sb.append("<");
        while(circle.size()>1){
            int size = circle.size();
            index=(index+num2-1)%size;
            sb.append(circle.remove(index)+", ");
        }
        if(circle.size()==1){
            sb.append(circle.get(0)+">");
        }
        System.out.println(sb);

    }
}
