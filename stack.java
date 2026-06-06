import java.util.*;

class stack {
    public ArrayList<Integer> stackList = new ArrayList<>();
    void push(int val){
        stackList.add(val);
    }
    int peek(){
        return stackList.get(stackList.size()-1);
    }
    int pop(){
        return stackList.remove(stackList.size() - 1);
    }
    void display()
    {
        System.out.println(stackList.toString());
    }
    public static void main(String[] args) {
        stack stack1 = new stack();
        
        stack1.push(23);
        stack1.display();
        stack1.push(32);
        stack1.display();
        stack1.push(45);
        stack1.display();
        stack1.peek();
        stack1.display();
        stack1.pop();
        stack1.display();
        stack1.peek();
        stack1.display();
        
        
    }
    
}