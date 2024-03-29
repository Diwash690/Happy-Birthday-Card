package com.example.happybirthday

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Image(
                        painterResource(id = R.drawable.androidparty),
                        contentDescription = "abcd",
//                      colorFilter = ColorFilter.tint(Color.Magenta)     ** It changes the color for my birthday card
                    )

                    GreetingText(message = "Happy Birthday Pratik!", from = "From Dibash")
//                    Button(onClick = { /*TODO*/ }) {
//                        Image(
//                            painterResource(id = R.drawable.birthdayemoji),
//                            contentDescription = "icon",
//                            Modifier.size(50.dp)
//                        )

                }
            }

        }
    }
}


//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//
//    )
//}
//@Preview(showBackground = true, name = "light mode")
//@Preview(showBackground = true, name = "dark mode", uiMode = Configuration.UI_MODE_NIGHT_YES)



@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
        Text(
            text = from,
            fontSize = 36.sp
        )
    }
}




@Preview(showBackground = true, name = "My BirthdayWish")
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Pratik!", from = "From Dibash")

//        for adding the image for the birthday card
        Image(
            painterResource(id = R.drawable.androidparty),
            contentDescription = "abcd",
//            colorFilter = ColorFilter.tint(Color.Magenta)     ** It changes the color for my birthday card
        )
        GreetingText(message = "Happy Birthday Pratik!", from = "From Dibash")

//        for adding the button to your birthday application where onClick is the event
        Button(onClick = { /*TODO*/ }) {
            Image(
                painterResource(id = R.drawable.birthdayemoji),
                contentDescription = "icon",
                Modifier.size(50.dp)
            )
        }
    }

}
