//ID Elements
val emailInput = onView(withId(R.id.input_email))
val passwordInput = onView(withId(R.id.input_password))
val loginButton = onView(withId(R.id.btn_login))
val signupLink = onView(withId(R.id.link_signup))

//Text Elements
val emailInputError = "enter a valid email address"
val paswordInputError = "between 4 and 10 alphanumeric characters"

//Functions

fun assertLoginViewDisplay(){
    assertViewIsDisplayed(emailInput)
    assertViewIsDisplayed(passwordInput)
    assertViewIsDisplayed(loginButton)
    assertViewIsDisplayed(signupLink)
}

fun assertEmailAndPasswordInputErrorAlerts() {
//    Initial view
    refuteTextIsDisplayed(emailInputError)
    refuteTextIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //   Error alert for empty input
    emailInput.perform(replaceText(""))
    passwordInput.perform(replaceText(""))
    refuteViewIsEnabled(loginButton)
    assertTextIsDisplayed(emailInputError)
    assertTextIsDisplayed(paswordInputError)
    //    Error alert for incorrect email format
    emailInput.perform(replaceText("apple"))
    assertTextIsDisplayed(emailInputError)
    //    Error alert for less than 4 password characters
    passwordInput.perform(replaceText("app"))
    assertTextIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //    Error alert for more than 19 characters
    passwordInput.perform(replaceText("abcdefghijklmnopqrst"))
    assertTextIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //    Error alert not displayed for correct email and password format
    emailInput.perform(replaceText("apple@icloud.com"))
    //    assert login button not enabled until both inputs filled in correctly
    refuteViewIsEnabled(loginButton)
    passwordInput.perform(replaceText("apple"))
    emailInput.perform(replaceText("incorrect"))
    assertTextIsDisplayed(emailInputError)
    refuteViewIsEnabled(loginButton)
    //    Both inputs now filled in correctly and login button should be enabled and error alerts not displayed
    emailInput.perform(replaceText("apple@icloud.com"))
    assertViewIsEnabled(loginButton)
    refuteTextIsDisplayed(emailInputError)
    refuteTextIsDisplayed(paswordInputError)
}
