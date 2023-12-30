package com.struklearn.app.modules.pohonbinari.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.struklearn.app.modules.pohonbinari.`data`.model.PohonBinariModel
import org.koin.core.KoinComponent

class PohonBinariVM : ViewModel(), KoinComponent {
  val pohonBinariModel: MutableLiveData<PohonBinariModel> = MutableLiveData(PohonBinariModel())

  var navArguments: Bundle? = null
}
