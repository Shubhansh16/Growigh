package com.example.growigh

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>
    lateinit var descList:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeds)

        recyclerView=findViewById(R.id.recyclerView)

        imageList= arrayOf(
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler,
            R.drawable.imagerecycler
        )

        titleList= arrayOf(
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge",
            "The Verge"
        )

        descList= arrayOf(
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News",
            "Tech News"
        )

        recyclerView.layoutManager= LinearLayoutManager(this)

        dataList= arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for(i in imageList.indices){
            val dataClass= DataClass(imageList[i],titleList[i],descList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter= FeedAdapter(dataList)
    }
}