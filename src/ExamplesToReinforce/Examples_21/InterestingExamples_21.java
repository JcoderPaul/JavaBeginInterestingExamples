package ExamplesToReinforce.Examples_21;
/*
Что будет результатом компиляции и запуска данного кода, если программу запустить с помощью
следующей строки: java InterestingExamples_21 ok privet poka
*/
public class InterestingExamples_21 {
    // Принимаем на вход массив из 3-х строковых элементов: "ok", "privet", "poka"
    public static void main(String[] args) {
        // Создали массив my_arr из семи строковых элементов, но содержащих null
        String[] my_arr = new String[7];
        // Запускаем цикл на длину нашего массива my_arr
        for (int i = 0; i < my_arr.length; i++){
            // Проверяем условие, меньше ли длинна нашего принятого массива args, чем i
            if(i < args.length)
                // До тех пор пока true, заполняем массив my_arr элементами из args
                my_arr[i] = args[i];
                /*
                А вот тут тонкий момент, к циклу относится только верхняя строка, а вывод
                на экран идет не зависимо от условия if, т.к. отсутствуют { более широкое
                тело цикла }. И так, когда значение i добралось до 3 условие if прекратило
                заполнять массив my_arr, однако цикл продолжил свою работу и на печать
                уходит попытка измерить длину пустоты, т.е. ошибка NullPointerException
                */
                System.out.println(my_arr[i].toUpperCase());
                /*
                На экран уйдет:

                ok
                privet
                poka
                Ошибка - NullPointerException
                */
        }
    }
}
