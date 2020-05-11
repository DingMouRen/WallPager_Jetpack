package com.dingmouren.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.fragment_blank1.*

class Blank1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Navigation.findNavController(view)

        //跳转到blank2fragment传递数据
        val bundle1_to_2 = Bundle()
        bundle1_to_2.putString("name", "小明")
//        btn_1.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_blank1Fragment_to_blank2Fragment) }
        btn_1.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_blank1Fragment_to_blank2Fragment, bundle1_to_2)}


        btn_2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_blank1Fragment_to_blank3Fragment) }
    }

}
