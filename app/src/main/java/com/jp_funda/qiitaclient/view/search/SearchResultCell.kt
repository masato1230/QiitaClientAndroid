package com.jp_funda.qiitaclient.view.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun SearchResultCell() {
    Column(
        modifier = Modifier.padding(horizontal = 10.dp),
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "記事タイトル")
        Row(
            modifier = Modifier.height(32.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = "https://assets.st-note.com/production/uploads/images/63638586/rectangle_large_type_2_036bad6b2400148e2bab52d71576f4cc.jpg",
                contentDescription = "author icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight(0.7f)
                    .aspectRatio(1f)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "@username")
        }
        Divider()
    }
}