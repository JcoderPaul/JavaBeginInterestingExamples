package ExamplesToReinforce.Examples_20;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_20 {
    public static void main(String[] args) {
        int a = 5;
        /*
        Тернарный оператор -> (условие) ? (делай так, если ДА (true)) : (делай эдак, если НЕТ(false)/)
        В данном случае сразу 'true' поэтому '1', но это вложенный тернарный оператор и все могло пойти
        по-другому, в случае первого же 'false'.
        */
        String str = (a > 3)?"1":(a > 0)?"2":"3";
        System.out.println(str); // 1
    }
}
