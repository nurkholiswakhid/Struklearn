package com.struklearn.app.modules.traversaltree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityTraversalTreeBinding
import com.struklearn.app.modules.traversaltree.`data`.viewmodel.TraversalTreeVM
import kotlin.String
import kotlin.Unit

class TraversalTreeActivity :
    BaseActivity<ActivityTraversalTreeBinding>(R.layout.activity_traversal_tree) {
  private val viewModel: TraversalTreeVM by viewModels<TraversalTreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.traversalTreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRAVERSAL_TREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TraversalTreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
