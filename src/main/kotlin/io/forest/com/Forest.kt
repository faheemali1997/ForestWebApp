package io.forest.com

class Forest {
    private val setOfAllCombinationsOfOptions = mutableSetOf<String>()
    private val optionsSet = charArrayOf('A', 'B', 'C', 'D')
    private val mapOfQuestionAndAnswers : MutableMap<String,MutableList<MutableMap<String,String>>> = mutableMapOf()
    private val forestData: MutableMap<String, MutableSet<String>> = mutableMapOf(
        "Apple" to mutableSetOf("BACCDDDA"),
        "Bamboo" to mutableSetOf("ACACACAC", "DDBDAAAB"),
        "Bear's Paw" to mutableSetOf("ADCBBBCC", "ACDBACDB"),
        "Cactus" to mutableSetOf("ACACACDD"),
        "Carnation" to mutableSetOf("ACBBBBCA", "AADBCAAA", "AABBCCCC"),
        "Cat-tail Willow" to mutableSetOf("ABCDABCD", "ADADADAD", "DDDDDDDD", "DBDBDBDB", "ABDADDBA", "DCDABACC"),
        "Cherry Blossom" to mutableSetOf("DCBADCBA"),
        "Chinese Pine" to mutableSetOf("BCBCBCBC", "BABABABA", "BAADACDC"),
        "Coconut" to mutableSetOf("CCCCCCCC", "DCCCDCBA", "DCACCBBD"),
        "Ginkgo" to mutableSetOf("CDCDCDBB"),
        "Lemon" to mutableSetOf("BDBDBDBD"),
        "Maple" to mutableSetOf("DBBBBBBA", "BCADBCAD", "CCDDBAAD", "ADBCBCBA", "DBDBBCAA", "BBBDBCCD"),
        "Oak" to mutableSetOf("AAAAAAAA", "CACBDADB", "BDCDBADB"),
        "Rose" to mutableSetOf("BBBBBBBB", "ABABABAB", "AAADBBBC", "ACBCBBAC", "BCBDCBDC", "BBCAACCC"),
        "Sunflower" to mutableSetOf("CBCBCBCB", "CDCDCDCD", "CACACACA", "DADADADA", "ABADDDCA"),
        "Wisteria" to mutableSetOf("ABDCABDC", "ABABABCC", "CDDABBAC")
    )
    private val forestQuestionOptions: MutableMap<String, List<String>> = mutableMapOf(
        "Which seed would you sow?" to listOf(
            "Veined hard seed",
            "Furry light seed",
            "Large plump seed",
            "Shiny golden seed"
        ),
        "Which type of music would you play?" to listOf(
            "Smooth and relaxing jazz",
            "Ambient sound of ocean waves",
            "Soft classical piano",
            "Relaxing chill house"
        ),
        "Which book would you like to read" to listOf(
            "Life Hacks",
            "Criminal Mastermind: Chicago Hitman",
            "The Wandering Midnight Sole",
            "50 Mind Blowing Philosophical Questions: The Enslaved"
        ),
        "A new book, where to start?" to listOf(
            "Check out the contents",
            "Read a prologue",
            "Jump to the io.test.com.main text",
            "Turn on the last page for abstract"
        ),
        "Tired after studying for some time, you decide to" to listOf(
            "Drink coffee for an energy boost",
            "Take a nap",
            "Do a full-body stretch",
            "Grab some snacks"
        ),
        "An idea strikes you out of the blue, how would you write it down?" to listOf(
            "Write the details in a notebook",
            "Jot it down on a Post-it note",
            "Make a mental note",
            "Write on the book you're reading"
        ),
        "TGIF! Where are we going tomorrow?" to listOf(
            "Art museum with comprehensive exhibition",
            "Hiking trail with grassy picnic spots",
            "Cultural and creative market full of eye-catching designs",
            "Historical site dating back to 9,000BC"
        ),
        "Time flies so fast, it's supper time" to listOf(
            "Cook your own meal",
            "Order food delivery online",
            "Eat later cause you're too lazy",
            "Eat out at a restaurant"
        )
    )

    fun findAnomalyInData(forestData: MutableMap<String, MutableSet<String>>) {
        val something = forestData.values.map {
            it.filter { seq ->
                seq.length != 8
            }
        }
        println(something)
    }

    /** The method that prints all
    possible strings of length k.
    It is mainly a wrapper over
    recursive function printAllKLengthRec()*/
    fun generateAllPermutationsOfOptionSet(k: Int) {
        val n = optionsSet.size
        generateAllPermutationsOfOptionSetRec(optionsSet, "", n, k)
    }

    /**  The io.test.com.main recursive method
    to print all possible
    strings of length k */
    private fun generateAllPermutationsOfOptionSetRec(
        set: CharArray,
        prefix: String,
        n: Int, k: Int
    ) {

        // Base case: k is 0,
        if (k == 0) {
            setOfAllCombinationsOfOptions.add(prefix)
            return
        }

        // One by one add all characters from set and recursively
        // call for k equals to k-1
        for (i in 0 until n) {

            // Next character of input added
            val newPrefix = prefix + set[i]

            // k is decreased, because
            // we have added a new character
            generateAllPermutationsOfOptionSetRec(
                set, newPrefix,
                n, k - 1
            )
        }
    }

    fun generateMapOfQuestionAndAnswers() : MutableMap<String,MutableList<MutableMap<String,String>>> {
        forestData.map {
            val listOfQuestionAndAnswers : MutableList<MutableMap<String,String>> = mutableListOf()
            it.value.forEach { seq->
                val mapOfQuestionAndAnswer : MutableMap<String,String> = mutableMapOf()
                var count = 0
                seq.forEach { option->
                    mapOfQuestionAndAnswer[forestQuestionOptions.keys.elementAt(count)] = forestQuestionOptions.values.elementAt(count)[optionsSet.indexOf(option)]
                    count += 1
                }
                listOfQuestionAndAnswers.add(mapOfQuestionAndAnswer)
            }
            mapOfQuestionAndAnswers[it.key] = listOfQuestionAndAnswers
        }
        return mapOfQuestionAndAnswers
    }
}