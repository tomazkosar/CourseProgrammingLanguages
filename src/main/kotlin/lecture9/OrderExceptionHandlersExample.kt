package lecture9

import java.io.*

fun main() {
    try {
        val lineReader = LineNumberReader(FileReader("no_file.txt"))
        val line = lineReader.readLine()
        lineReader.close()
        println(line)
    } catch (ex: IOException) {
        println("Error reading file")
    } catch (ex: FileNotFoundException) {
        println("File not found")
    }

}

