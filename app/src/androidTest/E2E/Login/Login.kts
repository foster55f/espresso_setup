import org.junit.Rule
import org.junit.Test
import org.junit.BeforeClass
import androidx.test.espresso.accessibility.AccessibilityChecks

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

class LoginTestSuite {

    @get: Rule
    val activityScenarioRule =
        ActivityScenarioRule(com.sourcey.materiallogindemo.LoginAcitivty::class.java)

    @test
    fun verifyLoginView() {
        assertLoginViewDisplay()
        assertEmailAndPasswordInputErrorAlerts()
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
            AccessibilityChecks.enable()
                .setRunChecksFromRootView(true)
        }
    }
}
