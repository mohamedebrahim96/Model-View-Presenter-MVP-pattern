package com.vacuum.fragmentnavigationmvp.ui.base

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


abstract class BaseFragment : Fragment(), BaseMvp.View {

    protected var rootView: View? = null

    protected var navigationPresenter: BaseMvp.Presenter? =null

    protected abstract val layout: Int

    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?,
                              @Nullable savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(layout, container, false)
        return rootView
    }



    override fun atachPresenter(presenter: BaseMvp.Presenter) {
        navigationPresenter = presenter
    }

}