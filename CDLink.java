public class CDLink {
    // members
    private String artist;
    private String title;
    private int genre;
    private int year;
    public CDLink n;

    // Constructors
    CDLink(String artist, String title, int genre, int year, CDLink n){

        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.n = n;
    }

    public String toString(){
        return artist + ", " + title + ", " + genre + ", " + year;
    }

    public String getArtist(){
        //this.artist;
        return this.artist;
    }

    public String getTitle(){
        return this.title;
    }

    public Integer getGenre(){
        return this.genre;
    }

    public Integer getYear(){
        return this.year;
    }

    public CDLink getN(){
        return this.n;
    }



    public String setArtist(String artist){
        this.artist = artist;
        return this.artist;
    }

    public String setTitle(String title){
        this.title = title;
        return this.title;
    }

    public Integer setGenre(int genre){
        this.genre = genre;
        return this.genre;
    }

    public Integer setYear(int year){
        this.year = year;
        return this.year;
    }

    public CDLink setN(CDLink n){
        this.n = n;
        return this.n;
    }

}
