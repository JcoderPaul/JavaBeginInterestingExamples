package ExamplesToReinforce.Examples_5;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InterestingExamples_5_Var_3 {
    public static void main(String[] args) {
        // Переменной присваивается значение возвращаемой данным статическим методом т.е. 10,
        // но перед этим на экран выйдут все сообщения сгенерированные самим методом (кроме последнего).
        int a = readTheFile();
        // Выводим на экран последние данные
        System.out.println(a); // №3
    }

    static int readTheFile(){
        try{
            // Поскольку файла действительно нет, будет выброшено исключение и значит ->
            FileInputStream fis = new FileInputStream("read_no_exist_file.txt");
        } catch (FileNotFoundException e){
            // -> первым будет выброшен данный текст.
            System.out.println("File not find!"); // №1
            return 15; // Значение уже ожидает своего возвращения
        } finally {
            // Далее закрывается финальный блок и его содержимое
            System.out.println("It is just the final block"); // №2
            // !!! Даже если в catch блоке мы уже задали return, то в finally блоке мы его перезададим
            return 10;
        }
        /*
        До сюда программа не доходит, данный метод завершился на блоке finally, но если в
        предыдущем примере у среды разработки не было вопросов, то теперь это явный
        'unreachable statement' т.е. выскочит ошибка на этапе компиляции.

        System.out.println("Program continues...");
        return 18;
        */
    }
}
