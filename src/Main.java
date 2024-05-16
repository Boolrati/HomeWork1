class HomeWork1 {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("3 слова в столбец метода printThreeWords(): ");
        System.out.println("Orange\n Banana\n Apple\n");
    }
    public static void checkSumSign() {
        int a = 15;
        int b = 77;
        System.out.print("Значение метода checkSumSign(): ");
        if (a + b >= 0) System.out.println("Сумма положительная\n");
        else System.out.println("Сумма отрицательная\n");
    }
    public static void printColor() {
        int value = 101;
        System.out.print("Значение метода printColor(): ");
        if (value<=0) System.out.println("Красный\n");
        else if (value>0 & value <=100) System.out.println("Желтый\n");
        else if (value>100) System.out.println("Зеленый\n");
    }
    public static void compareNumbers() {
        int a=-4;
        int b=-5;
        System.out.print("Значение метода compareNumbers(): ");
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}