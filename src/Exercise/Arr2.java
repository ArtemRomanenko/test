package Exercise;

public class Arr2 {

    public static void main(String[] args) {
        int[]myArr2 = {1,2,3,4,4,3,1,2};

        for (int i = 0; i <myArr2.length ; i++) {
            for (int j = i+1; j <myArr2.length ; j++) {

                if (myArr2[i]==myArr2[j]){
                    System.out.println(myArr2[i]+" "+ myArr2[j]);
                }

            }

        }


    }
}
