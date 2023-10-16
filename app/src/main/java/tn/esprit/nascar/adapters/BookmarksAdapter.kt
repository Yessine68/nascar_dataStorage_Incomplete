package tn.esprit.nascar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.nascar.databinding.SingleItemBookmarkBinding
import tn.esprit.nascar.models.Events

class BookmarksAdapter(val eventsList: MutableList<Events>) : RecyclerView.Adapter<BookmarksAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder {
        val binding = SingleItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookmarksHolder(binding)
    }

    override fun onBindViewHolder(holder: BookmarksHolder, position: Int) {
        with(holder){
            with(eventsList[position]){
                binding.eventTitle.text = title
                binding.eventDescription.text = description
                binding.eventImage.setImageResource(imageRes)
                binding.btnRemoveBookmark.setOnClickListener {
                    //TODO 13 Delete this event from the database and refresh the list
                }
            }
        }
    }

    override fun getItemCount() = eventsList.size

    inner class BookmarksHolder(val binding: SingleItemBookmarkBinding) : RecyclerView.ViewHolder(binding.root)
}