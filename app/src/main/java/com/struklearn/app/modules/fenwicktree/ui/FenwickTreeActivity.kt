package com.struklearn.app.modules.fenwicktree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityFenwickTreeBinding
import com.struklearn.app.modules.fenwicktree.`data`.viewmodel.FenwickTreeVM
import kotlin.String
import kotlin.Unit

class FenwickTreeActivity : BaseActivity<ActivityFenwickTreeBinding>(R.layout.activity_fenwick_tree)
    {
  private val viewModel: FenwickTreeVM by viewModels<FenwickTreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fenwickTreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FENWICK_TREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FenwickTreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
