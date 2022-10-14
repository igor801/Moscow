package ru.moscow.mt;

public class OneLesson {
    public static void main(String[] args) {
        printThereWord();
        checkSumSign();
        ptintColor();
    }

    public static void printThereWord() {
        System.out.println("Orange");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 12;
        if (a + b >= 0) {
            System.out.println("positiv");
        } else System.out.println("negative");
    }

    public static void ptintColor() {
        int value = 12;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value < 100) {
            System.out.println(" Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }
}
