package ExamplesToReinforce.Examples_5;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InterestingExamples_5 {
    public static void main(String[] args) {
        // Переменной присваивается значение возвращаемой данным статическим методом т.е. 18,
        // но перед этим на экран выйдут все сообщения сгенерированные самим методом.
        int a = readTheFile();
        // Выводим на экран последние данные
        System.out.println(a); // №4
    }

    static int readTheFile(){
        try{
            // Поскольку файла действительно нет, будет выброшено исключение и значит ->
            FileInputStream fis = new FileInputStream("read_no_exist_file.txt");
        } catch (FileNotFoundException e){
            // -> первым будет выброшен данный текст.
            System.out.println("File not find!"); // №1
        } finally {
            // Далее закрывается финальный блок и его содержимое
            System.out.println("It is just the final block"); // №2
        }
            // Далее строки кода следующие по порядку
            System.out.println("Program continues..."); // №3
        return 18;
    }
}
