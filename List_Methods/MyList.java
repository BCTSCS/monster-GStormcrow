import java.util.*;

public class MyList extends ArrayList{
    public MyList(){
        super();
    }
    public void printAll(){
        if (this.size()!=0){
        for (int i=0;i<this.size();i++){
            System.out.println(this.get(i));
            }
        }
    }
    public static void main(String[] args){
        MyList list = new MyList();
        list.add("Happy");
        list.add("Thanksgiving");
        list.add(2025);
        list.printAll();
    }
}