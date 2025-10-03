import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<String> arraylist =new ArrayList<>();
        arraylist.add("Mahesh");
        arraylist.add("atul");
        arraylist.add("Rohan");
        arraylist.add("harsh");
        System.out.println(arraylist);
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.size());
        System.out.println(arraylist.contains("Mahesh"));
        System.out.println(arraylist.removeAll(arraylist));
        System.out.println(arraylist.size());

    }
}