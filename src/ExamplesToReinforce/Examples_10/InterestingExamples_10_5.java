package ExamplesToReinforce.Examples_10;

public class InterestingExamples_10_5 {
    public static void main(String[] args) {
        /*
        При таком варианте кода будет ошибка компиляции, т.к. переменная counter была
        создана внутри тела цикла do-while. Для корректной работы кода необходимо
        объявлять и инициализировать данную переменную за пределами цикла. Однако...

        do{
           int counter = 1;
           System.out.println(counter++);
        } while (counter < 7);
        */

        /*
        ... если сделать так, то мы влетаем в бесконечный цикл. Т.е. ошибки на этапе
        компиляции не выявляется, ее и нет, может это наша цель - infinite loop (or endless loop).
        */
        int counter;
        do{
            counter = 1;
            System.out.println(counter++);
        } while (counter < 7);

    }
}
