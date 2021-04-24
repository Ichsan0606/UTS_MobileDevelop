package uts.i18090115.ichsan.activity.report.detail.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import uts.i18090115.ichsan.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultItemKeranjang(

	@field:SerializedName("keranjang")
	val keranjang: Keranjang? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)