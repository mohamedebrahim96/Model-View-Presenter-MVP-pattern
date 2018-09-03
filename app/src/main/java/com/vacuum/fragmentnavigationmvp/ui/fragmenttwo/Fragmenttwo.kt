package com.vacuum.fragmentnavigationmvp.ui.fragmenttwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vacuum.fragmentnavigationmvp.R
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.fragmentone.Fragmentone
import kotlinx.android.synthetic.main.fragment_layout.*

class Fragmenttwo : BaseFragment(),FragmenttwoMvpView {
    override val layout: Int
        get() = R.layout.fragment_layout

    var presenter:FragmenttwoPresenter?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        presenter?.getTexxt()

        btn_interact.setOnClickListener { navigationPresenter?.addFragment(Fragmentone())}
    }
    override fun setTexxt(str: String) {
        tv_text.setText(str)
    }

}
