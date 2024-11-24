package com.lion.shopmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lion.shopmanager.MainActivity
import com.lion.shopmanager.MainActivity.FragmentName
import com.lion.shopmanager.R
import com.lion.shopmanager.databinding.FragmentShowBinding

class ShowFragment : Fragment() {

    private lateinit var fragmentShowFragmentBinding: FragmentShowBinding
    private lateinit var mainActivity: MainActivity


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentShowFragmentBinding = FragmentShowBinding.inflate(layoutInflater,container,false)
        mainActivity = activity as MainActivity
        return fragmentShowFragmentBinding.root
    }

    // SetUpToolbar
    fun setUpToolbar() {
        fragmentShowFragmentBinding.apply {
            toolbarShowCloth.apply {
                title = "상품 정보"
                setNavigationIcon(R.drawable.arrow_back_24px)
                setNavigationOnClickListener {
                    mainActivity.removeFragment(FragmentName.SEARCH_FRAGMENT)
                }
            }
        }
    }
}