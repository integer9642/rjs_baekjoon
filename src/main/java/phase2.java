import java.util.Scanner;
//if문
public class phase2 {
    public static void main(String[] args) {
        /*
        //1번
        Scanner sc = new Scanner(System.in);
        int A,B;
        A= sc.nextInt();
        B= sc.nextInt();

        if (A > B)
            System.out.println(">");
        else if (A < B)
            System.out.println("<");
        else
            System.out.println("==");
         */

        /*
        //2번
        Scanner sc = new Scanner(System.in);
        int A;
        A= sc.nextInt();

        if (A >= 90)
            System.out.println("A");
        else if (A >= 80)
            System.out.println("B");
        else if (A >= 70)
            System.out.println("C");
        else if (A >= 60)
            System.out.println("D");
        else
            System.out.println("F");
         */

               /*
        //3번
        Scanner sc = new Scanner(System.in);
        int A;
        A = sc.nextInt();
        if(A%4 == 0 && A%100 != 0 || A%400 == 0)
            A = 1;
        else
            A = 0;

        System.out.println(A);
         */

        /*
        //4번
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x>=0 && y>=0)
            System.out.println("1");
        else if(x<=0 && y>=0)
            System.out.println("2");
        else if(x<=0 && y<=0)
            System.out.println("3");
        else
            System.out.println("4");
         */
        
        /*
        //5번
          Scanner sc = new Scanner(System.in);
        int h,m;
        h = sc.nextInt();
        m = sc.nextInt();

        m = m-45;
        if(m<0) {
            h = h - 1;
            m = m + 60;
            if (h<0) h=23;

        }
        System.out.println(h + " " +m);
         */
    }
}
