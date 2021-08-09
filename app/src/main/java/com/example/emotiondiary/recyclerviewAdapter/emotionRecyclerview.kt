package com.example.emotiondiary.recyclerviewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emotiondiary.R
import com.example.emotiondiary.room.Entitys

class DiaryRecyclerview : RecyclerView.Adapter<DiaryRecyclerview.ViewHolder>() {

    private var todayemotion = ArrayList<Entitys>()

    fun setTodayList(data : ArrayList<Entitys>){
        this.todayemotion = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_emotion_item, parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.monthEmotion(todayemotion[position])
    }

    override fun getItemCount(): Int {
        return todayemotion.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val itemImg = view.findViewById<ImageView>(R.id.item_image)
        val itemText = view.findViewById<TextView>(R.id.item_text)

        fun monthEmotion(data : Entitys){

            when(data.emotionDiary){
                "angry" -> itemImg.setImageResource(R.drawable.angry)
                "cute" -> itemImg.setImageResource(R.drawable.cute)
                "lookSly" -> itemImg.setImageResource(R.drawable.looksly)
                "sad" -> itemImg.setImageResource(R.drawable.sad)
                "dizzy" -> itemImg.setImageResource(R.drawable.dizzy)
                "sleep" -> itemImg.setImageResource(R.drawable.sleep)
                "whistle" -> itemImg.setImageResource(R.drawable.whistle)
            }

            itemText.text = data.date


        }
    }
}