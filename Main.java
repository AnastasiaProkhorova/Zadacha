import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //n1();
        //n2();
        //n3();
        //n4();
        n5();
    }


    public static void n1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        if (a == b | a == c | b == c) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }

    public static void n2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("такого чичла нет");
        } else if ((a > b && b >= c) || (c > b && b >= a)) {
            System.out.println(b);
        } else if ((b > a && a >= c) || (c > a && a >= b)) {
            System.out.println(a);
        } else if ((a > c && c >= b) || (b > c && c >= a)) {
            System.out.println(c);
        }
        ;
    }

    public static void n3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        int k;

        if (a==b && a==c) {
            k = 3;
        }
        else if ((a==b && a>c)||(a==c && a>b)||(c==b && c>a)){
           k = 2;
        }
        else{
            k=1;
        }
        System.out.println(k);
    }



    public static void n4() {
            int n=0;
            Scanner in = new
                    Scanner(System.in);
            System.out.println("Введите число:");
            int a = in.nextInt();
            if (a==1 || a==0) {
                n=0;}
            else {
                if (a>1) {
                    n=a-1;
                }
                if (a<0) {
                    n=-a;
                }
            } System.out.println(n);
    }

    public static void n5() {
        Scanner in = new Scanner(System.in);
        int x = 0; //Количество простых
        int y = 0;
        int d = 0;
        System.out.println("Введите n");
        int n = in.nextInt();
        if (n > 0) {
            for (int i = 1; x != n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        y++;
                    }
                }
                if (y == 2) {
                    x++;
                    d = i;
                }
                y = 0;
            }
            System.out.println("n-ое простое число");
            System.out.println(d);
        } else {
            System.out.println("Мне нужно положительное целое число...Поменяй");
        }
    }

}