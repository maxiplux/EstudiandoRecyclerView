package net.juanfrancisco.blog.estudiandorecyclerview

/**
 * Created by juan on 7/12/17.
 */

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RVAdapter internal constructor(internal var persons: List<Person>) : RecyclerView.Adapter<PersonViewHolder>() {

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView?) {
        super.onAttachedToRecyclerView(recyclerView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PersonViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return PersonViewHolder(v)
    }

    override fun onBindViewHolder(personViewHolder: PersonViewHolder, i: Int) {
        personViewHolder.personName.text = persons[i].name
        personViewHolder.personAge.text = persons[i].age
        personViewHolder.personPhoto.setImageResource(persons[i].photoId)
    }

    override fun getItemCount(): Int {
        return persons.size
    }
}