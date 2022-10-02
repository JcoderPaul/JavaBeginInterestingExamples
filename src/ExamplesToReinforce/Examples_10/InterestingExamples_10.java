package ExamplesToReinforce.Examples_10;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_10 {
    public static void main(String[] args) {
        boolean for_while_and_if = false;
        // Код внутри скобок {...} после условия выполнится только если условия true, у нас false
        if(for_while_and_if){
            System.out.println("First 'if' in program");
        }
        /*
        Содержимое внутри скобок {...} в цикле while выполняется до тех пор, пока условия true
        у нас сразу на входе false, т.е., как и в строках кода выше процесс выполнения программы
        проваливается ниже.
        */
        while (for_while_and_if){
            System.out.println("Second 'while' in program");
        }
        /*
        По идее условие '1 != 1' сразу ложно, но в операторе if среда разработки пропускает
        (это исключение из правил) подобное условие к выполнению (хотя код в скобках
        { ... заведомо не выполним ... }). И как в первых двух случаях мы не получим вывода на экран.
        */
        if(1 != 1){
            System.out.println("Second 'if' in program");
        }
        /*
        В отличии от оператора if, c оператором цикла while фокус с заведомо ложным условием, уже
        не прокатит будет предупреждение на этапе компиляции. (Если if это исключение из правил,
        то while нет)

        while (1 != 1) {
            System.out.println("Second 'while' in program");
        }
        */
    }
}
