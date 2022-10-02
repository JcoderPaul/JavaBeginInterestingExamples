package ExamplesToReinforce.Examples_16.PackageTwo;

import ExamplesToReinforce.Examples_16.PackageOne.*;

public class B {
    // Создаем две статические переменные класса 'А', которые ссылаются на объекты этого же класса.
    // Т.е. через них мы можем обратиться к методам и переменным класса 'А'
    public static A a_test_1 = new A();
    public static A a_test_2 = new A();
    // Поскольку в основном коде (метод MAIN) не происходит создания объекта класса 'В',
    // то данный статический блок не сработает и текст на экран не уйдет.
    {
        System.out.println("Ну и что тут не так?");
    }

}
