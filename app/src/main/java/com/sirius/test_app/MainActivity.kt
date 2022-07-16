package com.sirius.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load
import com.sirius.test_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataModel = DataModel()
        renderUi(dataModel)
    }

    private fun renderUi(dataModel: DataModel) {
        binding.ivBanner.load(dataModel.image)
        binding.ivLogo.load(dataModel.logo)

        binding.tvGameTitle.text = dataModel.name
        binding.tvReviewCount.text = dataModel.gradeCnt
        binding.tvRating.text = dataModel.rating.toDouble().toString().substring(0..2)
        binding.tvReviewCountVerbose.text = getString(R.string.review_count_placeholder, dataModel.gradeCnt)
        binding.tvDescription.text = dataModel.description

        binding.btnAction.text = dataModel.action.name

        binding.ratingBar.rating = dataModel.rating * 20
        binding.rbReviewsAndRatings.rating = dataModel.rating * 20

        binding.rvTags.adapter = TagsAdapter(dataModel.tags)
        binding.rvReviews.adapter = ReviewsAdapter(dataModel.reviews)
    }
}