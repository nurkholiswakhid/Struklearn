package com.struklearn.app.modules.heap.`data`.model

import com.struklearn.app.R
import com.struklearn.app.appcomponents.di.MyApp
import kotlin.String

data class HeapModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTRUKTURDATAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_struktur_data_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeapImplement: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heap_implement)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeap: String? = MyApp.getInstance().resources.getString(R.string.lbl_heap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heap_adalah_str)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImplementasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_implementasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heap_dapat_diim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperasiPadaHe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_operasi_pada_he)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenambahanIns: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penambahan_ins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEkstraksiExtr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ekstraksi_extr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMembangunHeap: String? =
      MyApp.getInstance().resources.getString(R.string.msg_membangun_heap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeapSortMeng: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heap_sort_meng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_perubahan_nilai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenggunaan: String? = MyApp.getInstance().resources.getString(R.string.lbl_penggunaan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeapdigunakan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heap_digunakan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_priority_queue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlgoritmaDijks: String? =
      MyApp.getInstance().resources.getString(R.string.msg_algoritma_dijks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManajemenMemor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manajemen_memor)

)
