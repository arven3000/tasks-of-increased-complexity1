package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {

        /*Task 6*/
        System.out.println("Задача № 6");
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("result = " + result);
        result *= -1;
        System.out.println("invertible result = " + result + "\n");

        /*Task 7*/
        System.out.println("Задача № 7");
        a = 5;
        b = 7;
        System.out.println("Переменная до манипуляций a = " + a + "\n"
                + "Переменная до манипуляций b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Переменная после манипуляций a = " + a + "\n"
                + "Переменная после манипуляций b = " + b + "\n");

        /*Task 8*/
        System.out.println("Задача № 8");
        a = 785;
        b = a % 100 / 10;
        System.out.println("Если переменная a = " + a + ", то переменная b = " + b);

    }
}
