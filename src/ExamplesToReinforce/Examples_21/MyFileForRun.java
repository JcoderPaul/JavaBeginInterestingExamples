package ExamplesToReinforce.Examples_21;

public class MyFileForRun {

    public static void main(String[] args) {
        String[] my_array = new String[7];
            for (int i = 0; i < my_array.length; i++){
            if(i < args.length){
                my_array[i] = args[i];
                System.out.println(my_array[i].toUpperCase());
            }
        }
    }
}
