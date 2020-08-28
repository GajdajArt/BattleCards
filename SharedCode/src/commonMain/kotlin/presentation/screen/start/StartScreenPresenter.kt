package presentation.screen.start

import presentation.BasePresenter

class StartScreenPresenter: BasePresenter<StartScreenContract.View>(), StartScreenContract.Presenter {

    override fun onBind() {
        super.onBind()

        fetchRecentResult()
    }

    private fun fetchRecentResult() {
        TODO("Not yet implemented")
    }

    override fun onStartGameClick() {
        TODO("Not yet implemented")
    }
}