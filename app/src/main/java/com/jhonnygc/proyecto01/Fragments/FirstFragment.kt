package com.jhonnygc.proyecto01.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jhonnygc.proyecto01.R
import com.jhonnygc.proyecto01.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnInicio.setOnClickListener {
            findNavController().navigate(R.id.action_LoginFragment_to_secondFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return  binding.root
    }
}