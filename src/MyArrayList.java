import java.util.*;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
    list.add("Nitesh");
    list.add("Bhawani");
    list.add("tulsi");
    list.add("zeenath");
    list.add("Shalu");
    System.out.println(list);
    Iterator <String>itr= list.iterator();
    while (itr.hasNext()){
    	System.out.println(itr.next());
    }
    
	}

}
