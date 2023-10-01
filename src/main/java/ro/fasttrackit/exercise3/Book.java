package ro.fasttrackit.exercise3;

public class Book {
    private final Integer pageReached;
    private final Boolean likeIt;

    public Book(Integer pageReached, Boolean likeIt) {
        this.pageReached = pageReached;
        this.likeIt = likeIt;
    }

    public Integer getPageReached() {
        return pageReached;
    }

    public Boolean getLikeIt() {
        return likeIt;
    }
}
