package mcm.edu.ph.vargas_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);
        
        String firstName = "Takumi S.";
        char middleIninitial ='S';
        String lastname = "Vargas";
        int myAge = 18;
        float myDreamTVLGrade = 95.0f;
        double myMoney =99999.99;





        //String.valueOf(myMoney)
        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleIninitial)+ " "
                +lastname+ "\n and my age is "
                +myAge+ ".\n I want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;
    }
}