package com.vacuum.fragmentnavigationmvp.ui.fragmentone

import android.os.Bundle
import android.support.annotation.Nullable
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


    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?,
                              @Nullable savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(layout, container, false)
        presenter?.getText()

        btn_interact.setOnClickListener{ navigationPresenter!!.addFragment(Fragmenttwo()) }
        return rootView
    }
    override fun setText(str: String) {
        tv_text.setText(str)
    }


}
