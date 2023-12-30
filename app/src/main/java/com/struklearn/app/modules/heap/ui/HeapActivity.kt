package com.struklearn.app.modules.heap.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityHeapBinding
import com.struklearn.app.modules.heap.`data`.viewmodel.HeapVM
import kotlin.String
import kotlin.Unit

class HeapActivity : BaseActivity<ActivityHeapBinding>(R.layout.activity_heap) {
  private val viewModel: HeapVM by viewModels<HeapVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.heapVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HEAP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HeapActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
