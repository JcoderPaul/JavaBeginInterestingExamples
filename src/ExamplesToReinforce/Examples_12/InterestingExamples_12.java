package ExamplesToReinforce.Examples_12;
/*
Каков будет (результат компиляции) вывод на экран (сначала найти ответ устно,
и только за тем запустить код)?
*/
public class InterestingExamples_12 {
    public static void main(String[] args) {
        Car car_of_mine = new Car();
        car_of_mine.printCarInfo();
    }
}

class Car{
    String model_name = "HSV GTS Maloo";
    double speed_limit = 234.5;
    /* !!! Нестатические переменные нельзя вызывать в статическом методе !!!

    Поскольку статический метод может быть вызван из класса напрямую без создания объекта,
    то мы можем столкнуться с ситуацией когда нужные нам переменные просто не существуют.

    static void staticPrintCarInfo(){
        System.out.println("Model -> " + model_name + " critical speed limit ->" + speed_limit);
    }
    */

    /*
    Текущий метод можно применить только к существующему
    объекту, а значит все уже есть для его работы.
    */
    void printCarInfo(){
        System.out.println("Model -> " + model_name + " critical speed limit ->" + speed_limit);
    }
}