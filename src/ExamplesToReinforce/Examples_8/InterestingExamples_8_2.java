package ExamplesToReinforce.Examples_8;

public class InterestingExamples_8_2 {
    public static void main(String[] args) {
        /*
        Переменная класса CanJamp ссылается на объект Tiger, который наследует от класса Cats,
        все его повадки и в том числе имплементирует интерфейс CanJamp.
        */
        CanJump cj_1 = new Tiger();
        /*
        Тут все понятно, классический вариант создания объекта и ссылки
        на него, как и строка ниже, при создании объекта House
        */
        Tiger my_tiger = new Tiger();
        House my_house = new House();
        // Проверяем указывает ли ссылка на объект реализующий методы интерфейса CanJamp
        if (cj_1 instanceof CanJump) { // true
            System.out.println("cj_1 really can jump");
        }
        // Проверяем указывает ли ссылка на объект класса Cats или его наследников
        if (my_tiger instanceof Cats) { // false
            System.out.println("my_tiger really cat, big CAT");
        }
        /*
        Переменная my_house ссылается на объект House (может ссылаться на его наследника),
        но уже на этапе компиляции среда разработки выдает ошибку о несовместимости ссылки
        и объекта. Поскольку между классами House и Cats нет связи 'это есть'(т.е. мы не можем
        сказать, 'дома есть коты', в отличие от тигров с которыми это возможно)

        if (my_house instanceof Cats) {
            System.out.println("cj_1 really can jump");
        }
        */
    }
}

interface CanJump{}
class Cats implements CanJump{}
class Tiger extends Cats{}
class House{}
