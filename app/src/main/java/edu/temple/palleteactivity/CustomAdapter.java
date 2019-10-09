package edu.temple.palleteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] colors;
    LayoutInflater linflater;

    public CustomAdapter(Context appcontext, String[] colors) {
        this.context = appcontext;
        this.colors = colors;
        linflater = (LayoutInflater.from(appcontext));
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = linflater.inflate(R.layout.adapter_custom, null);
        TextView colornames = (TextView) view.findViewById(R.id.textView);
        colornames.setText(colors[position]);
        return view;
    }
    public View getDropDownView(int position, View view, ViewGroup viewGroup) {
        view = linflater.inflate(R.layout.adapter_custom, null);
        TextView colornames = (TextView) view.findViewById(R.id.textView);
        colornames.setText(colors[position]);
        if(colors[position].equals("WHITE")){
            colornames.setBackgroundColor(Color.parseColor("WHITE"));
        }
        else if(colors[position].equals("RED")){
            colornames.setBackgroundColor(Color.parseColor("RED"));
        }
        else if(colors[position].equals("YELLOW")){
            colornames.setBackgroundColor(Color.parseColor("YELLOW"));
        }
        else if(colors[position].equals("GREEN")){
            colornames.setBackgroundColor(Color.parseColor("GREEN"));
        }
        else if(colors[position].equals("BLUE")){
            colornames.setBackgroundColor(Color.parseColor("BLUE"));
        }
        return view;
    }
}

