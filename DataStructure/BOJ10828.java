import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    static FastReader fr = new FastReader();

    static StringBuilder sb = new StringBuilder();//정답 sb에 append
    public static void main(String[] args) {
        int N = fr.nextInt();

        Stack <String> stack = new Stack<>();

        for(int i =0;i<N;i++){
            String[] line = fr.nextLine().split(" ");
            String cmd = line[0];

            if(cmd.equals("push")){
                stack.push(line[1]);
            }
            else if(cmd.equals("pop")){
                if(stack.empty()){
                    sb.append("-1");
                }
                else{
                    sb.append(stack.peek());
                    stack.pop();
                }
                sb.append("\n");
            }
            else if(cmd.equals("size")){
                sb.append(stack.size()+"\n");
            }
            else if(cmd.equals("empty")){
                if(stack.empty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            else if(cmd.equals("top")){
                if(stack.empty())
                    sb.append("-1\n");
                else
                    sb.append(stack.peek()+"\n");
            }
        }
        System.out.println(sb);

    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //        public FastReader(String s) throws FileNotFoundException{
//            br = new BufferedReader(new FileReader(new File(s)));
//        }
        String next()
        {
            while(st == null || !st.hasMoreElements()){
                try{st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str ="";
            try{
                str = br.readLine();}
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}
