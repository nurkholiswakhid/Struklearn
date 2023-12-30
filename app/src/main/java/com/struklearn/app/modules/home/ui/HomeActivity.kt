package com.struklearn.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityHomeBinding
import com.struklearn.app.modules.binarysearchtreebst.ui.BinarySearchTreeBstActivity
import com.struklearn.app.modules.datatree.ui.DataTreeActivity
import com.struklearn.app.modules.fenwicktree.ui.FenwickTreeActivity
import com.struklearn.app.modules.heap.ui.HeapActivity
import com.struklearn.app.modules.home.`data`.viewmodel.HomeVM
import com.struklearn.app.modules.narytree.ui.NAryTreeActivity
import com.struklearn.app.modules.operasipadatree.ui.OperasiPadaTreeActivity
import com.struklearn.app.modules.pohonbinari.ui.PohonBinariActivity
import com.struklearn.app.modules.traversaltree.ui.TraversalTreeActivity
import com.struklearn.app.modules.treebalance.ui.TreeBalanceActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  private val REQUEST_CODE_N_ARY_TREE_ACTIVITY: Int = 795

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumntreetraversal.setOnClickListener {
      val destIntent = NAryTreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_N_ARY_TREE_ACTIVITY)
    }
    binding.btnFenwickTree.setOnClickListener {
      val destIntent = FenwickTreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHeap.setOnClickListener {
      val destIntent = HeapActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnoperasipadatr.setOnClickListener {
      val destIntent = OperasiPadaTreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTreeBalance.setOnClickListener {
      val destIntent = TreeBalanceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnbinarysearcht.setOnClickListener {
      val destIntent = BinarySearchTreeBstActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTraversalTree.setOnClickListener {
      val destIntent = TraversalTreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnpengenalandata.setOnClickListener {
      val destIntent = DataTreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackpohonbinari.setOnClickListener {
      val destIntent = PohonBinariActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
