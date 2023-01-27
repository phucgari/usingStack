import java.util.Stack;

public class UsingStack {
    Stack<Character> stack;
    public UsingStack(){
        stack=new Stack<>();
    }
    public void pushWord(String word){
        for (Character letter:word.toCharArray()) {
            stack.push(letter);
        }
    }
    public Character takeLetter(){
        return stack.pop();
    }
    public int size(){
        return stack.size();
    }
}
