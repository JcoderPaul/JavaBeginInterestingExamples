package ExamplesToReinforce.Examples_10;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_10_3 {
    public static void main(String[] args) {
        String str = "";

        /*
        Похожий пример был в другом задании ранее, в операторе цикла while() сразу стоит
        значение, которое не позволит провалиться в тело цикла и совершить хоть, что-либо
        разумное и доброе.

        while (false){
            srt += "Hello";
        }

        */

        /*
        А в случае с true, естественно всплывает вариант 'unreachable statement - недостижимый код'
        для строки 'System.out.println(str);', т.к. цикл уходит в бесконечность - 'infinite loop'.
        */
        while (true) {
            str += "Hello";
        }
        // Можно раскоментировать и убедится...
        // System.out.println(str);
    }
}
