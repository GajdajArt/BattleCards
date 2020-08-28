package presentation.screen.start

import presentation.BaseView
import presentation.screen.start.model.RecentResult

interface StartScreenContract {

    interface View: BaseView {

        fun showRecentResult(result: RecentResult)
    }

    interface Presenter {

        fun onStartGameClick()
    }
}