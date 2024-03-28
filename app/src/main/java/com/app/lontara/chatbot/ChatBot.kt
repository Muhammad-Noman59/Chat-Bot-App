package com.app.lontara.chatbot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.lontara.chatbot.components.ChatFooter
import com.app.lontara.chatbot.components.ChatHeader
import com.app.lontara.chatbot.components.ChatList


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
fun ChatBot (
    viewModel: ChatBotViewModel = viewModel()
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        ChatHeader()


        Box (modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center,
        ) {

            if (viewModel.list.isEmpty()){

                Text(text = "No Chat Available")
            }else


            ChatList(list = viewModel.list)
        }

        ChatFooter {
            if (it.isNotEmpty()){
                viewModel.sendMessage(it)
            }
        }
    }

}
