package com.czb.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)
        view.findViewById<TextView>(R.id.tv1).setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
        view.findViewById<TextView>(R.id.tv2).setOnClickListener{
            val bundle = Bundle()
            bundle.putInt("bundle",1)
            findNavController().navigate(R.id.action_fragment2_to_mainActivity2,bundle)
        }
        return view
    }
}