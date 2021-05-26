package com.olimpio.study.badges.badges

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olimpio.study.badges.databinding.BadgeCardInfoBinding

class BadgesAdapter(
        private val badgesList: ArrayList<Badge>,
        private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<BadgesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = BadgeCardInfoBinding.inflate(layoutInflater, parent, false)

        binding.badgeCardInfo.setOnClickListener(clickListener)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(badgesList[position])
    }

    override fun getItemCount() = badgesList.size

    class ViewHolder(binding: BadgeCardInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        private val badgePicture: ImageView = binding.badgePicture
        private val badgeName: TextView = binding.badgeName
        private val badgeRarity: TextView = binding.badgeRarity

        fun bind(badge: Badge) {
            badgePicture.setImageResource(badge.picture)
            badgeName.text = badge.name
            badgeRarity.text = badge.rarity
        }
    }
}