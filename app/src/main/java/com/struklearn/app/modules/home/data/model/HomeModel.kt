package com.struklearn.app.modules.home.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPelajariLangka: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pelajari_langka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengenalanData: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pengenalan_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPohonBinari: String? = MyApp.getInstance().resources.getString(R.string.lbl_pohon_binari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPohonBinariOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pohon_binari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBinarySearchT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_binary_search_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperasipadaTr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_pada_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTreeTraversal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tree_traversal)

)
