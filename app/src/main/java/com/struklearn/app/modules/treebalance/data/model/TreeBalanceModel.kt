package com.struklearn.app.modules.treebalance.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class TreeBalanceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTreeBalanceA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tree_balance_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAVLTree: String? = MyApp.getInstance().resources.getString(R.string.lbl_avl_tree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avl_tree_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_red_black_tree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRedBlackTree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_red_black_tree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerbandingan: String? = MyApp.getInstance().resources.getString(R.string.lbl_perbandingan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_perbedaan_utama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dalam_pemilihan)

)
