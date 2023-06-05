package br.com.meuprimeiroprojetocompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.meuprimeiroprojetocompose.ui.theme.MeuPrimeiroProjetoComposeTheme

class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showData()
        }
    }

    fun showMessage() {
        Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show()
    }
    @Composable
    fun showData() {
        MeuPrimeiroProjetoComposeTheme {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .width(600.dp)
                    .padding(top = 50.dp)
                    .border(5.dp, color = Color.Red)
                    .padding(5.dp)
                    .border(5.dp, Color.Green)
                    .padding(10.dp)
                    .border(5.dp, Color.Magenta)

            ) {
                Text(text = "Hello", modifier = Modifier.border(5.dp, Color.Magenta).clickable {
                    showMessage()
                })
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "word")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Preview() {
        showData()
    }
}