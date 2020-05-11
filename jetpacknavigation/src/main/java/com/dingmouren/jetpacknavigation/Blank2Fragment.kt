package com.dingmouren.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.fragment_blank2.*


class Blank2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //接收blank1fragment传递来的数据
        var name = arguments?.get("name")
        tv_name.text = "传递过来的名字:".plus(name)
        btn_1.setOnClickListener { Navigation.findNavController(view).navigateUp() } //返回
    }

}
