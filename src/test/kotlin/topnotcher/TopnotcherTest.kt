package topnotcher

import org.junit.jupiter.api.Test


internal class TopnotcherTest {

    @Test
    fun testTopnotcher () {

        val topnotcher : Topnotcher = Topnotcher()

        topnotcher.a("Top of Head", "Topnotcher")
        topnotcher.a("Back", "Backbreaker")


        println(topnotcher.create())
    }
}