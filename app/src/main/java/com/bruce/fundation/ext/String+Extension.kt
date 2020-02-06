package com.bruce.fundation.ext

/***
 * sign 签名
 * @receiver String  需要签名字符串
 * @return String 签名后字符串
 */
fun String.sign(type: Int = 0): String =
        "..."