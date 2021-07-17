class LoginTestSuite  {

    @get: Rule
    val activityScenarioRule =
            ActivityScenarioRule(com.sourcey.materiallogindemo.MainActivity::class.java)

    fun verifyLoginView() {
        assertLoginViewDisplay()
    }

}
