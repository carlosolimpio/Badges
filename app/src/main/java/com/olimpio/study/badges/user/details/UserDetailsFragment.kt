package com.olimpio.study.badges.user.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.olimpio.study.badges.badges.BadgesAdapter
import com.olimpio.study.badges.databinding.FragmentUserDetailsBinding
import com.olimpio.study.badges.user.User

class UserDetailsFragment() : Fragment() {
    private lateinit var user: User
    private val args: UserDetailsFragmentArgs by navArgs()
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

        user = args.user
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
            with (rvBadgesList) {
                layoutManager = LinearLayoutManager(activity)
                adapter = BadgesAdapter(user.badgeList, setClickListener())
            }
        }
    }

    private fun setClickListener() = View.OnClickListener {
        Toast.makeText(context, "badge clicked", Toast.LENGTH_SHORT).show()
    }
}