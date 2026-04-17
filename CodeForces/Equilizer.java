public class Equilizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] array = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                sum += array[i];
            }

            if (sum % 2 == 1) {
                System.out.println("YES");
            } 
            else if (n % 2 == 1 && k % 2 == 1) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
