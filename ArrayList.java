// Simple ArrayList
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

    }
}

//============================================================================================
// get element
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);
    }
}

//===============================================================================================
 // Add element between
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element between
        list.add(2,33);
        System.out.println(list);

    }
}

 //============================================================================================
 //set element
public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element between
        list.add(2,33);
        System.out.println(list);

        //set element
        list.set(0,99);
        System.out.println(list);
    }
}

//======================================================================================
//Delete/remove element
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element between
        list.add(2,33);
        System.out.println(list);

        //set element
        list.set(0,99);
        System.out.println(list);

        //Delete/remove element
        list.remove(2);
        System.out.println(list);
    }
}

//=========================================================================================
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element between
        list.add(2,33);
        System.out.println(list);

        //set element
        list.set(0,99);
        System.out.println(list);

        //Delete/remove element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);
    }
}

//======================================================================================
