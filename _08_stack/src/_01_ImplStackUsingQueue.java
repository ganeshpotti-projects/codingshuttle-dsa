import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _01_ImplStackUsingQueue {
    Queue<Integer> q;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4));
        _01_ImplStackUsingQueue obj = new _01_ImplStackUsingQueue(list);
        obj.push(5);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.top());
    }

    public _01_ImplStackUsingQueue(List<Integer> list){
        q =  new LinkedList<>(list);
    }

    public void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.poll());
        }
    }

    public int pop(){
        if(!q.isEmpty())
            return q.poll();
        return -1;
    }

    public int top(){
        if(!q.isEmpty())
            return q.peek();
        return -1;
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
}
