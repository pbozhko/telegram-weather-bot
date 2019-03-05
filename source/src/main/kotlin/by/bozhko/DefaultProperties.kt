@file:JvmName("DefaultProperties")

package by.bozhko

fun defaultConfig(): Properties =
    Properties(
        weatherApi = environmentVariable("weather_api"),
        port = environmentVariable("port").toInt()
    )

fun environmentVariable(key: String, default: String? = null): String =
    System.getenv(key)?.trim()
        ?: System.getProperty(key)?.trim()
        ?: default
        ?: throw Exception()

data class Properties(
    val port: Int,
    val weatherApi: String
)