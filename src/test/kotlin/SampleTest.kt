import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test

object SampleTest {

    @Test
    fun shouldBeEmpty() {
        // passes when run with JRE 17 but fails when run with JRE 11
        "".shouldBeEmpty()
    }

    @Test
    fun shouldNotBeEmpty() {
        // passes regardless of whether run with JRE 11 or 17
        "x".shouldNotBeEmpty()
    }

}