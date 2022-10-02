package ExamplesToReinforce.Examples_8;

public class InterestingExamples_8_3 {
    public static void main(String[] args) {
        CanJump cj_1 = new Tiger();
        Tiger my_tiger = new Tiger();
        House my_house = new House();
        Integer i = new Integer(5);
        Long l = new Long(10);
        Double d = new Double(4.6);



        System.out.println(cj_1 == my_tiger);
        System.out.println(cj_1.equals(my_tiger));

        // System.out.println(my_tiger == my_house); - Ссылки разных классов и они не совместимы, ошибка
        System.out.println(cj_1.equals(my_tiger));
        /*
        А вот такой код проходит на этапе компиляции без ошибок, поскольку среда разработки предполагает,
        что ссылка на дом, вполне может быть ссылкой на его прыгающего наследника, т.е. некий объект от
        класса наследника (JumpHouse extends House implements CanJump) имплементирующего возможность
        прыгать.
        */
        System.out.println(cj_1 == my_house);

        /*
        System.out.println(i == l);
        - ошибка на этапе компиляции, поскольку две ссылки разных
        классов не могут ссылаться на один и тот же объект, что и в первом варианте с
        домами и тиграми.
        */
        System.out.println(i.equals(l)); // А вот тут все нормально

        // System.out.println(d == i); - ошибка на этапе компиляции
        System.out.println(d.equals(i));
    }
}
