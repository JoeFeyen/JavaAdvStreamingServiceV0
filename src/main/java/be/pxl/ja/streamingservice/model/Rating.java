package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(0),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private int vanafLeeftijd;

    Rating(int vanafLeeftijd) { this.vanafLeeftijd = vanafLeeftijd; }

    public int getVanafLeeftijd() { return vanafLeeftijd; }

    public void setVanafLeeftijd(int vanafLeeftijd) { this.vanafLeeftijd = vanafLeeftijd; }
}
