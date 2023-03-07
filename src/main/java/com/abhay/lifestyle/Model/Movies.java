package com.abhay.lifestyle.Model;

public class Movies {

    public int movieId;
    public String posterPicUrl;
    public String name;
    public String discription;

    public Movies(int movieId, String posterPicUrl, String name, String discription) {
        this.movieId = movieId;
        this.posterPicUrl = posterPicUrl;
        this.name = name;
        this.discription = discription;

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getPosterPicUrl() {
        return posterPicUrl;
    }

    public void setPosterPicUrl(String posterPicUrl) {
        this.posterPicUrl = posterPicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
