
import java.util.ArrayList;

public class genric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);  
        String str1 = (String) list.get(1); # this line gives error because you extract object type and store in string while in java you cant cast interger to string 

        System.out.println(str);


    }
}
// comment this upper part of code and run the lower one

public class genric {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); # by mentioning the genric type it give you comiple time error if you add any data except string type 
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1); 

    }
}
