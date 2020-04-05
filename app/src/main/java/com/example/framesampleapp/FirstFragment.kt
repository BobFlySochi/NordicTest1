package com.example.framesampleapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FirstFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }
//test git features in feature branch
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        selectionSupreme.text = arguments?.getString("key") ?: "Nan"
        selectionButton.setOnClickListener {

            selectionSupreme.visibility = View.VISIBLE
        }
        navToSecondFragment.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, SecondFragment())
                ?.commit()
        }
    }

}