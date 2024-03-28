package com.app.lontara.chatbot

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch


//     Made by Muhammad Noman
//
//     If you need my service or you have any question then you can contact with me.
//
//     WhatsApp number :  +923104881573
//
//     LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//     Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL



class ChatBotViewModel : ViewModel() {

    val list by lazy {
        mutableStateListOf<ChatData>()
    }

    private val genAI by lazy {

        GenerativeModel(

            modelName = "gemini-pro",
            apiKey = "yourapikey"
        )
    }

    fun sendMessage(message: String) = viewModelScope.launch {

        val chat = genAI.startChat()
        list.add(ChatData(message, ChatRoleEnum.USER.role))

        chat.sendMessage(content(ChatRoleEnum.USER.role) { text(message) }).text?.let {

            list.add(ChatData(it,ChatRoleEnum.MODEL.role))
        }

    }

}

