package net.juanfrancisco.blog.estudiandorecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by juan on 7/12/17.
 */

public  class PersonViewHolder extends RecyclerView.ViewHolder
{


    CardView cv;
    TextView personName;
    TextView personAge;
    ImageView personPhoto;

    PersonViewHolder(View itemView)
    {
        super(itemView);
        cv = (CardView)itemView.findViewById(R.id.cv);
        personName = (TextView)itemView.findViewById(R.id.person_name);
        personAge = (TextView)itemView.findViewById(R.id.person_age);
        personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
    }

}