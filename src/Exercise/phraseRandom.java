package Exercise;

public class phraseRandom {
        public static void main (String[] args) {


            String[] firstLine = {"test1", "test2", "test3", "test3", "test4"};
            String[] secondLine = {"@gmail.", "@wp.", "@onet.", "@o2.", "@yahoo.", "@mail.", "@hotmail."};
            String [] thirdLine = {"com", "pl", "at", "ua", "ru"};


            int ran1 = (int) (Math.random()* firstLine.length);
            int ran2 = (int) (Math.random()* secondLine.length);
            int ran3 = (int) (Math.random()*thirdLine.length);

            String phrase  = firstLine [ran1] + secondLine [ran2]+ thirdLine[ran3];
            System.out.println(phrase);




        }


}




