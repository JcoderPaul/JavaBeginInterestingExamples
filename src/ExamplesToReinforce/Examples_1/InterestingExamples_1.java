package ExamplesToReinforce.Examples_1;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_1 {
    public static void main(String[] args) {
        // Создаем переменную класса B_Test_1, которая ссылается на объект этого же класса
        B_Test_1 bts = new B_Test_1();
        /*
        Выводим на экран переменную 'а' объекта 'bts' это наследник A_Test_1 и в текущем варианте
        кода, переменная наследника сокрыла переменную родителя, она вызывается на этапе компиляции,
        т.е. в 'compile time' и по этому, на экран уйдет => '15'
        */
        System.out.println(bts.a);
        // Эту же переменную 'bts' мы кастомизировали до класса родителя и на экран пойдет => 5
        System.out.println(((A_Test_1)bts).a);
        // Запускаем не статический метод объекта класса 'B_Test_1', работа с методами идет в 'run time'
        bts.a_test_print(); // на экран уйдет => 'Non static method of B_Test_1'
        /*
        Снова пытаемся кастомизировать переменную 'bts' до родителя, что бы вывести на экран работу метода.
        Но как и в прошлый раз работа метода идет в 'run time' и поскольку 'bts' все же ссылается на 'B_Test_1()',
        то метод именно этого объекта будет запущен => 'Non static method of B_Test_1'
        */
        ((A_Test_1)bts).a_test_print();
        /*
        Запускаем статический метод дочернего класса, который скрывает точно такой же класс родителя. Но
        вызов статического метода происходит в 'compile time', а поскольку 'bts' ссылается на объект класса
        'B_Test_1()', то и на печать выйдет => 'Static method of B_Test_1'
        */
        bts.a_test_static_print();
        /*
        А вот тут кастомизация переменной до родительского класса даст результат, поскольку метод
        статический, то на этапе компиляции такой синтаксис позволит раскрыть и запустить статический
        метод родительского класса 'A_Test_1'. На экран уйдет => 'Static method of A_Test_1'
        */
        ((A_Test_1)bts).a_test_static_print();
    }
}

class A_Test_1{
    int a = 5;
    public void a_test_print(){
        System.out.println("(Parent) Non static method of A_Test_1");
    }
    public static void a_test_static_print(){
        System.out.println("(Parent) Static method of A_Test_1");
    }
}

class B_Test_1 extends A_Test_1{
    int a = 15; // Прячем родительскую переменную (hide)
    public void a_test_print(){ // Перезаписываем родительский метода
        System.out.println("(Child) Non static method of B_Test_1");
    }
    public static void a_test_static_print(){ // Прячем родительский static метод (hide)
        System.out.println("(Child) Static method of B_Test_1");
    }
}