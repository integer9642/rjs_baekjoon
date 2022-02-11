//while문
public class phase4 {
    public static void main (String[] args){
        //1번
        /*
      Scanner sc = new Scanner(System.in);
        int A, B;
       while(true){

           A = sc.nextInt();
           B = sc.nextInt();

           if(A==0 && B==0){
               sc.close();
               break;
           }
           System.out.println(A+B);
         */

        //2번
        /*
   Scanner sc = new Scanner(System.in);
        int A,B;
       while(sc.hasNextInt()) {
           A = sc.nextInt();
           B = sc.nextInt();
           System.out.println(A+B);
           }
       sc.close();
         */

        //3번
        /*

        Scanner sc = new Scanner(System.in);
        int A,B;
        int count;
        A = sc.nextInt();
        sc.close();
        B = A;
        count = 0;

        while(true) {
            A = (A%10)*10+(A/10 + A%10)%10;
            count++;

            if(B == A){
                break;
            }
           }
        System.out.println(count);

         */
    }
}
