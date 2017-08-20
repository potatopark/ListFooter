package com.example.user.a5_listfooter.adapter;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.a5_listfooter.R;
import com.example.user.a5_listfooter.model.Job;

import java.util.List;

/**
 * Created by user on 2017-08-20.
 */

public class JobAdapter extends ArrayAdapter<Job>{

    Activity activity;
    int resource;

    public JobAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Job> objects) {
        super(context, resource, objects);

        activity = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null){
            itemView = this.activity.getLayoutInflater().inflate(this.resource,null);
        }
        Job item = getItem(position);

        if(item != null){
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
            TextView textView1 = (TextView) itemView.findViewById(R.id.textView1);
            TextView textView2 = (TextView) itemView.findViewById(R.id.textView2);

            imageView.setImageResource(item.getImage());
            textView1.setText(item.getTitle());
            textView2.setText(item.getDescription());
        }
        return itemView;
    }
}
