package ru.moscow.mt;

public class TwoLesson {
    public static void main(String[] args) {
        System.out.println(summ(12, 16));

        int e = diffSumm(12, 12);
        System.out.println(e);

        exe();
        System.out.println(" ");
        cicleF();

        System.out.println(ExSum(2, 6));
        PosOrNeg(12);
        System.out.println(GetPosOrNeg(-4));
        PrintText("hi", 6);
    }

    /**
     * если ставится тип возвращаемого значения то указать переменные обязательно
     */
    public static int summ(int a, int b) {
        return a + b;
    }

    public static int diffSumm(int c, int d) {
        return d + c;
    }

    /**
     * switch (переменная)
     * case 1
     * последовательность операторов
     * break
     * case 2
     * ...
     * default
     */
    public static void exe() {
        int f = 5;

        switch (f) {
            case 5:
                System.out.println("f =1");
                break;
            case 3:
                System.out.println("f =3");
                break;
            default:
                System.out.println("nothing");
        }
    }

    public static void cicleF() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /** бесконечный цикл
         * дальше цикл ограницен
         */
        int u = 0;
        for (; ; ) {
            System.out.println("hi");
            u++;
            if (u == 10) {
                break;
            }
        }
    }

    /**
     * Написать метод принимающий на вход 2 целых числа и проверящий,
     * что сумма лежит в пределе от 10 до 20 вкл, если да - тру, иначе - фолзе
     */
    public static boolean ExSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void PosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    /**
     * Написать метод которому передается целое число метод должен вернуть тру если положительное и фолз елси отрицательное
     */
    public static boolean GetPosOrNeg(int a) {
        return (a >= 0);
    }

    /**
     * Написать метод которому передается строка и число. Надо напечать строку указанное количество раз.
     */
    public static void PrintText(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
}
