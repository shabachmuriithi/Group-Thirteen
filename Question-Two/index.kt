data class CityWeather(
    val name: String,
    val temperature: Double,
    val humidity: Double,
    val windSpeed: Double
)

class WeatherForecastApp {
    val cities = mutableListOf<CityWeather>()

    fun addCity(city: CityWeather) {
        cities.add(city)
    }

    fun getCities(): List<CityWeather> = cities
}