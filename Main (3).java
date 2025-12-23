import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        boolean CDOrg = true;


//        while(s.hasNextLine()){
//            String s = inFile.nextLine();
//            System.out.println(s);
//        }
        //CDOrganizer myCDS =
        CDOrganizer myCDS = new CDOrganizer();
        //myCDS.view();
        //System.out.println(myCDS);
        //myCDS.head = new CDOrganizer("OneRepublic", "I Ain't Worried", 2002, 2);
        while(CDOrg){
            System.out.println("CD Organizer -- Enter your choice");
            System.out.println("1. Enter a New CD");
            System.out.println("2. View all CDs");
            System.out.println("3. Search for a CD");
            System.out.println("4. Exit the program ");

            String input = s.nextLine();
            int number = Integer.parseInt(input);
            int i = 0;

            // This is only Main's version of these elements. It's not to be confused with elements of these names in CDOrganizer.
            String artist;
            String title;
            int genre;
            int year;


            if(number == 1){
                //myCDS.enterCD();
                System.out.println("Enter the artist: ");
                artist = s.nextLine();

                System.out.println("Enter the CD title: ");
                title = s.nextLine();

                System.out.println("Enter the year of the CD:");
                year = Integer.parseInt(s.nextLine());

                printGenre();
                genre = Integer.parseInt(s.nextLine());


                myCDS.enterCD(artist, title, genre, year, 0);
            } else if(number == 2){
                myCDS.view();
            }


        }


    }

    // This is only so that the "if" statement doesn't quite as large.
    public static void printGenre(){
        System.out.println("1. Classical");
        System.out.println("2. Rock");
        System.out.println("3. Jazz");
        System.out.println("4. Country");
        System.out.println("5. Latin");
        System.out.println("6. Pop");
        System.out.println("7. Gospel");
        System.out.println("8. Contemporary");
    }


}