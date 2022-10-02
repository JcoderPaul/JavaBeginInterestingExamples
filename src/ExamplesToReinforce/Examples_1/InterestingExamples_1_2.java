package ExamplesToReinforce.Examples_1;

public class InterestingExamples_1_2 {
    public static void main(String[] args) {
        // Ссылка класса One указывает на объект, класса Two
        One make_one = new Two();
        /*
        Выводим на печать переменную 'а', которая в момент (compile time) компиляции определяется,
        как переменная класса One (т.е. а = 3). Далее запускается метод *.returnA(), который
        определяется на этапе выполнения кода (runtime) и тут прямые указания на объект класса Two.
        Значит теперь a = 5 и это же значение возвращается методом.

        !!! И последовательность вывода на экран будет такой:
        1. -> сначала срабатывает метод и возвращает свой текст: Klass TWO -> 5
        2. -> далее к записанной в память '3' прибавляется " " и затем возвращаемое значение метода '5'
        И вывод на экран:

        Klass TWO -> 5
        3 5
        */
        System.out.println(make_one.a + " " + make_one.returnA());
        /*
        Кастамизируем переменную класса One до уровня Two и повторяем вывод. Рассуждения те же, но
        теперь вся работа происходит с объектом класса Two и в момент компиляции и в момент работы
        программы.
        И вывод на экран:

        Klass TWO -> 5
        5 5
        */
        Two make_two = (Two) make_one;
        System.out.println(make_two.a + " " + make_two.returnA());
    }
}
class One{
    int a = 3;
    int returnA(){
        System.out.println("Klass ONE -> " + a);
        return a;
    }
}
class Two extends One{
    int a = 5;
    int returnA(){
        System.out.println("Klass TWO -> " + a);
        return a;
    }
}