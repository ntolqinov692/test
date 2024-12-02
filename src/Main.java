import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(54);

        int index = integers.indexOf(54);
//        System.out.println(integers.toString());

        LinkedList<Integer> numberlist = new LinkedList<>();
        numberlist.addLast(10);
        numberlist.addLast(20);
        numberlist.addLast(30);
        numberlist.addLast(40);

        System.out.println(numberlist);

        numberlist.addFirst(5);
        System.out.println(numberlist);
        numberlist.removeLast();
        System.out.println(numberlist.contains(20));
        System.out.println("asd");



    }
}