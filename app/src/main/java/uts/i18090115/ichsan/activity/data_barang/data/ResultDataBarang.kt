package uts.i18090115.ichsan.activity.data_barang.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import uts.i18090115.ichsan.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultDataBarang(

    @field:SerializedName("barang")
	val barang: List<Barang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)