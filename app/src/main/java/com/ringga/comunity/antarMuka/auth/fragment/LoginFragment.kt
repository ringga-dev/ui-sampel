package com.ringga.comunity.antarMuka.auth.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.auth.viewModel.AuthViewModel
import com.ringga.comunity.antarMuka.home.HomeActivity
import com.ringga.comunity.antarMuka.profile.ProfileActivity
import com.ringga.comunity.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: AuthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        // TODO: Use the ViewModel

        binding.register.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, RegisterFragment()).commit()
        }

        binding.login.setOnClickListener {
            startActivity(Intent(context, ProfileActivity::class.java))
            Animatoo.animateShrink(context)
        }
        binding.lupa.setOnClickListener {
            startActivity(Intent(context, HomeActivity::class.java))
            Animatoo.animateShrink(context)
        }
//        Toast.makeText(context, viewModel.text(), Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}