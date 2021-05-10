import java.io.FileInputStream;
import java.util.*;

class Solution3 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("res/210510_3input.txt"));

        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        List<Integer> ia = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ia.add(sc.nextInt());
        }
        Collections.sort(ia);
        System.out.println(ia.get(N / 2));
    }
}