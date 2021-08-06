package com.example.tillnow.firstfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.tillnow.R
import com.example.tillnow.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var viewModel: FirstFragmentViewModel
    lateinit var viewModelFactory: FirstFragmentViewModelFactory
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        viewModelFactory = FirstFragmentViewModelFactory(-10)
        viewModel = ViewModelProvider(this,viewModelFactory).get(FirstFragmentViewModel::class.java)
        binding.firstFragmentViewModel = viewModel
        binding.lifecycleOwner = this

        binding.nextFragment.setOnClickListener { view : View ->
            view.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                viewModel.currentValue.value!!
            ))
        }

        return binding.root
    }
}