package com.olimpio.study.badges.user.list

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olimpio.study.badges.databinding.UserCardInfoBinding
import com.olimpio.study.badges.user.User

class UserListAdapter(
        private val userList: ArrayList<User>,
        private val listener: (user: User) -> Unit
) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = UserCardInfoBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount() = userList.size

    inner class ViewHolder(binding: UserCardInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        private val userPicture: ImageView = binding.userPicture
        private val userName: TextView = binding.userName
        private val userProject: TextView = binding.userProject

        fun bind(user: User) {
            userPicture.setImageResource(user.picture)
            userName.text = user.name
            userProject.text = user.project

            itemView.setOnClickListener {
                listener(user)
            }
        }
    }

}