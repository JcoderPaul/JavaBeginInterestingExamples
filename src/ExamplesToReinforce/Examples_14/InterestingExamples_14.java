package ExamplesToReinforce.Examples_14;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_14 {
    public static void main(String[] args) {
        // Создаем массив и заполняем его
        int [][] my_int_arr = {{1,2},{3,4}};
        // Задаем переменную
        int i = 5;
        try{
            /*
            Обращаемся к элементу массива который определяется:
            [результатом работы метода make_problem()],[переприсвоением переменной i] ++

            Однако метод сразу выкинет исключение, а значит и вся конструкция генерирует
            исключение и пробрасывает выполнение кода в блок catch. Переменная i не изменилась,
            а элемент массива с индексом [1][1] - это 4.
            */
            my_int_arr[make_problem()][i = 0]++;
        } catch (Exception exception){
            System.out.println(i + " " + my_int_arr[1][1]);// На печать уйдет вывод - '5 4'
        }
    }

    static int make_problem() throws Exception{
        throw new Exception();
    }
}
