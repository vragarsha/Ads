package com.annoyingads.oath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.annoyingads.R;

public class OathMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oath_main);
        ListView oathAdListView = findViewById(R.id.oathAdFormats);
        oathAdListView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.oathAdFormats)));
    }
}
