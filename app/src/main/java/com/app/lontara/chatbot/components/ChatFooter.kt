package com.app.lontara.chatbot.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment


//     Made by Muhammad Noman
//
//     If you need my service or you have any question then you can contact with me.
//
//     WhatsApp number :  +923104881573
//
//     LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//     Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL

@Composable
fun ChatFooter(
    onClick: (text: String) -> Unit
) {

    var inputText by remember {

        mutableStateOf("")
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(10.dp)

    ) {
        OutlinedTextField(
            value = inputText, onValueChange = { inputText = it },
            placeholder = { Text(text = "Enter Your Question...") },
            singleLine = true,
            modifier = Modifier
                .weight(1f)
                .background(Color.Gray)
        )

        IconButton(
            onClick = {
                onClick(inputText)

                inputText = "" // Clear the input field after sending
            }
        ) {
            Icon(
                Icons.Rounded.Send,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
                    .padding(8.dp),
                tint = Color.White
            )
        }
    }

}
