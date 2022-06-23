package columncompose.ca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import columncompose.ca.ui.theme.ColumnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnComposeTheme {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    /*RoundedIcon(
                        Icons.Rounded.Face,
                        modifier = Modifier.align(Alignment.Start)
                    )*/
                    RoundedIcon(
                        Icons.Rounded.Face,
                        modifier = Modifier.align(Alignment.End)
                    )
                    RoundedIcon(
                        Icons.Rounded.Call
                    )
                    RoundedIcon(
                        Icons.Rounded.Check
                    )
                    RoundedIcon(
                        Icons.Rounded.Clear
                    )
                    /*RoundedIcon(
                        Icons.Rounded.Face,
                        modifier = Modifier.align(Alignment.Start)
                    )*/
                }
            }
        }
    }
}

@Composable
fun RoundedIcon(icon: ImageVector, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .requiredSize(45.dp),
        shape = CircleShape,
        elevation = 2.dp
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier.background(Color.Cyan)
        ) {
            Icon(icon, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColumnComposeTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            RoundedIcon(
                Icons.Rounded.Face,
                modifier = Modifier.align(Alignment.Start)
            )
            RoundedIcon(
                Icons.Rounded.Face,
                modifier = Modifier.align(Alignment.End)
            )
            RoundedIcon(
                Icons.Rounded.Call
            )
            RoundedIcon(
                Icons.Rounded.Check
            )
            RoundedIcon(
                Icons.Rounded.Clear
            )
            RoundedIcon(
                Icons.Rounded.Face,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}
