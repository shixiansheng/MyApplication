package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var jsonObject = JSONObject("{\n" +
                "    \"data\": { }\n" + "}")
        var data = jsonObject.optJSONObject("data")

        if (jsonObject.has("data")) {
            val countObj: JSONObject = jsonObject.optJSONObject("data")
            if (countObj != null) {
                val scoreIterator = countObj.keys()
                while (scoreIterator.hasNext()) {
                    // 获得key
                    val key = scoreIterator.next()
                    // 根据key获得value, value也可以是JSONObject,JSONArray,使用对应的参数接收即可
                    val value = countObj.optInt(key)
                    println(value)
                    "撒打发斯蒂芬撒打发斯蒂芬三大"
                }
            }
        }
    }
}