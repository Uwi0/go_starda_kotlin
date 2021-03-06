package com.kakapo.gostrada.fragment.consult

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.gostrada.R

class ConsultFragment : Fragment() {

    companion object {
        fun newInstance() = ConsultFragment()
    }

    private lateinit var viewModel: ConsultViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.consult_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConsultViewModel::class.java)
        // TODO: Use the ViewModel
    }

}