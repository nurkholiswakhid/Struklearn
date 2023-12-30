package com.struklearn.app.modules.treebalance.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.treebalance.`data`.model.TreeBalanceModel
import org.koin.core.KoinComponent

class TreeBalanceVM : ViewModel(), KoinComponent {
  val treeBalanceModel: MutableLiveData<TreeBalanceModel> = MutableLiveData(TreeBalanceModel())

  var navArguments: Bundle? = null
}
