import java.nio.file.Watchable;

public class basicStack<X> {
    private X []data;
    private int stackPointer;
    public basicStack(){
        data=(X[]) new Object[1000];
        stackPointer=0;
    }
    public void push(X newItem){
        data[stackPointer++]=newItem;
    }
    public X pop(){
        if(stackPointer==0){
            throw new IllegalStateException("No more items in the stack");
        }
        return data[--stackPointer];

    }
    public Boolean contains(X item){
        Boolean found =false;
        for(int i=0;i<=stackPointer;i++){
            if(data[i]==item){
                found=true;
            }
        }
        return found;
    }
    public X access(X item){
        while (stackPointer>0){
            X tempItem=pop();
            if(item.equals(tempItem)){
                return tempItem;
            }
        }
        throw new IllegalStateException("we don't found your item "+item);

    }
    public int size(){
        return stackPointer;
    }
}
