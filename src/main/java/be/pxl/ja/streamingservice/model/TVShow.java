package be.pxl.ja.streamingservice.model;

public class TVShow extends Movie {
    private int numberOfSeasons;

    public TVShow(String title, Rating maturityRating, int numberOfSeasons) {
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
