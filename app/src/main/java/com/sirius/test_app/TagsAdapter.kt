package com.sirius.test_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sirius.test_app.databinding.ListItemTagBinding

class TagsAdapter(
    private val items: List<String>
) : RecyclerView.Adapter<TagsAdapter.TagViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagViewHolder {
        return TagViewHolder(
            ListItemTagBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TagViewHolder, position: Int) {
        val tag = items[position]
        holder.bind(tag)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class TagViewHolder(
        private val binding: ListItemTagBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tag: String) {
            binding.root.text = tag
        }
    }
}