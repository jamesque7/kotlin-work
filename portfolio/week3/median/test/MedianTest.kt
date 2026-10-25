// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "median() works for 1 element" {
        median(listOf(1f)) shouldBe (1.0f plusOrMinus tolerance)
    }

    "median() works for 2 elements" {
        median(listOf(1.0f, 2.0f)) shouldBe (1.5f plusOrMinus tolerance)
    }

    "median() works for 3 elements" {
        median(listOf(1.0f, 2.0f, 3.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "median() works for 4 elements" {
        median(listOf(1.0f, 2.0f, 3.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }
})
