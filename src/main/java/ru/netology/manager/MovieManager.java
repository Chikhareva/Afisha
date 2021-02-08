package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] movies = new MovieItem[0];
    private int countOutMovies = 10;

    public MovieManager() {
    }


    public MovieManager(int countOutMovies) {
        this.countOutMovies = countOutMovies;
    }

    public MovieItem[] getMoviesForFeed() {
        return null;
    }

    public void add(MovieItem movie) {
        // создаём новый массив размером на единицу больше, чем Movie[]
        int length = movies.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        // копируем поэлементно все элементы из Movie[]
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        //добавляем последний элемент в Movie[]
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieItem[] getAll() {
        MovieItem[] result;
        if (movies.length>countOutMovies) {
            result = new MovieItem[countOutMovies];
        }
        else {
            result = new MovieItem[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
