package com.dicoding.lms_mockup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class CourseActivity : AppCompatActivity() {
    private lateinit var courseTitle: TextView
    private lateinit var courseCredits: TextView
    private lateinit var courseImage: ImageView
    private lateinit var courseDesc: TextView
    private lateinit var enrollButton: Button
    private lateinit var bookmarkButton: Button
    private var enrolled : Boolean = false
    private var bookmarked : Boolean = false

    companion object {
        const val COURSE_NAME = "COURSE_NAME"
        const val COURSE_CREDITS = "COURSE_CREDITS"
        const val COURSE_IMAGE = "COURSE_IMAGE"
        const val COURSE_DESC = "COURSE_DESC"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        courseTitle = findViewById(R.id.course_title)
        courseCredits= findViewById(R.id.course_credits)
        courseImage = findViewById(R.id.course_image)
        courseDesc = findViewById(R.id.course_desc)
        enrollButton = findViewById(R.id.enroll_button)
        bookmarkButton = findViewById(R.id.bookmark_button)

        courseTitle.text = intent.getStringExtra(COURSE_NAME)

        val credString = intent.getIntExtra(COURSE_CREDITS, 0).toString() + " credits"
        courseCredits.text = credString

        courseDesc.text = intent.getStringExtra(COURSE_DESC)
        supportActionBar?.title = "Course Information"

        Glide.with(courseImage).load(intent.getIntExtra(COURSE_IMAGE, 0)).into(courseImage)

        enrollButton.setOnClickListener {
            when (enrolled) {
                false -> {
                    Toast.makeText(this@CourseActivity,
                        "Successfully enrolled to " + intent.getStringExtra(COURSE_NAME) + "!",
                        Toast.LENGTH_LONG).show()
                    enrollButton.text = "Delist"
                    enrolled = true
                }
                true -> {
                    Toast.makeText(this@CourseActivity,
                        "Successfully delisted from " + intent.getStringExtra(COURSE_NAME) + "!",
                        Toast.LENGTH_LONG).show()
                    enrollButton.text = "Enroll"
                    enrolled = false
                }
            }
        }

        bookmarkButton.setOnClickListener {
            when (bookmarked){
                false -> {
                    Toast.makeText(this@CourseActivity,
                        "Bookmarked " + intent.getStringExtra(COURSE_NAME) + "!",
                        Toast.LENGTH_LONG).show()
                    bookmarkButton.text = "Delete"
                    bookmarked = true
                }

                true -> {
                    Toast.makeText(this@CourseActivity,
                        "Deleted " + intent.getStringExtra(COURSE_NAME) + " from bookmarked courses!",
                        Toast.LENGTH_LONG).show()
                    bookmarkButton.text = "Bookmark"
                    bookmarked = false
                }
            }
        }
    }
}