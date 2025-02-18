package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2Theme {
                MovieLayout()
            }
        }
    }
}

@Composable
fun MovieLayout(){
    Column (modifier = Modifier.fillMaxWidth().fillMaxHeight()){
        Box {
            Image(painterResource(R.drawable.oppy), null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(380.dp)
                    .clip(RoundedCornerShape(10.dp)))
            Row {
                SmallImage()
                Column {
                    DetailsSection()
                    StarsSection()
                }
            }
        }
        ReviewsSection()
    }
}

@Composable
fun StarsSection(){
    Row (modifier = Modifier.padding(vertical = 20.dp)){
        Icon(
            Icons.Rounded.Star, contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFFFFD700)
        )
        Icon(
            Icons.Rounded.Star, contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFFFFD700)
        )
        Icon(
            Icons.Rounded.Star, contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFFFFD700)
        )
        Icon(
            Icons.Rounded.Star, contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFFFFD700)
        )
        Icon(
            Icons.Rounded.Star, contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color(0xFFFFD700)
        )
    }
}

@Composable
fun SmallImage(){
    Column (modifier = Modifier
        .padding(top = 290.dp)
        .padding(20.dp)){
        Image(
            painterResource(R.drawable.oppy), null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(175.dp)
                .width(120.dp)
                .clip(RoundedCornerShape(5.dp))
        )
    }
}

@Composable
fun DetailsSection(){
    Text(text = "Oppenheimer",
        fontSize = 17.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .padding(top = 425.dp)
    )
}

@Composable
fun ReviewsSection(){
    Row (modifier = Modifier
        .padding(10.dp)
        .height(125.dp)
        .padding(vertical = 10.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Length",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "2:22",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 20.dp)
                .padding(vertical = 10.dp))
        }
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Lang",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "Eng",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 20.dp)
                .padding(vertical = 10.dp))
        }
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Rating",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "9.4",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 20.dp)
                .padding(vertical = 10.dp))
        }
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Review",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "245+",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(horizontal = 20.dp)
                .padding(vertical = 10.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2Theme {
        MovieLayout()
    }
}