package com.example.homework1_7m.presentation.ui.fragment.second

import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.core.core.BaseFragment
import com.example.homework1_7m.R
import com.example.homework1_7m.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>(FragmentSecondBinding::inflate){

    override fun setupUI() {

        binding().btnSave.setOnClickListener {
            val edTitle = binding().edTitle.text.toString()
            val edDesc = binding().edDesc.text.toString()

            val bundle = Bundle()
            bundle.putString("edTitle", edTitle)
            bundle.putString("edDesc", edDesc)

            findNavController().navigate(R.id.mainFragment, bundle)
        }

    }

}