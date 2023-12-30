package com.struklearn.app.modules.frame.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.struklearn.app.R
import com.struklearn.app.appcomponents.base.BaseActivity
import com.struklearn.app.databinding.ActivityFrameBinding
import com.struklearn.app.modules.frame.`data`.viewmodel.FrameVM
import com.struklearn.app.modules.starting.ui.StartingActivity
import kotlin.String
import kotlin.Unit

class FrameActivity : BaseActivity<ActivityFrameBinding>(R.layout.activity_frame) {
  private val viewModel: FrameVM by viewModels<FrameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = StartingActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FRAME_ACTIVITY"

    }
  }
