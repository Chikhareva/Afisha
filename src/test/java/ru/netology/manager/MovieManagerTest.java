package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    

    @Test
    void shouldOutput10LastAddMoviesFromAllList() {
        MovieManager manager= new MovieManager();
        MovieItem first = new MovieItem("1236547", "https://1236547", "Bladshot", "Action");
        MovieItem second = new MovieItem("2574987", "https://2574987", "Vpered", "Cartoon");
        MovieItem third = new MovieItem("12547895", "https://12547895", "Belgrad", "Comedy");
        MovieItem fourth = new MovieItem("2547952", "https://2547952", "Gentleman", "Action");
        MovieItem fifth = new MovieItem("3579845", "https://3579845", "men-inbisible", "Horror");
        MovieItem sixth = new MovieItem("9872547", "https://9872547", "Trolly", "Cartoon");
        MovieItem seventh = new MovieItem("6970235", "https://6970235", "Number One", "Comedy");
        MovieItem eighth = new MovieItem("5710025", "https://5710025", "Sex on the city", "Drama");
        MovieItem ninth = new MovieItem("9813574", "https://9813574", "Legend 17", "Drama");
        MovieItem tenth = new MovieItem("1012579", "https://1012579", "Speakerphone", "Comedy");
        MovieItem eleventh = new MovieItem("9870230", "https://9870230", "Soul", "Cartoon");
        MovieItem twelve = new MovieItem("4225478", "https://4225478", "Fire", "Drama");
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
        MovieItem first = new MovieItem("1236547", "https://1236547", "Bladshot", "Action");
        MovieItem second = new MovieItem("2574987", "https://2574987", "Vpered", "Cartoon");
        MovieItem third = new MovieItem("12547895", "https://12547895", "Belgrad", "Comedy");
        MovieItem fourth = new MovieItem("2547952", "https://2547952", "Gentleman", "Action");
        MovieItem fifth = new MovieItem("3579845", "https://3579845", "men-inbisible", "Horror");
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
        MovieItem first = new MovieItem("1236547", "https://1236547", "Bladshot", "Action");
        MovieItem second = new MovieItem("2574987", "https://2574987", "Vpered", "Cartoon");
        MovieItem third = new MovieItem("12547895", "https://12547895", "Belgrad", "Comedy");
        MovieItem fourth = new MovieItem("2547952", "https://2547952", "Gentleman", "Action");
        MovieItem fifth = new MovieItem("3579845", "https://3579845", "men-inbisible", "Horror");
        MovieItem sixth = new MovieItem("9872547", "https://9872547", "Trolly", "Cartoon");
        MovieItem seventh = new MovieItem("6970235", "https://6970235", "Number One", "Comedy");
        MovieItem eighth = new MovieItem("5710025", "https://5710025", "Sex on the city", "Drama");
        MovieItem ninth = new MovieItem("9813574", "https://9813574", "Legend 17", "Drama");
        MovieItem tenth = new MovieItem("1012579", "https://1012579", "Speakerphone", "Comedy");
        MovieItem eleventh = new MovieItem("9870230", "https://9870230", "Soul", "Cartoon");
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