package com.hridoydas.androidviewbindingkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import com.hridoydas.androidviewbindingkotlin.databinding.FragmentMainBinding
import java.time.Instant

class MainFragment : Fragment(R.layout.fragment_main) {



    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedStateInstant: Bundle?): View? {

        val binding:FragmentMainBinding= FragmentMainBinding.inflate(inflater,container,false)
        binding.tvFragment.text="change change"
        return binding.root
    }




}