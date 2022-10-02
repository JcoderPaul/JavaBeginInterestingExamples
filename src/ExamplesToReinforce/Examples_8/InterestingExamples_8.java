package ExamplesToReinforce.Examples_8;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/
public class InterestingExamples_8 {
    public static void main(String[] args) {
        // Переменной типа Readable присваиваем значение null
        Readable read = null;
        // Создаем объект класса ElectronicBook, которая не имплиментирует интерфейс Readable
        ElectronicBook eBook = new ElectronicBook();
        // Однако мы пытаемся присвоить переменной 'read' кастомизированную ссылку на объект ElectronicBook
        read = (Readable) eBook;
        /*
        Среда разработки пропускает такой код. Почему? Переменная eBook может ссылаться не только на
        объект ElectronicBook, но и на его наследников (потомков, extends), которые в свою очередь
        могут имплементировать интерфейс Readable и на этапе компиляции, среда разработки не находит
        ошибок. Однако! На этапе запуска, программа определит, что происходит и кто на что ссылается.
        Вылетит -> 'Exception in thread "main" java.lang.ClassCastException'
        */
    }
}

class Book{}
interface Readable{}
class PaperBook extends Book implements Readable{}
class ElectronicBook{}
