package br.com.meuprimeiroprojetocompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.meuprimeiroprojetocompose.ui.theme.MeuPrimeiroProjetoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuPrimeiroProjetoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Red
                ) {
                    MyComposeFunction()
                }
            }
        }
    }

    fun showMessage() {
        Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show()
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Composable
    fun GreetingPreview() {
        MeuPrimeiroProjetoComposeTheme {
            Greeting("Android")
        }
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview(showBackground = true)
    @Composable
    fun MyComposeFunction() {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxHeight(),
        ) {
            Surface(
                color = Color.Red, modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
            ) {

            }
            Surface(
                color = Color.Blue,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(shape = RoundedCornerShape(50.dp)),
            ) {

            }
            Surface(
                color = Color.Magenta, modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
            ) {
                Box {

                    Column() {

                        Row() {
                            Text(text = "1")
                            Text(text = "1")
                            Text(text = "1")
                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Image(
                            painter = painterResource(id = R.drawable.icon),
                            contentDescription = "Image 1"
                        )
                    }
                    Text(
                        text = "2050",
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(8.dp),
                    )
                }
            }
        }
        /*Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Projeto Novo") },
                    navigationIcon = {
                        IconButton(onClick = { showMessage() }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
            },
        ) {}*/
    }
}
