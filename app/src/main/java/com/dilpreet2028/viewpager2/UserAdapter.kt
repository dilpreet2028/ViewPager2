package com.dilpreet2028.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class UserAdapter(private val userList: ArrayList<String>, fragmentManger: FragmentManager): FragmentStateAdapter(fragmentManger) {

    override fun getItem(position: Int): Fragment {
        return UserFragment.getInstance(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
