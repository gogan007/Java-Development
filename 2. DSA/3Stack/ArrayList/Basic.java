import java.util.ArrayList;

public class Basic {

    class Stack {

        ArrayList <Integer> list = new ArrayList<Integer>();

        // Check empty stack
        public boolean isEmpty() {
            return list.size() == 0;
        }

        //Push operation in stack
        public void push(int data) {
            list.add(data);
        }

        // Pop operation in stack
        public int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            // list.removeLast();
            return top;
        }

        // Peek operation in stack
        public int peek(){

            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
            // return list.getLast();
        }

    }
    public static void main(String[] args) {

        Basic obj = new Basic();
        Stack num = obj.new Stack();
        
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);

        while (!(num.isEmpty())) {
            System.out.print(num.peek() + " --> ");
            num.pop();
        }
        System.out.println("null");
    }
}
