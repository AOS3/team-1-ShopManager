package com.lion.shopmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lion.shopmanager.MainActivity
import com.lion.shopmanager.MainActivity.FragmentName
import com.lion.shopmanager.R
import com.lion.shopmanager.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    private lateinit var fragmentSearchFragmentBinding: FragmentSearchBinding
    private lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSearchFragmentBinding = FragmentSearchBinding.inflate(layoutInflater,container,false)
        mainActivity = activity as MainActivity

        // Toolbar
        setUpToolbar()

        return fragmentSearchFragmentBinding.root
    }

    // SetUpToolbar
    fun setUpToolbar() {
        fragmentSearchFragmentBinding.apply {
            toolbarSearchCloth.apply {
                title = "상품 검색"
                setNavigationIcon(R.drawable.arrow_back_24px)
                setNavigationOnClickListener {
                    mainActivity.removeFragment(FragmentName.SEARCH_FRAGMENT)
                }
            }
        }
    }
}