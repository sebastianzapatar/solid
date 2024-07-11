import java.util.*;
public class FIFO implements Fila{
    Stack<Integer> stack = new Stack<>();
    @Override
    public void push(int a) {
        stack.push(a);
    }

    @Override
    public int pop() {
        if(stack.isEmpty())
            return -1;
        return stack.pop();
    }
}
