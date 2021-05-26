package com.olimpio.study.badges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.olimpio.study.badges.databinding.ActivityMainBinding
import com.olimpio.study.badges.user.list.UserListFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setMainView()
    }

    private fun setMainView() {
        setViewFragment(UserListFragment())
    }

    fun setViewFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentContainer.id, fragment)
            addToBackStack(null)
            commit()
        }
    }
}