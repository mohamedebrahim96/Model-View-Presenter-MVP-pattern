package com.vacuum.fragmentnavigationmvp.ui.fragmentone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vacuum.fragmentnavigationmvp.R
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.fragmenttwo.Fragmenttwo
import kotlinx.android.synthetic.main.fragment_layout.*


class Fragmentone : BaseFragment(),FragmentoneMvpView {

    override val layout: Int
        get() =  R.layout.fragment_layout

    var presenter: FragmentonePresenter? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        presenter?.getText()

        btn_interact.setOnClickListener{ navigationPresenter!!.addFragment(Fragmenttwo()) }
    }

    override fun setText(str: String) {
        tv_text.setText(str)
    }


}
