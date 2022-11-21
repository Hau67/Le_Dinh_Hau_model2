package ss12.ThucHanh1;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println(stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    public static void main(String[] args) {
        System.out.println("11");
        stackOfIStrings();
        System.out.println("22");
        stackOfIntergers();
    }
}
