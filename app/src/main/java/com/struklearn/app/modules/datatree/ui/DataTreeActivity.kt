package com.struklearn.app.modules.datatree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityDataTreeBinding
import com.struklearn.app.modules.datatree.`data`.viewmodel.DataTreeVM
import kotlin.String
import kotlin.Unit

class DataTreeActivity : BaseActivity<ActivityDataTreeBinding>(R.layout.activity_data_tree) {
  private val viewModel: DataTreeVM by viewModels<DataTreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dataTreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DATA_TREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataTreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
