package com.vacuum.fragmentnavigationmvp.ui.fragmenttwo

import com.vacuum.fragmentnavigationmvp.R
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment

class Fragmenttwo : BaseFragment(),FragmenttwoMvpView {
    override val layout: Int
        get() = R.layout.fragment_layout

    override fun setTexxt(str: String) {

    }

}
