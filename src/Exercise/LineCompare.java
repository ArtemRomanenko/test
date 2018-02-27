package Exercise;

import java.util.Arrays;

public class LineCompare {
    public static void main(String[] args) {
        String hi="ono";

        String rev = (new StringBuilder(hi).reverse().toString());
        if (hi.equalsIgnoreCase(rev)){
            System.out.println("слова равны");
        }


    }

//    public void blabla(){
//        String [] h1= {"home"};
//        String [] h2= {"mohe"};
//
//        Boolean result= new String(Arrays.sort(h1.toCharArray())).equals(new String(Arrays.sort(h2.toCharArray()));
//    }



}
