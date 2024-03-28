package com.app.lontara.chatbot.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
fun ChatHeader (){
    Text(text = "Chat Bot By Muhammad Noman",
    color = Color.Black,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth().background(Color.LightGray).padding(10.dp)

    )
}