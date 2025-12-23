public class CDOrganizer{
    private CDLink head;
    private CDLink tail;
    private CDLink first;
    private CDLink second;
    private CDLink third;
    private CDLink CD;
    private CDLink currView;

    String oldArtist = "hello";


    public CDOrganizer(){

        tail = new CDLink(null,null,0,0, null);
        head = new CDLink(null, null, 0, 0, tail);

    }


    public CDLink enterCD(String artist, String title, int genre, int year){
        // This little arrow just keeps track of where we are in the list. This curr is specific to this function - not to be confused with other "curr"s
        CDLink currE = head.getN();

        // If the new artist comes before the old artist alphabetically, then insert the new artist before the old one.
        while(!(currE.getN() == null || currE.getArtist().compareTo(artist) > 0 || currE.getArtist().equals(artist) && currE.getYear() < year)){
            System.out.println("We're getting artist: " + currE.getArtist());

            System.out.println("yay! We've entered the while loop!");

            // Now currE should point to the spot where we want to insert artist
            currE = currE.getN();

        }

        //Make copy of the node that currE is referring to (this will hold the old node's information)
        CDLink copy = new CDLink(currE.getArtist(), currE.getTitle(), currE.getGenre(), currE.getYear(), currE.getN());

        // Now override the contents of the original with the contents of the new node that you are inserting.
        // So now the original contains the new node, while the copy has the old information.
        currE.setArtist(artist);
        currE.setTitle(title);
        currE.setGenre(genre);
        currE.setYear(year);
        currE.setN(copy);




        return currE;
    }

    public void view(){
        // Keeps track of where the arrows are pointing. Starts at head
        currView = head;


        // Makes sure curr is not pointing to the tail
        while(currView.n != null){

            // Now it makes sure that curr is not pointing to the head
            if(currView != head){
                System.out.println(currView);
            }


            currView = currView.n;
        }
    }

    public void searchByArtist(String artist){
        CDLink currS = head.n;

        System.out.println("Artist, Title, Genre, Year");
        while(!(currS.getN() == null)){
            if(currS.getArtist().startsWith(artist)){
                System.out.println(currS);
            }
            currS = currS.getN();
        }

    }

    public void searchByGenre(int genre){
        CDLink currS = head.n;

        System.out.println("Artist, Title, Genre, Year");
        while(!(currS.getN() == null)){
            if(currS.getGenre() == genre){
                System.out.println(currS);
            }
            currS = currS.getN();
        }
    }


}

