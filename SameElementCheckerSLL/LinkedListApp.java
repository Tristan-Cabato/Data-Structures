public class LinkedListApp {
    public static void main(String[] args) {
        // Test One:
        IntSLList SLL1 = new IntSLList();
            tailAdder(SLL1, 1, 2, 3, 4);
        IntSLList SLL2 = new IntSLList();
            tailAdder(SLL2, 1, 2, 3, 4);
        result(SLL1, SLL2, "Test One");
        
        // Test Two:
        SLL1 = new IntSLList();
            tailAdder(SLL1, 5, 8, 4, 5);
        SLL2 = new IntSLList();
            tailAdder(SLL2, 3, 2, 4, 3);
        result(SLL1, SLL2, "Test Two");
    }

    public static IntSLList tailAdder(IntSLList list, int num1, int num2, int num3, int num4) {
        list.addTail(num1);
        list.addTail(num2);
        list.addTail(num3);
        list.addTail(num4);
        return list;
    }
    
    public static void result(IntSLList list1, IntSLList list2, String testCase) {
        System.out.print("""
        %s
        %s:
        """.formatted("=".repeat(30), testCase));
        System.out.print("\tList One: ");
            list1.printList();
            System.out.println();
        System.out.print("\tList Two: ");
            list2.printList();
            System.out.println();
        System.out.println("\tEquality: " + list1.areEqual(list2));
    }
}
