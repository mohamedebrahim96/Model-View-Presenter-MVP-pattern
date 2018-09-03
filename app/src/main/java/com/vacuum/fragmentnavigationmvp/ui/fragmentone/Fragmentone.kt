package com.vacuum.fragmentnavigationmvp.ui.fragmentone

import android.os.Bundle
import android.view.View
import com.vacuum.fragmentnavigationmvp.R
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.fragmenttwo.Fragmenttwo
import kotlinx.android.synthetic.main.fragment_layout.*




class Fragmentone : BaseFragment(), FragmentoneMvpView {

        private var presenter: FragmentonePresenter? = null

        override val layout: Int
            get() = R.layout.fragment_layout

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            presenter = FragmentonePresenter(this)

            presenter!!.getText()

            btn_interact!!.setOnClickListener{ navigationPresenter?.addFragment(Fragmenttwo()) }
        }

        override fun setText(str: String) {
            tv_text!!.text = str
        }

    }