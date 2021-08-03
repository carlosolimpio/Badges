package com.olimpio.study.badges.user.list

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.olimpio.study.badges.MockedUserList
import com.olimpio.study.badges.R
import com.olimpio.study.badges.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {
    private lateinit var binding: FragmentUserListBinding
    private lateinit var userAdapter: UserListAdapter

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userAdapter = UserListAdapter()
        userAdapter.setData(MockedUserList.userList)

        initUserList()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

    private fun initUserList() {
        with (binding.rvUserList) {
            layoutManager = LinearLayoutManager(activity)
            adapter = userAdapter
        }
    }
}