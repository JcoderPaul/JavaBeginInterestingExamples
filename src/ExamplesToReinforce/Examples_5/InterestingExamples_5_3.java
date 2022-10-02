package ExamplesToReinforce.Examples_5;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_5_3 {
    public static void main(String[] args) {
        // Создаем объект текущего класса
        InterestingExamples_5_3 ie_7_test = new InterestingExamples_5_3();
        // Вызываем метод данного класса ->
        ie_7_test.prn_first();
        // (6) -> необработанная ошибка вылетает в MAIN метод и на экран:
        // 'Exception in thread "main" java.lang.StackOverflowError'
    }

    void prn_first(){
        try{
            // (1) -> вызываем метод prn_second() ->
            prn_second();
            // (4) -> далее происходит поиск catch блока для обработки ошибки, а его нет ->
            return;
        } finally {
            // (5) -> но есть finally блок, который выводит на печать текст и завершает текущий метод ->
            System.out.println("Вывод из finally блока prn_first()");
        }
    }
    void prn_second(){
        // (2) -> который выводит на печать текст и затем ->
        System.out.println("Вывод из prn_second()");
        // (3) -> выбрасывает ошибку, мы возвращаемся в метод, который вызвал эту цепочку ->
        throw new StackOverflowError();
    }
}
