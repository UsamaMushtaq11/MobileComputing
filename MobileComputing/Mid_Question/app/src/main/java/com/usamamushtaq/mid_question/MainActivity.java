package com.usamamushtaq.mid_question;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class  MainActivity extends AppCompatActivity {

            Button add_value;
            EditText get_value;
            ListView list_names;

            List<String> names =  new ArrayList<String>();
            String [] nameList = {};

            ArrayAdapter my_adapter;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                add_value = findViewById(R.id.addBtnListView);
                get_value = findViewById(R.id.get_listName);
                list_names = findViewById(R.id.listNames);

                names =  new ArrayList<String>(Arrays.asList(nameList));
                my_adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names );
                list_names.setAdapter(my_adapter);

                add_value.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String newName =  get_value.getText().toString();
                        names.add(newName);
                        my_adapter.notifyDataSetChanged();
                    }
                });


            }

        }

