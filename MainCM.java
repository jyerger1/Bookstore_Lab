
public class MainCM {
    public static void main(String[] args) {

        Bookstore store = new Bookstore("Andrew", "108 Sutton Lane, Starkville NC, 28205", true, "8:00 pm",
                "180,000 square feet", "We only sell new books");

        System.out.println(store.getName());
        System.out.println(store.getAddress());
        System.out.println(store.getOpen());
        System.out.println(store.getClosingTime());
        System.out.println(store.getStoreSize());
        System.out.println(store.getNewOrUsedBooks());

    }
}