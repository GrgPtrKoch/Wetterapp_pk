data class Weather(
    private val location: Location,
    private val temperature: Double,
    private val humidity: Int,
    private val weatherCode: WeatherCodes,
    private val precipitation: Int,
    private val windSpeed: Int,
    private val windDirection: Int,
    private val apparentTemperature: Double,
    private val hourlyList: List<HourlyWeather>,
    private val dailyList: List<DailyWeather>) {

    fun getTemperature(): Double = temperature
    fun getHumidity(): Int = humidity
    fun getWeatherCode(): WeatherCodes = weatherCode
    fun getPrecipitation(): Int = precipitation
    fun getWindSpeed(): Int = windSpeed
    fun getWindDirection(): Int = windDirection
    fun getApparentTemperature(): Double = apparentTemperature
    fun getHourlyList(): List<HourlyWeather> = hourlyList
    fun getDailyList(): List<DailyWeather> = dailyList

    fun getCurrentWeatherDataAll() : List<Any> = listOf(temperature, apparentTemperature, humidity, precipitation, windSpeed, windDirection)

    val weatherTemperature: Double
        get() = temperature

    val locationName: String
        get() = location.name

    val latitude: Double
        get() = location.latitude

    val longitude: Double
        get() = location.longitude

    val locationID: Int
        get() = location.id

    val weatherList : List<Any>
        get() = getCurrentWeatherDataAll()


    //println("$temperature\n$apparentTemperature\n$humidity\n$precipitation\n$windSpeed\n$windDirection\n$weatherCode")
    fun getHourlyWeatherDataAll() = hourlyList
    fun getDailyWeatherDataAll() = dailyList
}