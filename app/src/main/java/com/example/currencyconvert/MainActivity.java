package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);

        String[] from = {"Dollar", "Euro", "Mad"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"Euro", "Mad","Dollar"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double tot;

                Double amount = Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Euro"){

                    tot = amount * 0.94;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Mad"){

                    tot = amount * 10.34;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dollar"){

                    tot = amount * 1.06;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Mad"){

                    tot = amount * 11.01;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Mad" && sp2.getSelectedItem().toString() == "Dollar"){

                    tot = amount * 0.097;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }


                else if(sp1.getSelectedItem().toString() == "Mad" && sp2.getSelectedItem().toString() == "Euro"){

                    tot = amount * 0.091;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Dollar"){

                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Euro"){

                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Mad" && sp2.getSelectedItem().toString() == "Mad"){

                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                }

        });

    }
}