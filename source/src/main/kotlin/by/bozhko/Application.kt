@file:JvmName("Application")

package by.bozhko

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*

fun main() {

    val server = Javalin.create()
        .enableCorsForOrigin()
        .start(defaultConfig().port)

    server.routes {
        path("/") {

        }
    }
}