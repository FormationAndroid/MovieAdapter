package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = mutableListOf<Movie>()
        movies.add(Movie("Matrix", 1999))
        movies.add(Movie("Film B", 3434))
        movies.add(Movie("Film C", 1232))
        movies.add(Movie("Film D", 3493))
        movies.add(Movie("Film E", 5645))

        val adapter = MoviesRecyclerAdapter(movies)
        recyclerView.adapter = adapter

    }
}
