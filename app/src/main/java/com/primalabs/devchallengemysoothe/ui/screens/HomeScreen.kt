package com.primalabs.devchallengemysoothe.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.primalabs.devchallengemysoothe.R
import com.primalabs.devchallengemysoothe.ui.theme.DevChallengeMySootheTheme

@Composable
fun HomeScreen(){
    Scaffold(
        content = { HomeContent() },
        bottomBar = {
            BottomBar()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    )
}

@Composable
private fun BottomBar() {
    BottomAppBar(
        backgroundColor = MaterialTheme.colors.background,
        cutoutShape = CircleShape
    ) {
        BottomNavigationItem(
            selected = false,
            onClick = { },
            icon = { Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null
            ) },
            label = { Text("HOME", style = MaterialTheme.typography.caption) }
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                ) },
            label = { Text("PROFILE", style = MaterialTheme.typography.caption) }
        )
    }
}

@Composable
private fun HomeContent() {
    Surface(
        color = MaterialTheme.colors.background
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxSize()
        ) {
            Spacer(Modifier.height(56.dp))

            TextField(
                value = "",
                onValueChange = {},
                label = { Text("Search") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = MaterialTheme.typography.body1
            )

            FavoritesSection()

            Text(
                text = "ALIGN YOUR BODY",
                modifier = Modifier.paddingFromBaseline(top = 40.dp),
                style = MaterialTheme.typography.h2
            )

            Spacer(Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp),
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.meditation),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(88.dp)
                            .clip(RoundedCornerShape(50))
                    )
                    Text(
                        text = "Meditations",
                        style = MaterialTheme.typography.h3,
                        modifier = Modifier.paddingFromBaseline(top = 24.dp)
                    )

                }
            }

        }
    }
}

@Composable
private fun FavoritesSection() {
    Text(
        text = "FAVOURITE COLLECTIONS",
        modifier = Modifier.paddingFromBaseline(top = 40.dp),
        style = MaterialTheme.typography.h2
    )

    Spacer(Modifier.height(8.dp))

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
    ) {
        FavouriteCollectionItem()
        FavouriteCollectionItem()
        FavouriteCollectionItem()
        FavouriteCollectionItem()
    }
}

@Composable
private fun FavouriteCollectionItem() {
    Card(
        modifier = Modifier
            .height(56.dp)
            .width(192.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(R.drawable.meditation),
                contentDescription = null,
                modifier = Modifier.size(56.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.width(16.dp))

            Text(
                text = "Short Mantras",
                style = MaterialTheme.typography.h3
            )
        }
    }
}

@Composable
@Preview
fun PreviewLightHomeScreen(){
    DevChallengeMySootheTheme(darkTheme = false) {
        HomeScreen()
    }
}

@Composable
@Preview
fun PreviewDarkHomeScreen(){
    DevChallengeMySootheTheme(darkTheme = true) {
        HomeScreen()
    }
}