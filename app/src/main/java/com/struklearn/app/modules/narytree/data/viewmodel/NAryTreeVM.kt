package com.struklearn.app.modules.narytree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.narytree.`data`.model.NAryTreeModel
import org.koin.core.KoinComponent

class NAryTreeVM : ViewModel(), KoinComponent {
  val nAryTreeModel: MutableLiveData<NAryTreeModel> = MutableLiveData(NAryTreeModel())

  var navArguments: Bundle? = null
}
