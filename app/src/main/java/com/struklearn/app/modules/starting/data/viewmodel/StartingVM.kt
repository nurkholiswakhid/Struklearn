package com.struklearn.app.modules.starting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.starting.`data`.model.StartingModel
import org.koin.core.KoinComponent

class StartingVM : ViewModel(), KoinComponent {
  val startingModel: MutableLiveData<StartingModel> = MutableLiveData(StartingModel())

  var navArguments: Bundle? = null
}
