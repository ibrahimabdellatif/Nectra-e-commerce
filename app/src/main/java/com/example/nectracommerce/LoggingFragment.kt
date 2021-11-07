package com.example.nectracommerce

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoggingFragment : Fragment() {
    private var loginBtn: Button? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_logging, container, false)
        loginBtn = view.findViewById(R.id.btn_signin)
        loginBtn?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_loggingFragment_to_homeFragment2)
        })


        return view
    }
}