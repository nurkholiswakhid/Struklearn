package com.struklearn.app.modules.datatree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.datatree.`data`.model.DataTreeModel
import org.koin.core.KoinComponent

class DataTreeVM : ViewModel(), KoinComponent {
  val dataTreeModel: MutableLiveData<DataTreeModel> = MutableLiveData(DataTreeModel())

  var navArguments: Bundle? = null
}
