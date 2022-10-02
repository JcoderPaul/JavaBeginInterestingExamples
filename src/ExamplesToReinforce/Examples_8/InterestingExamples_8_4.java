package ExamplesToReinforce.Examples_8;

public class InterestingExamples_8_4 {
    public static void main(String[] args) {
        CanJump can_jump_1 = new Tiger();
        Tiger my_tiger = new Tiger();
        House my_house = new House();

        if (can_jump_1 instanceof Cats) { // true, прыгун может быть кошкой.
            System.out.println("If my jumper is a cat, then he may be a tiger -> " + (can_jump_1 instanceof Cats));
        }
        if (my_tiger instanceof CanJump) { // true, тигр наследует от кошки и значит может быть прыгуном
            System.out.println("My_tiger really can jump -> " + (my_tiger instanceof CanJump));
        }
        /*
        false, дом не прыгун, но возможно имеет прыгающих наследников, и на этапе
        исполнения кода все выяснится, а поскольку это false, то значит не будет
        печати сообщения.
        */
        if (my_house instanceof CanJump) {

            System.out.println("Can my house jump? -> " + (my_house instanceof CanJump));
        }
        // !false = true - ведь мой дом не прыгучий.
        if (!(my_house instanceof CanJump)) {
            System.out.println("Can my house jump? -> " + (my_house instanceof CanJump));
        }
    }
}
