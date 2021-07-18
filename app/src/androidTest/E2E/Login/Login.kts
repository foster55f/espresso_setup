import org.junit.Rule
import org.junit.Test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

class LoginTestSuite  {

    @get: Rule
    val activityScenarioRule =
            ActivityScenarioRule(com.sourcey.materiallogindemo.LoginAcitivty::class.java)

    @test
    fun verifyLoginView() {
        assertLoginViewDisplay()
        assertEmailAndPasswordInputErrorAlerts()
    }
}
