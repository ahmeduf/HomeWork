package UseOfArray;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> score=new ArrayList<Integer>();
        score.add(2);
        score.add(4);
        score.add(2,6);
        score.add(8);
        score.add(8);
        for (int i : score)
        {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("size of arraylist of score :"+score.size());



    }
}
