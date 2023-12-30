package com.struklearn.app.modules.narytree.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class NAryTreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTreeTraversal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tree_traversal2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_traversal_pada2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreorderTraver: String? =
      MyApp.getInstance().resources.getString(R.string.msg_preorder_traver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefinisiPreor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_definisi_preor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahlangkah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_langkah_langkah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKunjunginodes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kunjungi_node_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanjutkantrave: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lanjutkan_trave)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostorderTrave: String? =
      MyApp.getInstance().resources.getString(R.string.msg_postorder_trave)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefinisiPosto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_definisi_posto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahlangkahOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_langkah_langkah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLakukantravers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lakukan_travers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKunjunginodesOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kunjungi_node_s2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLevelorderTra: String? =
      MyApp.getInstance().resources.getString(R.string.msg_level_order_tra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefinisiLevel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_definisi_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahlangkahTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_langkah_langkah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGunakanantrian: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gunakan_antrian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMulaidariroot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mulai_dari_root)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamaantrian: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selama_antrian)

)
