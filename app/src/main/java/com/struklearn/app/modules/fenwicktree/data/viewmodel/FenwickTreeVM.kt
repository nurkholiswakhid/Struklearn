package com.struklearn.app.modules.fenwicktree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.fenwicktree.`data`.model.FenwickTreeModel
import org.koin.core.KoinComponent

class FenwickTreeVM : ViewModel(), KoinComponent {
  val fenwickTreeModel: MutableLiveData<FenwickTreeModel> = MutableLiveData(FenwickTreeModel())

  var navArguments: Bundle? = null
}
