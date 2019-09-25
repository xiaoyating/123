package com.example.afinal;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] data={"Android","Java","JavaWeb","JavaScript"};
    private List<Lesson> lessonList=new ArrayList <>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLesson();
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initLesson() {
        for (int i=0;i<2;i++){
            Lesson Android=new Lesson("Android",R.drawable.apple);
            lessonList.add(Android);
            Lesson Java=new Lesson("Java",R.drawable.lemon);
            lessonList.add(Java);
            Lesson JavaWeb=new Lesson("JavaWeb",R.drawable.orange);
            lessonList.add(JavaWeb);
            Lesson JavaScript=new Lesson("JavaScript",R.drawable.peach);
            lessonList.add(JavaScript);
        }
    }

}

