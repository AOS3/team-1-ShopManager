package com.lion.shopmanager.util

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.google.android.material.transition.MaterialSharedAxis
import com.lion.shopmanager.R

/**
 * Fragment 교체를 위한 함수
 */
fun Fragment.replaceFragment(fragment: Fragment, dataBundle: Bundle?) {

    if(dataBundle != null){
        fragment.arguments = dataBundle
    }

    parentFragmentManager.commit {
        replace(R.id.fragmentContainerViewMain, fragment)
        addToBackStack(fragment.name)
    }
}

/**
 * Fragment 삭제를 위한 함수
 */
fun Fragment.removeFragment(fragmentName: FragmentName){
    parentFragmentManager.popBackStack(fragmentName.str, FragmentManager.POP_BACK_STACK_INCLUSIVE)
}

/**
 * Fragment 이름 반환 프로퍼티
 */
val Fragment.name: String
    get() {
        val name = Fragment::class.simpleName!!
        return name
    }

/**
 * 최초의 Fragment 등록을 위한 함수
 */
fun AppCompatActivity.entryFragment(fragment: Fragment, dataBundle: Bundle?){
    if(dataBundle != null){
        fragment.arguments = dataBundle
    }
    supportFragmentManager.commit {
        replace(R.id.fragmentContainerViewMain, fragment)
    }
}

