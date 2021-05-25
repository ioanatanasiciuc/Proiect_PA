package com.example;

public class Form {

    private String firstGenre;
    private String secondGenre;
    private String thirdGenre;
    private String explicit;
    private String decade;

    public String getFirstGenre() {
        return firstGenre;
    }

    public void setFirstGenre(String genre) {
        this.firstGenre = genre;
    }

    public String getSecondGenre() {
        return secondGenre;
    }

    public void setSecondGenre(String genre) {
        this.secondGenre = genre;
    }

    public String getThirdGenre() {
        return thirdGenre;
    }

    public void setThirdGenre(String genre) {
        this.thirdGenre = genre;
    }

    public String getExplicit() {
        return this.explicit;
    }

    public void setExplicit(String explicit) {
        this.explicit = explicit;
    }



    public String getDecade() {
        return this.decade;
    }

    public void setDecade(String decade) {
        this.decade = decade;
    }

}
