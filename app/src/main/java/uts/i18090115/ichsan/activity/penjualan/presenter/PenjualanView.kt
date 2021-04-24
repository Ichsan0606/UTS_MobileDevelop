package uts.i18090115.ichsan.activity.penjualan.presenter

import uts.i18090115.ichsan.model.Barang
import uts.i18090115.ichsan.model.Keranjang

interface PenjualanView {
    fun onSuccessGetKeranjang(keranjang: List<Keranjang?>?)
    fun onFailedGetKeranjang(msg: String?)

    fun onSuccessSearchItem(barangs: List<Barang?>?)
    fun onFailedSearchItem(msg : String?)

    fun onSuccessAddItemToKeranjang(msg: String?)
    fun onFailedAddItemToKeranjang(msg: String?)

    fun onSuccessDeleteItemKeranjang(msg: String?)
    fun onFailedDeleteItemKeranjang(msg: String?)

    fun onSuccessJualBarang(msg: String?)
    fun onFailedJualBarang(msg: String?)

    fun onSuccessAddKeranjang(msg: String?)
    fun onFailedAddKeranjang(msg: String?)
}