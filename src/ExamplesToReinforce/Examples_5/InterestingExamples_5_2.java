package ExamplesToReinforce.Examples_5;
/*
Какой из приведенных ниже фрагментов кода позволит без проблем вызвать метод
'first_run_method' внутри метода 'second_run_method'?
Помним, что проверяемые на этапе компиляции исключения (check exception), либо
обрабатываются в блоке try-catch, либо прописываются в сигнатуре метода.

A- try { first_run_method(3.14);}
   catch(Exception e){}

B- try { InterestingExamples_15 my_ie_test = new InterestingExamples_15();
         my_ie_test.first_run_method(3.14);}
   catch(RuntimeException e){}

С- try { InterestingExamples_15 my_ie_test = new InterestingExamples_15();
         my_ie_test.first_run_method(3.14);}
   catch(MyException e){}

D- try { new InterestingExamples_15.first_run_method(3.14);}
   finally {}

*/
public class InterestingExamples_5_2 {
    public static void main(String[] args) {
        InterestingExamples_5_2 begin = new InterestingExamples_5_2();
        begin.second_run_method();
    }

    public void first_run_method(double accept) throws MyException{
        System.out.println(accept);
    }

    public void second_run_method() {
        // Вариант 'А' проходит нормально, т.к. MyException наследник Exception
        try { first_run_method(3.14); }
        catch(Exception e){}

        /*
        Вариант 'B' не пройдет, RuntimeException недостаточно, для того чтобы компилятор
        пропустил этот код, либо мы добавляем (RuntimeException | MyException e), либо корректируем
        сигнатуру текущего метода.

        try { InterestingExamples_15 my_ie_test = new InterestingExamples_15();
              my_ie_test.first_run_method(3.14);}
        catch(RuntimeException e){}
        */

        /*
        Вариант 'C' пройдет.
        */
        try { InterestingExamples_5_2 my_ie_test = new InterestingExamples_5_2();
              my_ie_test.first_run_method(3.14);}
        catch(MyException e){}

        /*
        Вариант 'D' не пройдет, т.к. отсутствует блок catch, а такой синтаксис не проходит
        для check exception и в сигнатуре текущего метода second_run_method() нет
        throws MyException, либо его родителя.

        try { InterestingExamples_15 my_ie_test = new InterestingExamples_15();
              my_ie_test.first_run_method(3.14);}
        finally {}
        */
    }
}

class MyException extends Exception{}