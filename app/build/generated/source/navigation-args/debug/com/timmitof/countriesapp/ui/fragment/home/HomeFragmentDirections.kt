package com.timmitof.countriesapp.ui.fragment.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.timmitof.countriesapp.R
import com.timmitof.countriesapp.models.Country
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class NextDetails(
    public val country: Country
  ) : NavDirections {
    public override val actionId: Int = R.id.nextDetails

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Country::class.java)) {
          result.putParcelable("country", this.country as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Country::class.java)) {
          result.putSerializable("country", this.country as Serializable)
        } else {
          throw UnsupportedOperationException(Country::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun nextDetails(country: Country): NavDirections = NextDetails(country)
  }
}
