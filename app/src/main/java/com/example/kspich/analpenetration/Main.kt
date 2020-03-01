
package com.example.kspich.analpenetration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kspich.analpenetration.adapters.AndreyAdapter
import com.example.kspich.analpenetration.adapters.HistoryAdapter
import com.example.kspich.analpenetration.adapters.InfoAdapter

class Main : AppCompatActivity() {

    val AndreyList: MutableList<String> = mutableListOf("я потом увидел", "что должны быть дата и время", "но заебался там и так все просто", "и кнопка ничего не делает")

    val PicsList: MutableList<Int> = mutableListOf(R.drawable.pic1,R.drawable.pic1,R.drawable.pic1)

    val InfoList: MutableList<String> = mutableListOf("Паспорт", "Номер телефона", "Водительское удостоверение", "Слепок ануса")

    val listInfo: MutableList<String> = mutableListOf("Андрей я сделал два листа", "И не буду сейчас переделывать", "Потом когда архитектуру начну", "нет данных")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AndreyHistory: RecyclerView = findViewById(R.id.HistoryView)
        AndreyHistory.layoutManager = LinearLayoutManager(this)
        AndreyHistory.adapter = HistoryAdapter(AndreyList)

        val AndreyPics: RecyclerView = findViewById(R.id.AndreyPhoto)
        AndreyPics.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        AndreyPics.adapter = AndreyAdapter(PicsList)

        val AndreyInfo: RecyclerView = findViewById(R.id.InfoView)
        AndreyInfo.layoutManager = LinearLayoutManager(this)
        AndreyInfo.adapter = InfoAdapter(InfoList, listInfo)
    }

    public class zalupa {
        init {
        }
    }

}
