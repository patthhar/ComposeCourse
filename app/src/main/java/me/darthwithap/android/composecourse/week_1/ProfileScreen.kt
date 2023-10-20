package me.darthwithap.android.composecourse.week_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.darthwithap.android.composecourse.R
import me.darthwithap.android.composecourse.ui.theme.Comfortaa
import me.darthwithap.android.composecourse.ui.theme.Roboto
import me.darthwithap.android.composecourse.week_1.composables.CustomButton

@Composable
fun ProfileScreen(
    modifier: Modifier,
    userProfile: UserProfile,
    onFollowClick: () -> Unit = {},
    onMessageClick: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .padding(32.dp)
                .size(128.dp)
                .clip(CircleShape),
            painter = painterResource(userProfile.profileImage),
            contentDescription = "Profile Image"
        )
        Text(
            text = userProfile.name,
            style = TextStyle(
                fontFamily = Comfortaa,
                fontWeight = FontWeight.Normal,
                fontSize = 36.sp,
                lineHeightStyle = LineHeightStyle.Default,
                letterSpacing = (-0.54).sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            text = userProfile.city.toUpperCase(Locale.current),
            style = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Black,
                fontSize = 13.sp,
                lineHeightStyle = LineHeightStyle.Default,
                letterSpacing = 0.52.sp,
                textAlign = TextAlign.Center
            )
        )
        CustomButton(
            onClick = onFollowClick, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(
                    R.string.follow_button,
                    userProfile.name
                ).toUpperCase(Locale.current),
                style = TextStyle(
                    fontFamily = Roboto,
                    fontWeight = FontWeight.Black,
                    fontSize = 13.sp,
                    lineHeightStyle = LineHeightStyle.Default,
                    letterSpacing = 0.52.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            )
        }
        CustomButton(
            onClick = onMessageClick, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            containerColor = Color.White,
            contentColor = Color.Black,
            borderColor = Color.Black
        ) {
            Text(
                text = stringResource(R.string.message).toUpperCase(Locale.current),
                style = TextStyle(
                    fontFamily = Roboto,
                    fontWeight = FontWeight.Black,
                    fontSize = 13.sp,
                    lineHeightStyle = LineHeightStyle.Default,
                    letterSpacing = 0.52.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
        LazyVerticalGrid(
            GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp)
        ) {
            items(userProfile.images) {
                Image(
                    painterResource(it),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(
    modifier: Modifier = Modifier
) {
    ProfileScreen(modifier.fillMaxSize(), UserProfile.fakeProfile)
}