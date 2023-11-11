package me.darthwithap.android.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import me.darthwithap.android.composecourse.ui.theme.ComposeCourseTheme
import me.darthwithap.android.composecourse.week_3.Effects
import me.darthwithap.android.composecourse.week_3.EffectsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    ProfileScreenConstraintLayout(
//                        modifier = Modifier,
//                        userProfile = UserProfile.fakeProfile
//                    )
                    Effects(
                        viewModel = EffectsViewModel()
                    )
                }
            }
        }
    }
}