package ExamplesToReinforce.Examples_3;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_3 {
    static int j = 5;
    static void printVar(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        printVar(j++); // Сначала срабатывает печать из метода => '5', затем идет '++'
        System.out.println(j); // и только теперь вывод на экран => 6
    }
}
