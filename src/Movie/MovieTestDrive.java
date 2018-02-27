package Movie;

public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "gone with the Stock";
        one.genre = "Tragic";
        one.rating = -1;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Cpmedy";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
