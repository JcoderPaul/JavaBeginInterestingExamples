package ExamplesToReinforce.Examples_18;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_18 {
    public static void main(String[] args) {
        /* Переменная playGame_1 указывает на объект класса PlayGame, в котором переменная 'a' = 3 */
        final PlayGame playGame_1 = new PlayGame();
        /* Переменная playGame_2 указывает на объект класса PlayGame, в котором переменная 'a' = 3 */
        PlayGame playGame_2 = new PlayGame();
        /* Переменная playGame_3 ссылается на результат работы метода объекта класса PlayGame,
        в который передаются копии ссылок на объекты (playGame_1' и playGame_2'). В нем
        происходит некая возня ->
        */
        PlayGame playGame_3 = PlayGame.start_game(playGame_1, playGame_2);
        /* Если грубо, то после работы метода *.start_game(), имеем две ссылки указывающие
        на один объект, а значит все его содержимое эквивалентно само себе же.
        На экран выходит тройное true */
        System.out.println(playGame_1 == playGame_3); // True
        System.out.println(playGame_1.equals(playGame_3)); // True
        System.out.println(playGame_1.a == playGame_3.a); // True
        // Ну, а переменная playGame_2, нужна чтобы заморочить (вот такая черная магия). */
    }
}

class PlayGame{
    int a = 3;

    public static PlayGame start_game(PlayGame playGame_1, PlayGame playGame_2){
        /* -> переменной rpg класса PlayGame присваивается значение playGame_1, т.е. теперь на объект
        из метода MAIN ссылаются две переменные (rpg и playGame_1). */
        final PlayGame rpg = playGame_1;
        /* Далее переменной 'а' этого объекта присваивается значение 5 */
        playGame_1.a = 5;
        /* И метод возвращает ссылку на тот же объект, что и playGame_1
        (ох, уж эти ссылочные переменные). В результат в методе MAIN переменная
        playGame_3 получает ссылку на тот же объект, что и playGame_1 */
        return rpg;
    }
}