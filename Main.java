import javax.swing.plaf.multi.MultiViewportUI;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("==============BOOK==============");
        Book book = new Book("poor dad rich dad",39.0,"Robert T. Kiyosaki", 50.0);
        System.out.println("Book Name: "+book.getName());
        System.out.println("Book Price: "+book.getPrice());
        System.out.println("Book Author: "+book.getAuthor());
        System.out.println("Book Discount: "+book.getDiscount());

        System.out.println("==============MOVIE==============");
        Movie movie = new Movie("RIDE ON Trailer",80, "Larry Yang", 60.0);
//        movie.setName("John");
        System.out.println("Movie Name: "+movie.getName());
        System.out.println("Movie Price: "+movie.getPrice());
        System.out.println("Movie Director: "+movie.getDirector());
        System.out.println("Movie Discount: "+movie.getDiscount());

        System.out.println("==============MOVABLEPOINT==============");
        MovablePoint movablePoint = new MovablePoint(0,1,2,3);
        boolean exit = false;
        while (!exit) {
            System.out.println("Current Position: (" + movablePoint.getX() + ", " + movablePoint.getY() + ")");
            System.out.println("Choose a direction (up/down/left/right/exit): ");

            String direction = input.nextLine();

            switch (direction.toLowerCase()) {
                case "up":
                    movablePoint.moveUp();
                    break;
                case "down":
                    movablePoint.moveDown();
                    break;
                case "left":
                    movablePoint.moveLeft();
                    break;
                case "right":
                    movablePoint.moveRight();
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid direction entered. Please try again.");
            }
        }
    }

}
