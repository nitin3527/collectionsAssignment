import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Float> arrList = new ArrayList<Float>();
        arrList.add(35.5f);
        arrList.add(5.5f);
        arrList.add(3.5f);
        arrList.add(15.5f);
        arrList.add(24.5f);
        float sum = 0;
        Iterator<Float> i =arrList.iterator();
        while(i.hasNext()){
            sum += i.next();
        }
        System.out.print(sum);
    }
}
