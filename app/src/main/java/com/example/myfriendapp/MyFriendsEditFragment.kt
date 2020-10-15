package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFriendsEditFragment : Fragment() {
    companion object {
        fun newInstance(): MyFriendsEditFragment {
            return MyFriendsEditFragment()
        }
    }

    private var db: AppDatabase? = null
    private var myFriendDao: MyFriendDAO? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_friends_edit_fragment, container, false)
    }

}
