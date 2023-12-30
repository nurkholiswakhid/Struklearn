package com.struklearn.app.modules.operasipadatree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.operasipadatree.`data`.model.OperasiPadaTreeModel
import org.koin.core.KoinComponent

class OperasiPadaTreeVM : ViewModel(), KoinComponent {
  val operasiPadaTreeModel: MutableLiveData<OperasiPadaTreeModel> =
      MutableLiveData(OperasiPadaTreeModel())

  var navArguments: Bundle? = null
}
