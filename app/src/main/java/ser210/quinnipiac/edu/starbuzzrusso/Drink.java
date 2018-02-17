package ser210.quinnipiac.edu.starbuzzrusso;

/**
 * Created by markrusso on 2/17/18.
 * SER210
 * Assignment 6
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte ", "A couple of expresso shots with steamed milk", R.drawable.lattee),
            new Drink("Cappuccino ", "Expresso, hot milk and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter ", "Highest quality beans roasted and brewed fresh", R. drawable.filter)
    };

    //getters and setters to access information
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
