package com.czb.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment3, container, false)
        view.findViewById<TextView>(R.id.tv3).setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        })
        return view
    }
}