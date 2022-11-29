package `in`.dazzlingapps.androidtestingdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ValidationsTest {
    /**
     * Why write test cases?
     * - to check if the code written in the function
     * actually REACTS AS EXPECTED for all the possible scenarios
     *
     * when application grows then also the behavior of
     * existing function should not change
     *
     * so instead of checking all the test cases manually,
     * over and over again every time developer adds a new functionality,
     * that process will be automated
     */

    @Test
    fun `empty username should return false`() {
       val result =Validations.validateCredentials(
            "",
            "abc",
            "abc"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different password and confirm password should return false`(){
        val result = Validations.validateCredentials(
            "abcd",
            "abcd",
            "abcd1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 3 chars should return false`(){
        val result = Validations.validateCredentials(
            "abc",
            "ab",
            "ab"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password should return false`(){
        val result = Validations.validateCredentials(
            "abc",
            "",
            "qwer1234"
        )
        assertThat(result).isFalse()
    }
}