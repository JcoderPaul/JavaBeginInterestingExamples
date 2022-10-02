package ExamplesToReinforce.Examples_9;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_9_2 {
    public static void main(String[] args) {
        /* Визуально сложная конструкция.
        Строковому одномерному массиву присваивают второй элемент строкового многомерного массива.
        Вполне рабочий синтаксис. В данном случае это {null}.
        */
        String str_arr_first [] = new String[][]
                {
                        new String[]{"Здраве буде","Хорошей дороги","Отдохни, выпей, закуси"}, // index 0
                        {new String()}, // index 1
                        {null} // index 2
                }[2];

        String str_arr_second [] = {null}; // Ссылка на массив содержащий null
        String str_arr_third [] = null; // А вот тут ссылка на ничто, а с ничем работать нельзя

        System.out.println(str_arr_first[0]); // null
        System.out.println(str_arr_second[0]); // null
        System.out.println(str_arr_third[0]); // Exception in thread "main" java.lang.NullPointerException
    }
}
