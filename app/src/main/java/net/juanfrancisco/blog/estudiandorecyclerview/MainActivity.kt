package net.juanfrancisco.blog.estudiandorecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    private var persons: MutableList<Person>? = null

    private var rv: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv)

        val llm = LinearLayoutManager(this)
        rv!!.layoutManager = llm
        rv!!.setHasFixedSize(true)

        initializeData()
        initializeAdapter()
    }

    private fun initializeData() {
        persons = ArrayList()
        persons!!.add(Person("Emma Wilson", "23 years old", R.drawable.emma))
        persons!!.add(Person("Lavery Maiss", "25 years old", R.drawable.lavery))
        persons!!.add(Person("Lillie Watts", "35 years old", R.drawable.lillie))
    }

    private fun initializeAdapter()
    {
        val adapter = RVAdapter(persons!!)
        rv!!.adapter = adapter
    }
}
