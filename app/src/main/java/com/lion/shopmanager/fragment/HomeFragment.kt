package com.lion.shopmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lion.shopmanager.MainActivity
import com.lion.shopmanager.R
import com.lion.shopmanager.databinding.FragmentMainBinding


class HomeFragment : Fragment() {
    private lateinit var fragmentMainBinding: FragmentMainBinding
    private lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMainBinding = FragmentMainBinding.inflate(layoutInflater,container,false)
        mainActivity = activity as MainActivity
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}