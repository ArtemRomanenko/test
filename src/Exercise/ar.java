package Exercise;

public class ar {
    public static void main(String[] args) {
        int[]myArr = {1,2,3,4,5,6,7};
        int sum = 10;

        for (int i = 0; i <myArr.length ; i++) {
            for (int j = i+1; j <myArr.length ; j++) {


                if (myArr[i]+myArr[j] == sum){
                    System.out.println(myArr[i]+" "+ myArr[j]);
                }

            }
        }
    }
}
