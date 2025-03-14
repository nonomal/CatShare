package moe.reimu.catshare.utils

import java.util.Random

object DeviceUtils {
    private val alphabet =
        "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray()

    fun deviceNameById(id: Byte): String? {
        return when (id) {
            in 10..19 -> {
                if (id.toInt() == 11) {
                    "realme"
                } else {
                    "OPPO"
                }
            }

            in 20..29 -> {
                "vivo"
            }

            in 30..39 -> {
                "Xiaomi"
            }

            in 41..45 -> {
                "OnePlus"
            }

            in 50..59 -> {
                "Meizu"
            }

            in 70..75 -> {
                "Samsung"
            }

            in 100..109 -> {
                "Lenovo"
            }

            else -> null
        }
    }

    fun getRandomChars(len: Int): String {
        val sb = StringBuilder()
        val rand = Random()
        repeat(len) {
            sb.append(alphabet[rand.nextInt(alphabet.size)])
        }
        return sb.toString()
    }
}