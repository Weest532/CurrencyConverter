fun main() {
    println("Fetching exchange rates...")
    val baseCurrency = "USD"
    val ratesResponse = CurrencyService.fetchExchangeRates(baseCurrency)

    if (ratesResponse == null) {
        println("Failed to fetch exchange rates. Exiting.")
        return
    }

    val converter = CurrencyConverter(ratesResponse.rates)

    println("Exchange rates fetched successfully. Base currency: $baseCurrency")
    println("Available currencies: ${ratesResponse.rates.keys.joinToString(", ")}")

    while (true) {
        println("\n--- Currency Converter ---")
        print("Enter amount: ")
        val amount = readLine()?.toDoubleOrNull()
        if (amount == null || amount <= 0) {
            println("Invalid amount. Please try again.")
            continue
        }

        print("Convert from (currency code): ")
        val fromCurrency = readLine()?.uppercase()
        print("Convert to (currency code): ")
        val toCurrency = readLine()?.uppercase()

        if (fromCurrency !in ratesResponse.rates || toCurrency !in ratesResponse.rates) {
            println("Invalid currency code. Please try again.")
            continue
        }

        val result = converter.convert(amount, fromCurrency!!, toCurrency!!)
        println("$amount $fromCurrency = $result $toCurrency")
    }
}