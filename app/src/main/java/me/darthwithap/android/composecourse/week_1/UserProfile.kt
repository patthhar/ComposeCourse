package me.darthwithap.android.composecourse.week_1

import androidx.annotation.DrawableRes
import me.darthwithap.android.composecourse.R

data class UserProfile(
    @DrawableRes val profileImage: Int,
    val name: String,
    val city: String,
    val images: List<Int> = listOf()
) {
    companion object {
        val fakeProfile = UserProfile(
            profileImage = R.drawable.profile_img,
            name = "Jane",
            city = "San Francisco, CA",
            images = listOf(
                R.drawable.image_1,
                R.drawable.image_2,
                R.drawable.image_3,
                R.drawable.image_4,
                R.drawable.image_5,
                R.drawable.image_6,
            )
        )
    }
}
