fun main() {
    println("Ingrese palabras que este separadas por espacios:")
    val input = readLine() ?: ""
    val words = input.split(" ").filter { it.isNotEmpty() }

    val palindromesCount = words.count { isPalindrome(it) }
    val wordsWithTwoVowelsCount = words.count { hasAtLeastTwoDistinctVowels(it) }
    val wordsStartingWithConsonantCount = words.count { startsWithConsonant(it) }

    println("Cantidad de palabras palíndromas: $palindromesCount")
    println("Cantidad de palabras que contienen al menos 2 vocales distintas: $wordsWithTwoVowelsCount")
    println("Cantidad de palabras que inician con una letra consonante: $wordsStartingWithConsonantCount")
}

/**
 * Revisa palabra por palabra si es igual al reves
 * Recibe una de las palabras ingresadas
 * Retorna si se cumple la condicion o no
 */
fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.lowercase()
    return cleanedWord == cleanedWord.reversed()
}

/**
 * Revisa palanra por palabra si la cantidad de vocales es mayor a 2
 * Recibe una de las palabras ingresadas
 * Retorna si se cumple la condicion o no
 */
fun hasAtLeastTwoDistinctVowels(word: String): Boolean {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val distinctVowels = word.lowercase().filter { it in vowels }.toSet()
    return distinctVowels.size >= 2
}

/**
 * Revisa palabra por palarba que inicie con una consonante que este dentro del rango
 * Recibe una de las palabras ingresadas
 * Retorna true si cumple la palabra la condicion si no es false y no se cuenta
 */
fun startsWithConsonant(word: String): Boolean {
    val consonants = ('a'..'z').toSet() - setOf('a', 'e', 'i', 'o', 'u')
    return word.lowercase().firstOrNull() in consonants
}
