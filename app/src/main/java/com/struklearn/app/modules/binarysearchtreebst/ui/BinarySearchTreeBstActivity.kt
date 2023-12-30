package com.struklearn.app.modules.binarysearchtreebst.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityBinarySearchTreeBstBinding
import com.struklearn.app.modules.binarysearchtreebst.`data`.viewmodel.BinarySearchTreeBstVM
import kotlin.String
import kotlin.Unit

class BinarySearchTreeBstActivity :
    BaseActivity<ActivityBinarySearchTreeBstBinding>(R.layout.activity_binary_search_tree_bst) {
  private val viewModel: BinarySearchTreeBstVM by viewModels<BinarySearchTreeBstVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.binarySearchTreeBstVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BINARY_SEARCH_TREE_BST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BinarySearchTreeBstActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
