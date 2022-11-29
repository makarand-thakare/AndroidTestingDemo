package `in`.dazzlingapps.androidtestingdemo

object Validations {

    /*
    username should not be empty
    pass and conf pass should match
    pass should have at least 3 chars
    * */
    fun validateCredentials(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return !(userName.isEmpty() ||
                password.isEmpty() ||
                confirmPassword.isEmpty() ||
                password.length < 3 ||
                password != confirmPassword)
    }
}