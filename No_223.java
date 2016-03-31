package LeetCode;

/**
 * Lancer on 2016/3/31.
 */
public class No_223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area_1 = (C - A) * (D - B);
        int area_2 = (G - E) * (H - F);
        int area_over = over(A, B, C, D, E, F, G, H);
        return area_1 + area_2 - area_over;
    }

    public int over(int A, int B, int C, int D, int E, int F, int G, int H){
        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);

        int y1 = Math.max(B, F);
        int y2 = Math.min(D, H);

        if (x1 >= x2 || y1 >= y2) {
            return 0;
        }
        else {
            return (x2 - x1) * (y2 - y1);
        }
    }

    public static void main(String[] args) {
        No_223 t = new No_223();

        // Test Case
//        int A = -3; int B = 0; int C = 3; int D = 4;
//        int E = 0; int F = -1; int G = 9; int H = 2;
        int A = -1500000001;
        int B = 0;
        int C = -1500000000;
        int D = 1;
        int E = 1500000000;
        int F = 0;
        int G = 1500000001;
        int H = 1;

        System.out.println(t.computeArea(A, B, C, D, E, F, G, H));
    }
}
