package com.struklearn.app.modules.starting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityStartingBinding
import com.struklearn.app.modules.home.ui.HomeActivity
import com.struklearn.app.modules.starting.`data`.viewmodel.StartingVM
import kotlin.String
import kotlin.Unit

class StartingActivity : BaseActivity<ActivityStartingBinding>(R.layout.activity_starting) {
  private val viewModel: StartingVM by viewModels<StartingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "STARTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StartingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
