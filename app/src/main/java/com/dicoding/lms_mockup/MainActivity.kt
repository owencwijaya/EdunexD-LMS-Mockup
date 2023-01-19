package com.dicoding.lms_mockup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.lms_mockup.data.Course
import com.dicoding.lms_mockup.data.CourseData

class MainActivity : AppCompatActivity() {

    private lateinit var courseView: RecyclerView
    private var list: ArrayList<Course> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "EdunexD (LMS Mock-Up)"

        courseView = findViewById(R.id.main_view)
        courseView.setHasFixedSize(true)
        list.addAll(CourseData.courseList)
        showRecycler()
    }

    private fun showRecycler(){
        courseView.layoutManager = LinearLayoutManager(this)
        courseView.adapter = CourseAdapter(list)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean{
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.account -> {
                startActivity(Intent(this@MainActivity, AccountActivity::class.java))
            }
        }
    }
}