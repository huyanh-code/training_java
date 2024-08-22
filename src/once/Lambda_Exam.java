package once;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lambda_Exam {
    public static void main(String[] args) {
//        lambda1();
//        lambda2();
//        lambda3();
//        sorting_lambda();
//        treeSet_lambda();
          treeMap_lambda();
    }

    private static void treeMap_lambda() {
        TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1
                                                                  : (o1 < o2) ? 1 : 0 );
        m.put(1,"Apple");
        m.put(4, "Mango");
        m.put(5,"Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");

        System.out.println("Element of the TreeMap " + "after sorting are : " + m);
    }

    private static void treeSet_lambda() {
        TreeSet<Integer> h = new TreeSet<Integer>((o1,o2) -> (o1 > o2) ?
                                                    -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1090);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" + " sorting are : " + h);
    }

    private static void sorting_lambda() {
        ArrayList<Integer> arrL = new ArrayList<Integer>();

        arrL.add(100);
        arrL.add(45);
        arrL.add(600);
        arrL.add(205);
        arrL.add(80);
        arrL.add(725);

        System.out.println("Element of the ArrayList " + "before sorting : " + arrL);

        Collections.sort(arrL, ((o1, o2) -> (o1 < o2) ? -1 :
                (o1 > o2) ? 1 : 0));

        System.out.println("Elements of the ArrayList after" + " sorting : " + arrL);
    }

    private static void lambda3() {
        NumricTest2 isFactoc = (n,d) -> (n % d == 0);
        if(isFactoc.test(10,2)){
            System.out.println("2 is the factor of 10");
        }
        if(!isFactoc.test(10,3)){
            System.out.println("3 is not the factor if 10");
        }
    }

    private static void lambda2() {
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;

        Lambda_Exam tobj = new Lambda_Exam();

        System.out.println("Addition is " + tobj.operate(6,3,add));

        System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

        FuncInter2 fobj =  message
                -> System.out.println("Hello" + message);
        fobj.sayMessage("World");
    }

    private static void lambda1() {
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        arrNum.add(1);
        arrNum.add(2);
        arrNum.add(3);
        arrNum.add(4);

        arrNum.forEach(n -> System.out.println(n));

        arrNum.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }


    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }


    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    interface NumricTest2{
        boolean test(int n, int d);
    }
}
