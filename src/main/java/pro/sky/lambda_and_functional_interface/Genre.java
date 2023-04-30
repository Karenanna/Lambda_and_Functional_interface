package pro.sky.lambda_and_functional_interface;

import java.util.Objects;

public abstract class Genre {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected Genre(String title) {
        this.title = title;


    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return title.equals(genre.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
