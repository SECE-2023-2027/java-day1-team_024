import java.util.ArrayList;
public class FourteenthProgram {
    public static void main(String[] args) {
        ArrayList<Integer> by3 = new ArrayList<>();
        ArrayList<Integer> by5 = new ArrayList<>();
        ArrayList<Integer> byBoth = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) by3.add(i);
            if (i % 5 == 0) by5.add(i);
            if (i % 3 == 0 && i % 5 == 0) byBoth.add(i);
        }
        System.out.println("Divided by 3: ");
        printList(by3);
        System.out.println("Divided by 5: ");
        printList(by5);
        System.out.println("Divided by 3 & 5: ");
        printList(byBoth);
    }
    private static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
