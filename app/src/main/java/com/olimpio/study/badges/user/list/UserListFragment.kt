package com.olimpio.study.badges.user.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.olimpio.study.badges.MockedUserList
import com.olimpio.study.badges.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {
    private lateinit var binding: FragmentUserListBinding
    private lateinit var userAdapter: UserListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userAdapter = UserListAdapter()
        userAdapter.setData(MockedUserList.userList)

        initUserList()
    }

    private fun initUserList() {
        with (binding.rvUserList) {
            layoutManager = LinearLayoutManager(activity)
            adapter = userAdapter
        }
    }
}