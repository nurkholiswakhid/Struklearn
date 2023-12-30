package com.struklearn.app.modules.pohonbinari.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityPohonBinariBinding
import com.struklearn.app.modules.pohonbinari.`data`.viewmodel.PohonBinariVM
import kotlin.String
import kotlin.Unit

class PohonBinariActivity : BaseActivity<ActivityPohonBinariBinding>(R.layout.activity_pohon_binari)
    {
  private val viewModel: PohonBinariVM by viewModels<PohonBinariVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pohonBinariVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POHON_BINARI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PohonBinariActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
