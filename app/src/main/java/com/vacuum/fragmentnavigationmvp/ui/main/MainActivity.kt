package com.vacuum.fragmentnavigationmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.fragmentnavigationmvp.ui.base.BaseFragment
import com.vacuum.fragmentnavigationmvp.ui.main.MainMvpView
import com.vacuum.fragmentnavigationmvp.ui.main.MainPresenter


class MainActivity : AppCompatActivity(), MainMvpView {

    private var presenter: MainPresenter? = null

    //https://medium.com/@urmanschi.mihail/mvp-fragment-navigation-from-inside-fragments-2c4388f97904
    //https://github.com/dsdmsa/FragmentNavigationMVP
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)

        presenter!!.getRandomFragment()
    }

    override fun setFragment(fragment: BaseFragment) {
        //ataching to fragment the navigation presenter
        fragment.atachPresenter(presenter!!)
        //showing the presenter on screen
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
    }
}