class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        Triad[] arr = new Triad[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Triad(tasks[i][0], tasks[i][1], i);
        }
        Arrays.sort(arr, (a, b) -> {
            return a.enqueue_time - b.enqueue_time;
        });

        PriorityQueue<Triad> pq = new PriorityQueue<>(new Comparator<Triad>() {
            public int compare(Triad a, Triad b) {
                if (a.process_time == b.process_time)
                    return a.idx - b.idx;
                return a.process_time - b.process_time;
            }
        });

        int[] ans = new int[n];
        int ansIdx = 0;
        int taskIdx = 0;
        int curTime = 0;

        while (ansIdx < n) {
            while (taskIdx < n && arr[taskIdx].enqueue_time <= curTime) {
                pq.offer(arr[taskIdx++]);
            }
            if (pq.isEmpty()) {
                curTime = arr[taskIdx].enqueue_time;
            } else {
                curTime += pq.peek().process_time;
                ans[ansIdx++] = pq.poll().idx;
            }
        }
        return ans;

    }
}
class Triad {
    int enqueue_time;
    int process_time;
    int idx;
    Triad(int enqueue_time, int process_time, int idx) {
        this.enqueue_time = enqueue_time;
        this.process_time = process_time;
        this.idx = idx;
    }
}
