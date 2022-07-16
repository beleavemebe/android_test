package com.sirius.test_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sirius.test_app.databinding.ListItemReviewBinding

class ReviewsAdapter(
    private val items: List<ReviewModel>
) : RecyclerView.Adapter<ReviewsAdapter.ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        return ReviewViewHolder(
            ListItemReviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val review = items[position]
        holder.bind(review)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ReviewViewHolder(
        private val binding: ListItemReviewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(review: ReviewModel) {
            binding.tvReviewDate.text = review.date
            binding.tvPersonName.text = review.userName
            binding.tvReviewText.text = review.message
            binding.personAvatar.load(review.userImage)
        }
    }
}