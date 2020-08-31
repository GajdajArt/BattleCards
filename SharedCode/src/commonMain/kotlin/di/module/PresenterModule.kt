package di.module

import di.di
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.newInstance
import org.kodein.di.provider
import presentation.gamescreen.GameScreenContract
import presentation.gamescreen.GameScreenPresenter

val presenterModule = DI.Module("presenterModule") {
    val gameScreenPresenter by di.newInstance { GameScreenPresenter() }
    bind<GameScreenContract.Presenter>() with provider { gameScreenPresenter }

    //TODO add presenters
}