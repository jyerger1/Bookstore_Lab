import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Bookstore {

    // VARIABLES

    private String storeName;
    private String storeAddress;
    private String storeOpen;
    private String closingTime;
    private String storeSize;
    private String newOrUsedBooks;

    private ArrayList<String> titles;

    // public Bookstore() {

    // setName("test");

    // }

    // CONSTRUCTOR
    public Bookstore(String name, String address, Boolean open, String closing, String size, String NOUB) {
        setName(name);
        setAddress(address);
        setOpen(open);
        setClosingTime(closing);
        setStoreSize(size);
        setNewOrUsedBooks(NOUB);

        titles = new ArrayList<String>();
        loadTitles();
        System.out.println(titles);

    }
    // CONSTRUCTOR

    // METHODS

    public String getName() {
        return storeName;
    }
    // getName method will be used in Main.java to call the name

    public void setName(String value) {
        this.storeName = value;
    }

    public String getAddress() {
        return storeAddress;
    }

    public void setAddress(String value) {
        this.storeAddress = value;
    }

    public String getOpen() {
        return storeOpen;
    }

    public void setOpen(boolean value) {
        if (value == true) {
            this.storeOpen = "The store is open";
        } else {
            this.storeOpen = "The store is closed";
        }
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String value) {
        this.closingTime = value;
    }

    public String getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(String value) {
        this.storeSize = value;
    }

    public String getNewOrUsedBooks() {
        return newOrUsedBooks;
    }

    public void setNewOrUsedBooks(String value) {
        this.newOrUsedBooks = value;
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    // METHODS

    // parameter will be stored into storeName variable

    // public String getAddress() {
    // return address;
    // }

    // public String getSquareFeet() {
    // return squareFeet;
    // }

    // // hasUsedBooks

    // public String getSquareFeet() {
    // return squareFeet;
    // }

}

// getters will return

// setters set the varibale inside object

// constructor for bookstore / pass in variables / run set methods inside
// constructor to set values to variables