package com.dilpreet2028.viewpager2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class UserFragment : Fragment() {

    private var mUserView: TextView? = null

    companion object {
        fun getInstance(name: String): Fragment {
            val fragment = UserFragment()
            val arg = Bundle()
            arg.putString("name", name)
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mUserView = view.findViewById(R.id.user_name)
        val name = arguments?.getString("name")
        mUserView?.text = "Hello $name"
    }
}
