class CurrencyConverter(private val exchangeRates: Map<String, Double>) {

    fun convert(amount: Double, fromCurrency: String, toCurrency: String): Double {
        val fromRate = exchangeRates[fromCurrency] ?: throw IllegalArgumentException("Invalid currency: $fromCurrency")
        val toRate = exchangeRates[toCurrency] ?: throw IllegalArgumentException("Invalid currency: $toCurrency")
        return (amount / fromRate) * toRate
    }
}