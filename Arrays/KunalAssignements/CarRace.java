public class CarRace {
    public static void main(String[] args) {
        int N = 5;
        int k = 100;
        int[] A = {3,5,2,1,4};
        int[] B = {4,3,2,5,1};
        int answer = carRaceOverTake(N,k,A,B);
        System.out.println(answer);
    }
    static int carRaceOverTake(int N,int k, int[] A, int[] B) {
        int n = A.length;
        boolean[] overtook = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                if (A[i] > B[j] && B[i] < B[j]) {
                    overtook[i] = true;
                }
                else if (A[i] < A[j] && B[i] > B[j]) {
                    overtook[j] = true;
                }
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (overtook[i]) {
                total += i * k;
            }
        }

        return total;
    }
}
