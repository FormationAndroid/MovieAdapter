package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class ContactsRecyclerAdapter(private val contacts: MutableList<Contact>): RecyclerView.Adapter<ContactsRecyclerAdapter.MovieViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    inner class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_movie, parent, false)){

        fun bind(contact: Contact){
            itemView.apply {
                textName.text = contact.name
                textAge.text = contact.age.toString()
                imgContact.setImageDrawable(ContextCompat.getDrawable(context, contact.photo))
                layoutItem.alpha = if (contact.isValid) 1f else 0.5f

                setOnClickListener {
                    contacts.removeAt(adapterPosition)
                    notifyItemRemoved(adapterPosition)
                }

            }
        }
    }


    override fun getItemCount() = contacts.size

}