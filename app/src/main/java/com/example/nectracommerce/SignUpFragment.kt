package com.example.nectracommerce

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SignUpFragment : Fragment() {
    private var signUpBtn: Button? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        signUpBtn = view?.findViewById(R.id.btn_signup)

        signUpBtn?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_loggingFragment2)
        })

        return view
    }
}