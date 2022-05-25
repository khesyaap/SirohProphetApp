package com.khesya.idn.sirohprophetapp.repo

import com.khesya.idn.sirohprophetapp.model.ResponseMain
import com.khesya.idn.sirohprophetapp.network.ConfigNetwork
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class RepositoryMain {

    fun getData(responhandler: (List<ResponseMain>) -> Unit, errorHandler: (Throwable) -> Unit){
        ConfigNetwork.service().getData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responhandler(it)
            },{
                errorHandler(it)
            })
    }
}