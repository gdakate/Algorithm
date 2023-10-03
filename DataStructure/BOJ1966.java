import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class BOJ1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Queue<Document> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int testcase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testcase; i++) {
            String[] split = reader.readLine().split(" ");
            int sampleCount = Integer.parseInt(split[0]);
            int findIndex = Integer.parseInt(split[1]);

            // 1. PriorityQueue, Queue 세팅
            String[] priorities = reader.readLine().split(" ");
            for (int j = 0; j < priorities.length; j++) {
                int priority = Integer.parseInt(priorities[j]);
                queue.add(new Document(priority, j));
                priorityQueue.add(priority);
            }


            int completionCount = 0;
            while (!queue.isEmpty()) {
                Document document = queue.poll();
                // 2. 작업 우선순위 확인하고
                if (document.priority == priorityQueue.peek()) {
                    priorityQueue.poll();
                    completionCount++;

                    // 3. 같은 작업 순위라면 찾고자 하는 인덱스인지 확인한다.
                    if (document.index == findIndex) {
                        break;
                    }

                    continue;
                }

                queue.add(document);
            }
            System.out.println(completionCount);

            // 다음 테스트케이스를 위한 queue, priority_queue 초기화
            priorityQueue.clear();
            queue.clear();
        }

        reader.close();
    }

    static class Document {
        private int priority;
        private int index;

        public Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

}