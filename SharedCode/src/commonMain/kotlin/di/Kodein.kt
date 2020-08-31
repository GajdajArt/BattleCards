package di

import di.module.appModule
import di.module.interactorModule
import di.module.presenterModule
import di.module.repositoryModule
import org.kodein.di.*

lateinit var di: DI

fun initDi() {
    di = DI {
        importAll(
            appModule,
            repositoryModule,
            interactorModule,
            presenterModule
        )
    }
}