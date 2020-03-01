
package com.example.kspich.analpenetration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.kspich.analpenetration.adapters.HistoryAdapter
import com.example.kspich.analpenetration.adapters.zalupa

class Main : AppCompatActivity() {

    val AndreyList: MutableList<String> = mutableListOf("срал 10 часов","спал 10 часов","кодил 10 часов")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val AndreyHistory: RecyclerView = findViewById(R.id.HistoryView)
        AndreyHistory.layoutManager = LinearLayoutManager(this)
        AndreyHistory.adapter = HistoryAdapter(AndreyList)
    }

    public class zalupa {
        init {
        }
    }

}
