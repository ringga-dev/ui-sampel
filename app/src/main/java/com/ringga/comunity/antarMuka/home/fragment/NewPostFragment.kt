package com.ringga.comunity.antarMuka.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.home.viewModel.HomeViewModel
import com.ringga.comunity.databinding.FragmentDashboardBinding
import com.ringga.comunity.databinding.FragmentNewPostBinding


class NewPostFragment : Fragment() {
    private lateinit var dashboardViewModel: HomeViewModel
    private var _binding: FragmentNewPostBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = NewPostFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentNewPostBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.textdas.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}