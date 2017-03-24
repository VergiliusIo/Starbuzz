package com.hfad.starbuzz;

/**
 * Created by lophtpicker on 24.03.2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    Drink(String name, String description, int resourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = resourceId;
    }

    public static final Drink[] drinks = {
        new Drink("Latte", "A couple with espresso shots with steamed milk", R.drawable.latte),
        new Drink("Cappucino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappucino),
        new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescripion() {
        return description;
    }

    public int getIamgeResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return name + ":" + description + ":" + imageResourceId;
    }
}
