package com.vacuum.fragmentnavigationmvp.ui.base

interface BaseMvp {
    interface View {
        fun atachPresenter(presenter: Presenter)

    }

    interface Presenter {
        fun addFragment(fragment: BaseFragment)
    }
}