package ExamplesToReinforce.Examples_15;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_15 {

    public static void first_stat_meth(){
        System.out.println("First_stat method output");
    }
    public void first_non_stat_meth(){
        System.out.println("First_non_stat_meth method output");
    }

    public static void second_stat_meth(){
        first_stat_meth();
        /*
        Если в текущем коде оставить данную строку ->
        -> first_non_stat_meth();
        ,то среда разработки ругнется на то, что нестатический метод (принадлежит объекту)
        применяется в статическом методе.

        Конечно, можно строку переписать, под создание объекта и вызов требуемого метода ->
        InterestingExamples_15 test = new InterestingExamples_15();
        test.first_non_stat_meth();

        !!! Но задача была про конкретный код и чем все закончится при нем,
        а ответ - Compile time error. !!!
        */
        System.out.println("Second_stat_meth method output");
    }


    public static void main(String[] args) {
        // Ссылку на объект создали и пока направили в пустоту.
        InterestingExamples_15 test_for_run = null;
        /*
        Если удалить из статического метода, строку запроса нестатического метода,
        то все будет работать. В данном случае, метод запустился бы, т.к. для работы
        статического метода не нужен объект требуемого класса, метод принадлежит
        самому классу.
        */
        test_for_run.second_stat_meth();
    }
}
