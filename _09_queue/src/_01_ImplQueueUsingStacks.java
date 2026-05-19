import java.util.Stack;

public class _01_ImplQueueUsingStacks {
    Stack<Integer> st1;
    Stack<Integer> st2;

    _01_ImplQueueUsingStacks(){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    void push(int x){
        if(st1.isEmpty())
            st1.push(x);
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(x);
            while(!st2.isEmpty())
                st1.push(st2.pop());
        }
    }

    int pop(){
        return st1.pop();
    }

    int peek(){
        return st1.peek();
    }

    boolean isEmpty(){
        return st1.isEmpty();
    }

    public static void main(String[] args) {
        _01_ImplQueueUsingStacks obj = new _01_ImplQueueUsingStacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}
