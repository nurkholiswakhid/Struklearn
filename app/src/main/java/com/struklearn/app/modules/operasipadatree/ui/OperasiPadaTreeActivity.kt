package com.struklearn.app.modules.operasipadatree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityOperasiPadaTreeBinding
import com.struklearn.app.modules.operasipadatree.`data`.viewmodel.OperasiPadaTreeVM
import kotlin.String
import kotlin.Unit

class OperasiPadaTreeActivity :
    BaseActivity<ActivityOperasiPadaTreeBinding>(R.layout.activity_operasi_pada_tree) {
  private val viewModel: OperasiPadaTreeVM by viewModels<OperasiPadaTreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.operasiPadaTreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OPERASI_PADA_TREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OperasiPadaTreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
