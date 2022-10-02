package ExamplesToReinforce.Examples_1;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_1_3 {
    public static void main(String[] args) {
        Cat cat_1 = new Cat();
        Cat cat_2 = new Tiger();
        /*
        Попытки вывести на экран private переменную average_weight, через ссылку на объект
        не сработают уже на этапе компиляции, т.к. переменная PRIVATE (через геттер - пожалуйста),
        напрямую, как к public переменной обратится не получится.

        И в первом, и во втором способе создания ссылок на объект в работе участвует класс Cat и
        значит на этапе компиляции обращение в обоих случаях будет к private переменой класса Cat,
        т.е. среда разработки предупредит о невозможности такого синтаксиса.

        System.out.println(cat_1.average_weight);
        System.out.println(cat_2.average_weight);

        */

        /*
        Пытаемся призвать на помощь кастомизацию и естественно она не поможет, т.к. родитель не обязан
        знать, какие методы и переменные есть у наследников, ну и естественно это не меняет private
        статус переменной average_weight.

        !!! Но естественно основная ошибка -> Exception in thread "main" java.lang.ClassCastException

        System.out.println(((Tiger)cat_1).average_weight);

        */

        System.out.println(((Tiger)cat_2).average_weight);
    }
}

class Cat{
    private int average_weight = 35;
    public void jump(){
        System.out.println("Cat run method");
    }
    public void run(){
        System.out.println("Cat run method");
    }
}

class Tiger extends Cat{
    public int average_weight = 135;
    public void run(){
        System.out.println("Tiger run method");
    }
}