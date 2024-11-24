package com.lion.shopmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lion.shopmanager.MainActivity
import com.lion.shopmanager.R
import com.lion.shopmanager.databinding.FragmentModifyBinding

class ModifyFragment : Fragment() {

    lateinit var fragmentModifyBinding: FragmentModifyBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fragmentModifyBinding = FragmentModifyBinding.inflate(inflater)
        mainActivity = activity as MainActivity

        return fragmentModifyBinding.root
    }

}