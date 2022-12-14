package ExamplesToReinforce.Examples_5;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_5_4 {
    // Задаем статическую строковую переменную (ссылочную)
    static String str = "";
    public static void main(String[] args) {
        // ********* начат внешний блок try-catch-finally №1 *********
        try{ // Открывается 1 - й блок try
            throw new RuntimeException(); // Выкидываем исключение и ...
        } catch (Exception ex_1) { // Обрабатываем 1 -ый try или открываем первый блок catch ...
            // ********* начат вложенный блок try-catch-finally №2 *********
            try { // Открываем 2 - ой блок try или первый вложенный...
                // ********* начат вложенный блок try-catch №3 *********
                try { // Открываем 3- й блок try или первый вложенный во второй...
                    throw new Exception(); // Выкидываем исключение и ...
                    // Обрабатываем самое вложенное исключение, относящееся к 3 - му блоку try
                } catch (Exception ex_2) {
                    str += "1"; // Изменяем ссылку на объект str и получаем "1"
                }
                // ********* закончен вложенный блок try-catch №3 *********
                throw new Exception(); // Выкидываем исключение и ...
            } catch (Exception ex_3) { // Обрабатываем его и ...
                str += "2"; // Изменяем ссылку на объект str и получаем "12"
            } finally { // Срабатывает внутренний finally блок
                str += "3"; // Изменяем ссылку на объект str и получаем "123"
            }
            // ********* закончен вложенный блок try-catch-finally №2 *********
        } finally { // Срабатывает внешний finally блок
            str += "4"; // Изменяем ссылку на объект str и получаем "1234"
        }
        // ********* закончен внешний блок try-catch-finally №1 *********
        System.out.println(str); // 1234
    }
}
