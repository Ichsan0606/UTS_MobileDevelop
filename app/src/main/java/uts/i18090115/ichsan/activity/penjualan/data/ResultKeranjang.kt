package uts.i18090115.ichsan.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import uts.i18090115.ichsan.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)