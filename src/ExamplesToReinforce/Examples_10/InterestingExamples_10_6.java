package ExamplesToReinforce.Examples_10;

public class InterestingExamples_10_6 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Привет бесконечность!");
        }
        /*
        Среда разработки видит, что предыдущие строки, описывают цикл while и дают
        бесконечный цикл. Т.е. до выполнения любого кода после цикла дело не дойдет
        и мы получаем предупреждение - unreachable statement (недостижимый код)

        System.out.println("Лучше жуткий конец, чем бесконечная жуть!");

        */
    }
}
