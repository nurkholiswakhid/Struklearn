package com.struklearn.app.modules.pohonbinari.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class PohonBinariModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPohonBinariK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pohon_binari_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKonsepPohonBi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_konsep_pohon_bi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pohon_binari_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pohon_binari_da)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImplementasiPo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_implementasi_po)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pohon_binari_da2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStrukturDataP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperasiDasarp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_dasar_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeberapaoperas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beberapa_operas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenambahanNode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penambahan_node)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_traversal_pohon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPencarianNode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencarian_node)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenghapusanNod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penghapusan_nod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContohImplemen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contoh_implemen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dengan_represen)

)
