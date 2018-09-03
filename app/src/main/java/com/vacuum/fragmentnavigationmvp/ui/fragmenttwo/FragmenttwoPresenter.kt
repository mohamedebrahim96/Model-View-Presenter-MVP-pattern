package com.vacuum.fragmentnavigationmvp.ui.fragmenttwo

class FragmenttwoPresenter(var view:FragmenttwoMvpView):FragmenttwoMvpPresenter {
    override fun getTexxt() {
        view.setTexxt("this is Two Fragment")
    }
}