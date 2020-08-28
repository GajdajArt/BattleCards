package domain

import data.model.Player
import presentation.screen.start.model.RecentResult

class FetchRecentResultInteractor {

    operator fun invoke(): RecentResult {
        //TODO implement
        return RecentResult(Player("Name", "12"))
    }
}