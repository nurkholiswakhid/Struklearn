package com.struklearn.app.modules.narytree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityNAryTreeBinding
import com.struklearn.app.modules.narytree.`data`.viewmodel.NAryTreeVM
import kotlin.String
import kotlin.Unit

class NAryTreeActivity : BaseActivity<ActivityNAryTreeBinding>(R.layout.activity_n_ary_tree) {
  private val viewModel: NAryTreeVM by viewModels<NAryTreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nAryTreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "N_ARY_TREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NAryTreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
