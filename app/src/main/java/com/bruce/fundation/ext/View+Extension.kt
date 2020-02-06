package com.bruce.fundation.ext


import android.view.View


fun <T : View> T.click(eventName: String, time: Long = 600, block: (T) -> Unit){

//    TrackAgent.currentEvent().customEvent(eventName)
//    block(it)
}

fun <T : View> T.click(eventName: String, trackMap: HashMap<String, String>, time: Long = 600, block: (T) -> Unit) {

//    TrackAgent.currentEvent().customEvent(eventName, trackMap)
//    block(it)
}
