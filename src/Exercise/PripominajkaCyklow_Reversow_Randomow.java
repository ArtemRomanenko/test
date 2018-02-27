package Exercise;

public class PripominajkaCyklow_Reversow_Randomow {
    public static void main(String[] args) {
        String [] one = {"Test", "Tekst", "Maszyna"};
        String [] two = {"Dom", "Noga", "Ucho"};

        int first = (int)(Math.random()*one.length);
        int second = (int) (Math.random()*two.length);

        String rand = (one[first]+" "+two[second]);
        System.out.println(rand);
        summa();
        para();
        czislaKSumie();
        perewString();

    }

    public static void summa(){
        int[] pierw = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < pierw.length ; i++) {
            sum = sum+pierw[i];
        }
        System.out.println(sum);

    }

    public static void para(){
        int [] drugi = {1,2,3,4,4,6,6};
        for (int i = 0; i <drugi.length ; i++) {
            for (int j = i+1; j <drugi.length ; j++) {
                if(drugi[i]==drugi[j]){
                    System.out.println("para eto"+" "+drugi[i]+" "+drugi[j]);
                }

            }

        }
    }

    public static void czislaKSumie(){

        int [] tret = {2,3,4,5,6,7,8};
        int sum = 10;
        for (int i = 0; i <tret.length ; i++) {
            for (int j = i+1; j < tret.length; j++) {
                if(tret[i]+tret[j]==sum){
                    System.out.println("para dla 10 eto"+" "+tret[i]+" "+"i"+" "+tret[j]);
                }

            }

        }

    }

    public static void perewString(){
        String s = "Ono";

        String rev = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(rev)){
            System.out.println("Eti slowa odinakowy");
        }else{
            System.out.println("Ty loszara");
        }
    }
}
