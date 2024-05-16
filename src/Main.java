class HomeWork1 {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        posNegative();
        countDown();
         }
    //задача 1
    public static void printThreeWords()
    {
        System.out.println("3 слова в столбец метода printThreeWords(): ");
        System.out.println("""
    Orange
    Banana
    Apple\n""");
    }
    //задача 2
    public static void checkSumSign() {
        int a = 15;
        int b = 77;
        System.out.print("Значение метода checkSumSign(): ");
        if (a + b >= 0) System.out.println("Сумма положительная\n");
        else System.out.println("Сумма отрицательная\n");
    }
    //задача 3
    public static void printColor() {
        int a = 101;
        System.out.print("Значение метода printColor(): ");
        if (a<=0) System.out.println("Красный\n");
        else if (a>0 & a <=100) System.out.println("Желтый\n");
        else if (a>100) System.out.println("Зеленый\n");
    }
    //задача 4
    public static void compareNumbers() {
        int a=-4;
        int b=-5;
        System.out.print("Значение метода compareNumbers(): ");
        if (a>=b) System.out.println("a>=b\n");
        else System.out.println("a<b\n");
    }

    //задача 5
    static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    //задача 6
    public static void posNegative() {
        int a = 0;
        if (a >= 0) System.out.println ("Число положительное\n");
        else System.out.println("Число отрицательное\n");
    }
    //задача 7
    public static boolean trueNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;

    }
    //задача 8
    public static void countDown() {
        for (int x = 10; x > 0; x--)
            System.out.println("Обратный отсчет: " + x);
        }
    //задача 9


}