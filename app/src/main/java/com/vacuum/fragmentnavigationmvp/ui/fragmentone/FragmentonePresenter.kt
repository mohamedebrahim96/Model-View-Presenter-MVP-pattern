package com.vacuum.fragmentnavigationmvp.ui.fragmentone

class FragmentonePresenter(var view:FragmentoneMvpView): FragmentoneMvpPresenter{
    override fun getText() {
        view.setText("Text form Presenter ONE")
    }

}