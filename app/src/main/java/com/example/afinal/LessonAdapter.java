package com.example.afinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class LessonAdapter extends ArrayAdapter<Lesson> {
    private int resourceId;


    public LessonAdapter(Context context, int resource, int textViewResourceId,  List <Lesson> objects) {
        super(context, resource, textViewResourceId, objects);
        resourceId =textViewResourceId;
    }
    public View gteView(int position, View convertView, ViewGroup parent){
        Lesson lesson =getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView lessonImage=(ImageView)view.findViewById(R.id.lesson_image);
        TextView lessonName=(TextView) view.findViewById(R.id.lesson_name);
        lessonImage.setImageResource(lesson.getImageId());
        lessonName.setText(lesson.getName());
        return view;
    }
}
