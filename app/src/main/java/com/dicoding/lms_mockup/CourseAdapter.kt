package com.dicoding.lms_mockup

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.lms_mockup.data.Course

class CourseAdapter (private val courseList: ArrayList<Course>) : RecyclerView.Adapter<CourseAdapter.CardHolder>() {

    inner class CardHolder(cardView: View) : RecyclerView.ViewHolder(cardView){
        var photo: ImageView = cardView.findViewById(R.id.photo)
        var courseName: TextView = cardView.findViewById(R.id.course_name)
        var detailsButton: Button = cardView.findViewById(R.id.details_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return CardHolder(view)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        val course = courseList[position]
        Glide.with(holder.itemView.context)
            .load(course.photo)
            .into(holder.photo)

        holder.courseName.text = course.name
        holder.detailsButton.setOnClickListener {
            val dataIntent = Intent(holder.itemView.context, CourseActivity::class.java)
            dataIntent.putExtra(CourseActivity.COURSE_NAME, course.name)
            dataIntent.putExtra(CourseActivity.COURSE_CREDITS, course.credit)
            dataIntent.putExtra(CourseActivity.COURSE_IMAGE, course.photo)
            dataIntent.putExtra(CourseActivity.COURSE_DESC, course.details)
            holder.itemView.context.startActivity(dataIntent)
        }
    }

    override fun getItemCount() = courseList.size

}
