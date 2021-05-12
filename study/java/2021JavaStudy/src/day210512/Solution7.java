package day210512;

import java.io.FileInputStream;
import java.util.Scanner;

class Solution7 {
    private static char winner = '-';
    private static char[][] ttt = new char[4][4];

    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("res/210512_1input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int xPoint = 0;
            int oPoint = 0;

            winner = '-';
            sc.nextLine();
            for (int i = 0; i < 4; i++) {
                String st = sc.nextLine();
                ttt[i] = st.toCharArray();
            } // ttt 배열 초기화

            // 가로줄 검사
            for (int i = 0; i < 3; i++) {
                char point = ttt[i][0];
                if (point == '.') {
                    continue;
                }
                int checkNum = 1;
                for (int j = 0; j < 4; j++) {
                    if (!((ttt[i][j] == point) || (ttt[i][j] == 'T'))) {
                        checkNum--;
                        break;
                    }
                }
                if (checkNum == 1) {
                    if(point=='O') {
                        oPoint++;
                    }
                    else {
                        xPoint++;
                    }
                }
            }
            // 세로줄 검사
            for (int i = 0; i < 3; i++) {
                char point = ttt[0][i];
                if (point == '.') {
                    continue;
                }
                int checkNum = 1;
                for (int j = 0; j < 4; j++) {
                    if (!((ttt[j][i] == point) || (ttt[j][i] == 'T'))) {
                        checkNum--;
                        break;
                    }
                }
                if (checkNum == 1) {
                    if(point=='O') {
                        oPoint++;
                    }
                    else {
                        xPoint++;
                    }
                }
            }
            // 대각검사
            char point = ttt[0][0];
            int checkNum = 1;
            if (point != '.') {
                for (int i = 0; i < 4; i++) {
                    if (!((ttt[i][i] == point) || (ttt[i][i] == 'T'))) {
                        checkNum--;
                        break;
                    }
                }
                if (checkNum == 1) {
                    if(point=='O') {
                        oPoint++;
                    }
                    else {
                        xPoint++;
                    }
                }
            }

            point = ttt[0][3];
            checkNum = 1;
            if (point != '.') {
                for (int i = 0; i < 4; i++) {
                    if (!((ttt[i][3 - i] == point) || (ttt[i][3 - i] == 'T'))) {
                        checkNum--;
                        break;
                    }
                }
                if (checkNum == 1) {
                    if(point=='O') {
                        oPoint++;
                    }
                    else {
                        xPoint++;
                    }                }
            }

            if (isEnded(ttt)) {
                // 번복 가능성 없어
                if(xPoint>oPoint) {
                    System.out.println("#" + test_case + " X won");
                } else if (xPoint< oPoint) {
                    System.out.println("#" + test_case + " O won");
                } else {
                    System.out.println("#" + test_case + " Draw");
                }
            } else {
                // 아직 번복 가능성 있어
                if(xPoint>oPoint) {
                    System.out.println("#" + test_case + " X won");
                } else if (xPoint< oPoint) {
                    System.out.println("#" + test_case + " O won");
                } else {
                    System.out.println("#" + test_case + " Game has not completed");
                }
            }
        }
    }

    public static Boolean isEnded(char[][] ttt) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ttt[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}