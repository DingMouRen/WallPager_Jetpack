package com.dingmouren.jetpackviewmodel.ex2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.*
import com.dingmouren.jetpackviewmodel.R
import kotlinx.android.synthetic.main.ex2_1_fragment.*

class Ex2_1Fragment : Fragment() {

    companion object {
        fun newInstance() = Ex2_1Fragment()
    }

    private lateinit var viewModel: Ex2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ex2_1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[Ex2ViewModel::class.java]//Fragment中直接以Activity作为ViewModel的Key
        viewModel.num.value = 1
        // TODO: Use the ViewModel

        tv.text = viewModel.num.value.toString()

        btn.setOnClickListener {
            var numCurrent = viewModel.num.value.toString()
            viewModel.num.value = numCurrent.toInt()+1
            tv.text = viewModel.num.value.toString()
        }

        viewModel.num.observe(viewLifecycleOwner, Observer { it ->
            tv.text = it.toString()
        })

    }

}
