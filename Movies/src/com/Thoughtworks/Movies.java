package com.Thoughtworks;

import java.util.ArrayList;

public class Movies {
    private String studio;
    private String title;
    private String rating;
    Movies(String title,String studio,String rating)
    {
        this.studio=studio;
        this.title=title;
        this.rating=rating;
    }
    Movies(String studio,String title)
    {
        this.studio=studio;
        this.title=title;
        rating="PG";
    }
    public static Movies[] getPG(Movies[] movie)
    {
        //Movies PGMovies[] = new Movies[movie.length];
        ArrayList<Movies> PGmovies=new ArrayList<>();
        //int PGMoviesLength = 0;
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].rating.contains("PG")) {
                //PGMovies[PGMoviesLength++] = new Movies(movie[i].title, movie[i].studio, movie[i].rating);
                PGmovies.add(movie[i]);
            }
        }
        //return PGMovies;
        return PGmovies.toArray(new Movies[0]);
    }

    public static void main(String[] args) {
        Movies movies=new Movies("Casino Royale", "Eon Productions", "PG-13");
        Movies movieDetails[] ;

        Movies movieDetails1 = new Movies("Casino Royale", "Eon Productions", "PG-13");
        Movies movieDetails2 = new Movies("Avatar", "James Cameron", "PG-13");
        Movies movieDetails3 = new Movies("The girl on the train", "Reliance Entertainment", "PG-13");
        Movies movieDetails4 = new Movies("3 idiots", "Vidhu Vinod Chopra", "R");
        movieDetails=new Movies[]{movieDetails1,movieDetails2,movieDetails3,movieDetails4};
        Movies[] PGmovies=getPG(movieDetails);
        for(int i=0;i<PGmovies.length;i++) {
            System.out.println(PGmovies[i].title);
        }
    }
}
