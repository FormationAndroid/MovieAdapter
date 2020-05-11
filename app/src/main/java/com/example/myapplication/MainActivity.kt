package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = mutableListOf<Contact>()
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))
        contacts.add(Contact("john", 42, R.drawable.user, false))
        contacts.add(Contact("maria", 33, R.drawable.user, true))

        val adapter = ContactsRecyclerAdapter(contacts)
        recyclerView.adapter = adapter

    }
}
