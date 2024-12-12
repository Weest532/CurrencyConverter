import okhttp3.OkHttpClient
import okhttp3.Request
import com.google.gson.Gson

data class ExchangeRatesResponse(
    val rates: Map<String, Double>,
    val base: String
)

object CurrencyService {
    private const val API_URL = "https://api.exchangerate-api.com/v4/latest/"
    private val client = OkHttpClient()

    fun fetchExchangeRates(baseCurrency: String): ExchangeRatesResponse? {
        val request = Request.Builder()
            .url("$API_URL$baseCurrency")
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) {
                println("Failed to fetch rates: ${response.code}")
                return null
            }

            val responseBody = response.body?.string()
            return Gson().fromJson(responseBody, ExchangeRatesResponse::class.java)
        }
    }
}


