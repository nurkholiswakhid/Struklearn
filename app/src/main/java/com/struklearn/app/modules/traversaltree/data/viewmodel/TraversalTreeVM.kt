package com.struklearn.app.modules.traversaltree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.traversaltree.`data`.model.TraversalTreeModel
import org.koin.core.KoinComponent

class TraversalTreeVM : ViewModel(), KoinComponent {
  val traversalTreeModel: MutableLiveData<TraversalTreeModel> =
      MutableLiveData(TraversalTreeModel())

  var navArguments: Bundle? = null
}
