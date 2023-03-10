package com.example.bottomnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavfragments.databinding.FragmentBlank2Binding


class Blank2Fragment : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlank2Binding.inflate(inflater,container,false)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_blank2Fragment_to_applicationActivity) }
        return binding.root
    }

}