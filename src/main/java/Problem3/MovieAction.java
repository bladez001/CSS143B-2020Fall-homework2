package Problem3;
//Timothy Muresan
public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
        this.rating = rating;
        this.title = title;
    }

    public MovieAction(MovieAction anotherMovie) {
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
        if (fee >= 25) {
            return fee *2;
        }
        return fee;
    }
}
