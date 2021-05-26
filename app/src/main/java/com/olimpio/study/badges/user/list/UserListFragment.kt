package com.olimpio.study.badges.user.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.olimpio.study.badges.MainActivity
import com.olimpio.study.badges.MockedUserList
import com.olimpio.study.badges.user.details.UserDetailsFragment
import com.olimpio.study.badges.databinding.FragmentUserListBinding
import com.olimpio.study.badges.user.User

class UserListFragment : Fragment() {
    private lateinit var binding: FragmentUserListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUserList()
    }

    private fun initUserList() {
        binding.rvUserList.layoutManager = LinearLayoutManager(activity)
        binding.rvUserList.adapter = UserListAdapter(MockedUserList.userList, this::onClick)
    }

    private fun onClick(user: User) {
        (requireActivity() as MainActivity).setViewFragment(UserDetailsFragment(user))
    }
}