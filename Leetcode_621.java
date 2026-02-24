import java.util.*;

public class Leetcode_621 {

    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B','C','C'};
        int n = 2;

        Leetcode_621 obj = new Leetcode_621();
        int answer = obj.leastInterval(tasks, n);

        System.out.println(answer);
    }

    public int leastInterval(char[] tasks, int n) {

        int m = tasks.length;

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < m; i++) {
            frequency.put(tasks[i], frequency.getOrDefault(tasks[i], 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : frequency.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int maxCount = 0;
        for (int freq : frequency.values()) {
            if (freq == maxFreq) {
                maxCount++;
            }
        }

        int gaps = maxFreq - 1;
        int result = gaps * (n + 1) + maxCount;

        return Math.max(m, result);
    }
}