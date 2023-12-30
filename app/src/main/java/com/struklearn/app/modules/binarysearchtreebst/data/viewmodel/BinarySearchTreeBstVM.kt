package com.struklearn.app.modules.binarysearchtreebst.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.binarysearchtreebst.`data`.model.BinarySearchTreeBstModel
import org.koin.core.KoinComponent

class BinarySearchTreeBstVM : ViewModel(), KoinComponent {
  val binarySearchTreeBstModel: MutableLiveData<BinarySearchTreeBstModel> =
      MutableLiveData(BinarySearchTreeBstModel())

  var navArguments: Bundle? = null
}
