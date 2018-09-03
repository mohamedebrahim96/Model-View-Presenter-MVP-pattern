package com.vacuum.fragmentnavigationmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.main.MainMvpView
import com.vacuum.fragmentnavigationmvp.ui.main.MainPresenter

class MainActivity : AppCompatActivity(), MainMvpView {


    var presenter: MainPresenter? = null
    //https://medium.com/@urmanschi.mihail/mvp-fragment-navigation-from-inside-fragments-2c4388f97904
    //https://github.com/dsdmsa/FragmentNavigationMVP
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter!!.getRandomFragment()
    }


    override fun setFragment(basefragmnt: BaseFragment) {

        basefragmnt.atachPresenter(presenter!!)
        //showing the presenter on screen
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,basefragmnt)
                .commit()
    }
}
