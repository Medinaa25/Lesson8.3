package com.example.lesson83

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lesson83.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private lateinit var characters: Characters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding =
            FragmentDetailsBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}