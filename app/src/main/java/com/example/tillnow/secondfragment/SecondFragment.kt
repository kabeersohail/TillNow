package com.example.tillnow.secondfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.tillnow.R
import com.example.tillnow.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second,container,false)
        val args = SecondFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context,"${args.prevValue}",Toast.LENGTH_SHORT).show()
        binding.currentValue.text = args.prevValue.toString()
        return binding.root
    }

}