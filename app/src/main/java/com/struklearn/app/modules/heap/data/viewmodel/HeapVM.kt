package com.struklearn.app.modules.heap.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.heap.`data`.model.HeapModel
import org.koin.core.KoinComponent

class HeapVM : ViewModel(), KoinComponent {
  val heapModel: MutableLiveData<HeapModel> = MutableLiveData(HeapModel())

  var navArguments: Bundle? = null
}
