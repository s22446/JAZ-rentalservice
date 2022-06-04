package pl.pjatk.rentalservice.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.movie.model.Movie;
import pl.pjatk.rentalservice.movie.service.RentalService;

@RestController
@RequestMapping("/rentalservice")
public class RentalController {
    public final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/rental/{movieId}")
    public ResponseEntity<Movie> getMovie(@PathVariable("movieId") Integer movieId) {
        return ResponseEntity.ok(rentalService.getMovie(movieId));
    }

    @PutMapping("/returnMovie/{movieId}")
    public ResponseEntity<Movie> returnMovie(@PathVariable("movieId") Integer movieId) {
        return ResponseEntity.ok(rentalService.returnMovie(movieId));
    }

    @PutMapping("/rentMovie/{movieId}")
    public ResponseEntity<Movie> rentMovie(@PathVariable("movieId") Integer movieId) {
        return ResponseEntity.ok(rentalService.rentMovie(movieId));
    }
}
