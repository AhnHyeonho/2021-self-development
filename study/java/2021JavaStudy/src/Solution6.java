import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution6 {
    static int T, N;
    static long M, max = 0;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("res/210510_6input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Long.parseLong(st.nextToken());
            arr = new long[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                max = Math.max(max, arr[i]);
            }
            sb.append("#").append(tc).append(" ").append(max < M ? 0 : bs(1, max)).append("\n");
        }
        System.out.println(sb);
    }

    static long bs(long start, long end) {
        long mid, sum;
        System.out.println("bs(" + start + ", " + end + ") called....");
        while (start <= end) {
            System.out.println("bs(" + start + ", " + end + ")");
            mid = (start + end) / 2;
            System.out.println("bs:: mid = " + mid);
            sum = 0;
            System.out.println("before bs::\t" + Arrays.toString(arr));
            for (int i = 0; i < N; i++) {
                sum += arr[i] / mid;
            }
            System.out.println("after bs::\t" + Arrays.toString(arr));
            System.out.println("bs:: sum = " + sum);
            if (sum < M) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start - 1;
    }
}