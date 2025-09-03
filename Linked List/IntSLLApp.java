public class IntSLLApp {
    public static void main(String[] args) {
        IntSLList list = new IntSLList();

        for (int i = 0; i < 10; i++) {
            list.addTail(2 * i + 1);
        }

        System.out.println("List of odd numbers: ");
        list.printList();
    }
}
