package ExamplesToReinforce.Examples_2;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_2 {
    /*
    1. Сначала срабатывает вся статика, т.е. переменные и блоки, сработка идет по порядку следования.
    Затем в методе MAIN мы создаем объект.
    2. Перед тем как сработает его конструктор инициализируются все переменные и срабатывают не
    статичные блоки, тоже по порядку следования их в коде класса.
    3. Наконец срабатывает конструктор класса (о конструкторе супер-класса тут умалчивается)
    */
    // Конструктор класса
    public InterestingExamples_2() {
    // 7 - й вывод, не статическая переменная на последнем месте, срабатывает конструктор
    str_1 = printOnScreen("String_1"); // № 7
    }
    // 1 - ый вывод, статическая переменная на первом месте, запускает статический метод *.printOnScreen()
    static String str_1 = printOnScreen("String_2"); // № 1
    // 4 - й вывод, не статическая переменная на четвертом месте
    String str_3 = printOnScreen("String_3"); // № 4
    // 5 - й вывод, не статический блок на пятом месте
    { str_1 = printOnScreen("String_4");} // № 5
    // 2 - ой вывод, статический блок на втором месте
    static { str_1 = printOnScreen("String_5");} // № 2
    // 3 - й вывод, статическая переменная на третьем месте
    static String str_2 = printOnScreen("String_6"); // № 3
    // 6 - й вывод, не статическая переменная на шестом месте
    String str_4 = printOnScreen("String_7"); // № 6

    public static void main(String[] args) {
        InterestingExamples_2 ie_2 = new InterestingExamples_2();
        System.out.println("-------------------------------------------------");
        // Просто проверяем содержимое переменных, этого в задании не было
        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println(ie_2.str_3);
        System.out.println(ie_2.str_4);
    }
    static String printOnScreen(String str){
        System.out.println(str);
        return str;
    }
}
