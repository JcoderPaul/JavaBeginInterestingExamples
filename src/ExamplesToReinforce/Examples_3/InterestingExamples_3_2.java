package ExamplesToReinforce.Examples_3;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_3_2 {
    public static void main(String[] args) {
        int i = 5;
        if(i++ <= 5){ // Сначала сравнение и '5 == 5', затем инкремент i++, т.е. 5 -> 6 и
            System.out.println(i); // на экран уходит 6
        }
    }
}
