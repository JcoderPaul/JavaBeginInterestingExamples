package ExamplesToReinforce.Examples_10;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_10_2 {
    public static void main(String[] args) {
        boolean flag = true;

        /*
        Такой код недопустим (compile time error), т.к. после 'do' должна следовать, либо
        единственная строка (тело цикла), которая будет совершать некие действия в цикле,
        а за ней оператор while(...), либо скобки { . . . } внутри которых следуют множественные
        строки кода и конечно while(...) после.
->
        do
            System.out.println("Вроде бы тоже бесконечный цикл");
            flag = false;
        while (!flag);
->
        правильный код ниже, и это уже бесконечный цикл.
        */
        do  {
            System.out.println("Живи и наслаждайся, если сможешь...");
            flag = false;
            }
        while (!flag);
    }
}