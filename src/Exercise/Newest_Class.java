package Exercise;

public class Newest_Class {
    public static void main(String[] args) {
        String s = "hello world!";
        char [] myArr = s.toCharArray();

        for (int i = 0, j=myArr.length-1; i < j; i++, j--) {
            char temp = myArr[i];
            myArr[i]=myArr[j];
            myArr[j] = temp;
        }
        System.out.println(myArr);
    }

}

