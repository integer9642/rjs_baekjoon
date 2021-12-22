import java.util.Scanner;
//for문
public class phase3 {
    public static void main (String[] args){

        /*
        //1번
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
         */

        /*
        //2번
         Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int i=1 ; i <= T ; i++){
            int A,B;
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
         */
        
        /*
        //3번
             Scanner sc = new Scanner(System.in);
        int n, i, sum;
        sum = 0;
        n = sc.nextInt();
        for (i=1 ; i <= n; i++){
            sum += i;

        }
        System.out.println(sum);
         */

        /*
        //4번 빠른 A+B
                import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;
        import java.util.StringTokenizer;

        public class Main {

            public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


                int N = Integer.parseInt(br.readLine());

                StringTokenizer st;

                for (int i = 0; i < N; i++) {
                    st = new StringTokenizer(br.readLine()," ");
                    bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
                }
                br.close();

                bw.flush();
                bw.close();

            }
        }
         */

        /*
        //5번
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        for (int i=1; i <= N; i++){
         System.out.println(i);
       }

         */
        
        /*
        //6번
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        for (int i=N; i >=1; i--){
            System.out.println(i);
         */

        /*
        //7번
         Scanner sc = new Scanner(System.in);
        int T, A, B, sum;
        sum = 0;
        T = sc.nextInt();
        for (int i=1; i <=T; i++){
           A = sc.nextInt();
           B = sc.nextInt();
           sum = A+B;
           System.out.println("Case #" + i + ": " + sum);
        }
         */

        /*
        //8번
        Scanner sc = new Scanner(System.in);
        int T, A, B, sum;
        sum = 0;
        T = sc.nextInt();
        for (int i=1; i <=T; i++){
           A = sc.nextInt();
           B = sc.nextInt();
           sum = A+B;
           System.out.println("Case #" + i + ": " + A + " + " + B + " = "+ sum);
        }
         */
        
        /*
        //9번
          Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */
        
        /*
        //10번
         Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for (int i = 1;  i<= N; i++) {

            for(int j = 1; j <= N-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */

        /*
        //11번
                Scanner sc = new Scanner(System.in);
        int N, X;
        N = sc.nextInt();
        X = sc.nextInt();
        int arr[] = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");

            }
        }

         */
    }
}
