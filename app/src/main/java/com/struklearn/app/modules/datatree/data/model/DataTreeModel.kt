package com.struklearn.app.modules.datatree.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class DataTreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengenalanstru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pengenalan_stru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefinisidanKo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_definisi_dan_ko)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_node_represent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_edge_koneksi_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_root_node_pali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeafNodeyang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_leaf_node_yang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTujuanPengguna: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tujuan_pengguna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencarian_efisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPemrosesanHier: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pemrosesan_hier)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlgoritmadanA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_algoritma_dan_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContohVisualis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contoh_visualis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUntukmemahami: String? =
      MyApp.getInstance().resources.getString(R.string.msg_untuk_memahami)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dalam_contoh_di)

)
