//1차원 배열
import java.util.Scanner;
import java.util.Arrays;
public class phase5 {
    public static void main(String[] args) {
        //1번
        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " +arr[N-1]);

         */

        //2번
        /*
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int max =0;
        int index = 0;

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j <9; j++){
            if(arr[j]>max){
                max = arr[j];
                index = j;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
         */

        //3번
        /*
         Scanner sc = new Scanner(System.in);
        int value;
        value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
       String str = Integer.toString(value);
       sc.close();

       for(int i = 0; i < 10 ; i++){
        int count = 0;
        for(int j =0; j< str.length(); j++){
            //그리고 반드시 charAt() 을 쓸 경우  - '0' 또는 -48 을 연산해야 한다.
            //(아니면 아스키코드에 대응하는 문자가 나온다.)
            if((str.charAt(j) - '0') == i){
                count++;
            }
        }
           System.out.println(count);
        }
         */


    }
}



