package pl.pjatk.rentalservice.movie.model;

/**
 * Movie model
 *
 * @Integer id - Movie id
 * @String name - Movie name
 * @MovieGenre genre - Movie genre
 * @int productionYear - Movie production year
 * @boolean isAvailable - Determines whether movie is available
 */
public class Movie {
    private Integer id;
    private String name;
    private MovieGenre genre;
    private int productionYear;
    private boolean isAvailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
