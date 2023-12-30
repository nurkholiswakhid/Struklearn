package com.struklearn.app.modules.treebalance.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityTreeBalanceBinding
import com.struklearn.app.modules.treebalance.`data`.viewmodel.TreeBalanceVM
import kotlin.String
import kotlin.Unit

class TreeBalanceActivity : BaseActivity<ActivityTreeBalanceBinding>(R.layout.activity_tree_balance)
    {
  private val viewModel: TreeBalanceVM by viewModels<TreeBalanceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.treeBalanceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TREE_BALANCE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TreeBalanceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
