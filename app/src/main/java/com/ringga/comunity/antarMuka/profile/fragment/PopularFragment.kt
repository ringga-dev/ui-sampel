package com.ringga.comunity.antarMuka.profile.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.auth.fragment.RegisterFragment
import com.ringga.comunity.antarMuka.auth.viewModel.AuthViewModel
import com.ringga.comunity.antarMuka.home.HomeActivity
import com.ringga.comunity.antarMuka.profile.ProfileActivity
import com.ringga.comunity.antarMuka.profile.viewModel.ProfileViewModel
import com.ringga.comunity.databinding.FragmentGalleryBinding
import com.ringga.comunity.databinding.FragmentPopularBinding


class PopularFragment : Fragment() {

    private lateinit var galleryViewModel: ProfileViewModel
    private var _binding: FragmentPopularBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        galleryViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentPopularBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel

        binding.myBtn.setOnClickListener({ v ->
            var creditCard = binding.ccView.creditCardInfo
        })


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}