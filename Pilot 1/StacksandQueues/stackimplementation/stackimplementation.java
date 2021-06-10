public class stackimplementation {
    //declare stack, array and size
    static int stacksize = 5;
    //the stack accepts elements of integer data type
    static int[] stack = new int [stacksize];
    //keeping tabs of the first element in the stack 
    static int top = -1;

    //method to check if the stack is full
    static boolean stackIsFull() {
        if (top == stacksize - 1) {
            return true;
        } else {
            return false;
        }
    }

     //method to check if the stack is empty
    static boolean stackIsEmpty() {
        if (top == - 1) {
            return true;
        } else {
            return false;
        }
    }

    static void pop() {
        //check for underflow before poping
        if(stackIsEmpty()) {
            System.out.println("Stack underflow!");
        } else {
            //pop
        }
    }

    //check if the stack is full before pushing
    static void push(int val) {
        //overflow condition
        if(stackIsFull()) {
            System.out.println("Stack overflow!");
        } else {
            //push operation
            //top++
            //stack[top] - val
            stack [++top] = val;
        }
    }

    static void traverse() {
        for (int i = top; i < stacksize; i++){
            System.out.println(stack[i] + " ");
        }
    }
   
    //see the element at the top of the stack
    static void peek() {
        if(stackIsEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(stack[top]);
        }
    }

    //capacity is number of elements in the stack
    static int stackCapacity() {
        int capacity = top + 1;
        return capacity;
    }
    public static void main (String [] args) {
            push(5);
            push(2);
            push(1);

            traverse();
            System.out.println("/n");
            pop();
            System.out.println("/n");
            peek();
            System.out.println("/n");

            System.out.println(stackCapacity());
    }
}
