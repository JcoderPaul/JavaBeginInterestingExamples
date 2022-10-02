package ExamplesToReinforce.Examples_6;
/*
Каков будет вывод на экран (сначала найти ответ устно, и только за тем запустить код)?
*/

/*
В данном случае с точки зрения среды разработки ошибок нет, они всплывут при запуске кода,
поскольку при создании объекта запускается его конструктор. В нашем случае внутри конструктора
прописан код для создания объекта этого же класса, т.е. обращение к этому же конструктору уходит
в цикл и мы ловим -> 'Exception in thread "main" java.lang.StackOverflowError'.
*/
public class InterestingExamples_6 {
    public static void main(String[] args) {
        Book my_first_book = new Book();
        my_first_book.book_name = "To beer, or not to beer?";
        System.out.println(my_first_book.book_name);
    }
}

class Book{
    String book_name;
    public Book() {
        Book make_book = new Book();
        make_book.book_name = "How to do stackoverflow error!?";
    }
}