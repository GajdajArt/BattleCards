package presentation

abstract class BasePresenter<View: BaseView> {

    protected var view: View? = null

    fun bind(view: View) {
        this.view = view
        onBind()
    }

    fun unbind() {
        onUnBind()
        view = null
    }

    protected open fun onBind() {}

    protected open fun onUnBind() {}
}