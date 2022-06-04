package pl.pjatk.rentalservice.movie.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalservice.movie.model.Movie;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Integer id) {
        String url = "http://localhost:8081/movieservice/movies/" + id;

        ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.GET, null, Movie.class);

        return response.getBody();
    }

    public Movie returnMovie(Integer id) {
        String url = "http://localhost:8081/movieservice/makeAvailable/" + id;

        ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.PUT, null, Movie.class);

        return response.getBody();
    }

    public Movie rentMovie(Integer id) {
        String url = "http://localhost:8081/movieservice/makeUnavailable/" + id;

        ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.PUT, null, Movie.class);

        return response.getBody();
    }
}
