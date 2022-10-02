package topnotcher

/*!
 * Copyright (c) gemsvidø 2022
 * https://github.com/afkvido
 */

/**
 * Topnotcher.kt
 *
 * <br><br>
 *
 * @constructor `val topnotcher : Topnotcher = Topnotcher()`
 * @see topnotcher.main
 * @author gemsvidø
 * @throws Nothing
 */
class Topnotcher {

    val entries : HashMap<String, String> = HashMap();

    /** Add an entry to Topnotcher */
    fun a (point : String, sing : String): Unit {
        entries.put(point, sing)
    }

    fun create () : String {

        val builder : StringBuilder = StringBuilder()
        val progress : ArrayList<String> = ArrayList()

        entries.forEach { entry ->
            progress.add(entry.value)

            builder.append("I points to myself, vas is das here;\n")
            builder.append("Das is mine ${entry.value} (${entry.key}), ya mama dear;\n")
            builder.append("${progress.joinToString(", ")}, ya mama dear;\n")
            builder.append("Dat's wot i learned in her school, boom-boom!\n")
            builder.append("\n\n")
        }

        return builder.toString()
    }

}