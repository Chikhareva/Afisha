package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldOutput10LastAddMoviesFromAllList() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem("1", "https://1", "bladshot", "ActionMovie");
        MovieItem second = new MovieItem("2", "https://2", "vpered", "Cartoon");
        MovieItem third = new MovieItem("3", "https://3", "belgrad", "Comedy");
        MovieItem fourth = new MovieItem("4", "https://4", "dgentelmens", "ActionMovie");
        MovieItem fifth = new MovieItem("5", "https://5", "men-inbisible", "Horror");
        MovieItem sixth = new MovieItem("6", "https://6", "trolly", "Cartoon");
        MovieItem seventh = new MovieItem("7", "https://7", "numberOne", "Comedy");
        MovieItem eighth = new MovieItem("8", "https://8", "Strelcov", "ActionMovie");
        MovieItem ninth = new MovieItem("9", "https://9", "describle-me", "Cartoon");
        MovieItem tenth = new MovieItem("10", "https://10", "vampire", "Horror");
        MovieItem eleventh = new MovieItem("11", "https://11", "sharks", "Horror");
        MovieItem twelve = new MovieItem("12", "https://12", "Shadow", "Horror");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldOutputLastAddMoviesFromAllListIfTheirLess10() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem("1", "https://1", "bladshot", "ActionMovie");
        MovieItem second = new MovieItem("2", "https://2", "vpered", "Cartoon");
        MovieItem third = new MovieItem("3", "https://3", "belgrad", "Comedy");
        MovieItem fourth = new MovieItem("4", "https://4", "dgentelmens", "ActionMovie");
        MovieItem fifth = new MovieItem("5", "https://5", "men-inbisible", "Horror");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldOut5MoviesFromAllList() {
        MovieManager manager = new MovieManager(5);
        MovieItem first = new MovieItem("1", "https://1", "bladshot", "ActionMovie");
        MovieItem second = new MovieItem("2", "https://2", "vpered", "Cartoon");
        MovieItem third = new MovieItem("3", "https://3", "belgrad", "Comedy");
        MovieItem fourth = new MovieItem("4", "https://4", "dgentelmens", "ActionMovie");
        MovieItem fifth = new MovieItem("5", "https://5", "men-inbisible", "Horror");
        MovieItem sixth = new MovieItem("6", "https://6", "trolly", "Cartoon");
        MovieItem seventh = new MovieItem("7", "https://7", "numberOne", "Comedy");
        MovieItem eighth = new MovieItem("8", "https://8", "Strelcov", "ActionMovie");
        MovieItem ninth = new MovieItem("9", "https://9", "describle-me", "Cartoon");
        MovieItem tenth = new MovieItem("10", "https://10", "vampire", "Horror");
        MovieItem eleventh = new MovieItem("11", "https://11", "sharks", "Horror");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }
}