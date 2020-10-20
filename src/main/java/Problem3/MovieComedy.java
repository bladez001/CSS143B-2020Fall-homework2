package Problem3;
//Timothy Muresan
public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super(rating, title);
        this.rating = rating;
        this.title = title;
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        int rate = getLateFeeInDollar();
        int fee = rate * numOfDaysPastDue;
        if (fee <= 0) {
            return 0;
        }
        return fee;
    }
}
