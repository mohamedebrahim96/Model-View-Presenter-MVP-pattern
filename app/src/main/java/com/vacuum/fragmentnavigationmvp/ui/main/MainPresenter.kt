package com.vacuum.fragmentnavigationmvp.ui.main

import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.base.BaseMvp
import com.vacuum.fragmentnavigationmvp.ui.fragmentone.Fragmentone
import com.vacuum.fragmentnavigationmvp.ui.fragmenttwo.Fragmenttwo
import java.util.*

class MainPresenter(var view: MainMvpView) :MainMvpPresenter,BaseMvp.Presenter {

    override fun getRandomFragment() {
        if (Random().nextBoolean()){
            view.setFragment(Fragmentone())
        }else{
            view.setFragment(Fragmenttwo())
        }


    }

    override fun addFragment(fragment: BaseFragment) {
        view.setFragment(fragment)
    }
}

