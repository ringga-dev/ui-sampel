package com.ringga.comunity.antarMuka.auth.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.auth.viewModel.AuthViewModel
import com.ringga.comunity.databinding.FragmentLoginBinding
import com.ringga.comunity.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = RegisterFragment()
    }

    private lateinit var viewModel: AuthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        // TODO: Use the ViewModel
        binding.login.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, LoginFragment()).commit()
        }


//        Toast.makeText(context, viewModel.text(), Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}