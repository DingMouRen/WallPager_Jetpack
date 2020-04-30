package com.dingmouren.jetpacklifecycle.ex2

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dingmouren.jetpacklifecycle.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_ex2.*
import java.lang.StringBuilder


class Ex2Fragment : Fragment() {
    private var stringBuilder = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        stringBuilder.append("Ex2Fragment" + "--onCreateView\n")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        stringBuilder.append("Ex2Fragment" + "--onCreateView\n")
        return inflater.inflate(R.layout.fragment_ex2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        stringBuilder.append("Ex2Fragment" + "--onActivityCreated\n")
    }
    // lifecycle得onCreate对应Fragment得onViewCreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        stringBuilder.append("Ex2Fragment" + "--onViewCreated\n")
        lifecycle.addObserver(Ex2LifecycleObserver(stringBuilder,tv))
    }

    override fun onStart() {
        super.onStart()
        stringBuilder.append("Ex2Fragment" + "--onStart\n")
    }

    override fun onResume() {
        super.onResume()
        stringBuilder.append("Ex2Fragment" + "--onResume\n")
    }

    override fun onPause() {
        super.onPause()
        stringBuilder.append("Ex2Fragment" + "--onPause\n")
    }

    override fun onStop() {
        super.onStop()
        stringBuilder.append("Ex2Fragment" + "--onStop\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        stringBuilder.append("Ex2Fragment" + "--onDestroy\n")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        stringBuilder.append("Ex2Fragment" + "--onDestroyView\n")
    }


}
