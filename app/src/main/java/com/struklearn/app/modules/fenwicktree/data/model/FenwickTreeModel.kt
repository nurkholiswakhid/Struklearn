package com.struklearn.app.modules.fenwicktree.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class FenwickTreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFenwickTreeB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fenwick_tree_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_fenwick_tree_j)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_representasi_da)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImplementasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_implementasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_membangun_fenwi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperasiPadaFe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_pada_fe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penjumlahan_kum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pembaruan_nilai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContohPengguna: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contoh_pengguna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMembangunFenwi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_membangun_fenwi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMisalkankitam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_misalkan_kita_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFenwickTree: String? = MyApp.getInstance().resources.getString(R.string.msg_fenwick_tree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerikutadalah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_berikut_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenjumlahanKum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penjumlahan_kum2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_penjuml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperasiPembaru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_pembaru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJikakitamempe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jika_kita_mempe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fenwicktree_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null
)
