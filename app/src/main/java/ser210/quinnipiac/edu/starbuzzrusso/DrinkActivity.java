package ser210.quinnipiac.edu.starbuzzrusso;

/**
 * Created by markrusso on 2/17/18.
 * SER210
 * Assignment 6
 * updated April 3, 2018
 * chapter 11
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //get drink from intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKO);
        Drink drink = Drink.drinks[drinkNo];

        //populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        //populate drink image
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //populate drink description
        TextView description = (TextView)findViewById(R.id.descirption);
        description.setText(drink.getDescription());

    }
}
