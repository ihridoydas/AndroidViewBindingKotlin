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

    private var _binding: FragmentMainBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


  /*  override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedStateInstant: Bundle?): View? {

        val binding:FragmentMainBinding= FragmentMainBinding.inflate(inflater,container,false)
        binding.tvFragment.text="change change"
        return binding.root
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       _binding = FragmentMainBinding.bind(view)
        binding.tvFragment.text="change change"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }




}