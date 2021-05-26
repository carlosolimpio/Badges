package com.olimpio.study.badges.user.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.olimpio.study.badges.badges.BadgesAdapter
import com.olimpio.study.badges.databinding.FragmentUserDetailsBinding
import com.olimpio.study.badges.user.User

class UserDetailsFragment(private val user: User) : Fragment() {
    private lateinit var binding: FragmentUserDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUserDetails()
    }

    private fun initUserDetails() {
        binding.apply {
            userDetailsPicture.setImageResource(user.picture)
            userDetailsName.text = user.name
            userDetailsProject.text = user.project
        }
        initBadgeList()
    }

    private fun initBadgeList() {
        binding.apply {
            rvBadgesList.layoutManager = LinearLayoutManager(activity)
            rvBadgesList.adapter = BadgesAdapter(user.badgeList, setClickListener())
        }
    }

    private fun setClickListener() = View.OnClickListener {
        //(requireActivity() as MainActivity).setViewFragment(Badge())
        Toast.makeText(context, "badge clicked", Toast.LENGTH_SHORT).show()
    }
}