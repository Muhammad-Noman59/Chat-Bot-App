package com.app.lontara.chatbot



//     Made by Muhammad Noman
//
//     If you need my service or you have any question then you can contact with me.
//
//     WhatsApp number :  +923104881573
//
//     LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//     Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL

data class ChatData(
    val message : String,
    val role : String
)

enum class ChatRoleEnum (val role : String){
    USER ("user"),
    MODEL ("model")
}