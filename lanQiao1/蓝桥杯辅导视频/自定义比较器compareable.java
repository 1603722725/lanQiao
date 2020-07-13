package 蓝桥杯辅导视频;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import jdk.nashorn.internal.scripts.JO;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-05-02 16:03
 */
public class 自定义比较器compareable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Job[] job = new Job[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            job[i] = new Job(a, b);
        }
        Arrays.sort(job);
        System.out.println(Arrays.toString(job));
    }

    public static class Job implements Comparable<Job> {
        int s;
        int t;

        public Job(int s, int t) {
            this.s = s;
            this.t = t;
        }

        @Override
        public int compareTo(Job o) {
            int x = this.t - o.t;
            if (x == 0)
                return this.s - o.s;
            return x;
        }
    }
}
