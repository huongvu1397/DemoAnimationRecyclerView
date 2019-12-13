package com.excalibur.demorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_music.view.*
import android.R.attr.start
import androidx.core.view.ViewCompat.setTranslationY
import android.animation.ValueAnimator
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.TextView



class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {


    var list = ArrayList<TempObject>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_music,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[holder.adapterPosition]
        holder.onBind(data)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(data: TempObject) {
            itemView.img_move.setOnClickListener {
                val animateTextView = itemView.img_move

                val valueAnimator = ValueAnimator.ofFloat(0f, 500f)
                valueAnimator.interpolator =
                    AccelerateDecelerateInterpolator() // increase the speed first and then decrease
                valueAnimator.duration = 2000
                valueAnimator.addUpdateListener { animation ->
                    val progress = animation.animatedValue as Float
                    animateTextView.translationY = progress
                    // no need to use invalidate() as it is already present in             //the text view.
                }
                valueAnimator.start()
            }
        }

    }

}
