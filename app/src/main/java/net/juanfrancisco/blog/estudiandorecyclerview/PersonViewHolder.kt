package net.juanfrancisco.blog.estudiandorecyclerview

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by juan on 7/12/17.
 */

class PersonViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {


    internal var cv: CardView
    internal var personName: TextView
    internal var personAge: TextView
    internal var personPhoto: ImageView

    init {
        cv = itemView.findViewById<View>(R.id.cv) as CardView
        personName = itemView.findViewById<View>(R.id.person_name) as TextView
        personAge = itemView.findViewById<View>(R.id.person_age) as TextView
        personPhoto = itemView.findViewById<View>(R.id.person_photo) as ImageView
    }

}