import java.util.Stack;

class SpecialStack {
    Stack<Integer> min;
    Stack<Integer> s;
    Integer minEl;
    int currSize = -1;

    SpecialStack(int size){
        s = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    void getMin(){
        minEl = min.pop();
        min.push(minEl);
        if(s.isEmpty()){
            System.out.println("stack is empty");
        }else {
            System.out.println("Minimum element is" + minEl);
        }
    }
    void pop(){
        if(s.isEmpty()){
            System.out.println("stack is empty cannot remove element");
        }else {
            Integer t = s.pop();
            min.pop();
            currSize--;
            System.out.println("Removed element" + t);
        }
    }
    public void push(Integer x){
        if(currSize<s.size()){
            if(!s.isEmpty()){
                Integer y = s.pop();
                s.push(y);
                if(y > x) min.push(x);
            }else {
                min.push(x);
            }
            s.push(x);

            currSize++;
            System.out.println("element pushed" + x);
        }
    }
    void isEmpty(){
        if(s.size() == 0) System.out.println("stack is empty");
        else  System.out.println("stack is not empty");
    }
    void isFull(){
        if(s.size() == currSize){
            System.out.println("Stack is full");
        }else {
            System.out.println("Stack is not full");
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        SpecialStack st = new SpecialStack(5);
        st.push(5);
        st.push(3);
        st.isFull();
        st.getMin();
        st.pop();
        st.getMin();
    }
}
