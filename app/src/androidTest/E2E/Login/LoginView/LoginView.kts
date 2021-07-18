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
    assertViewIdIsDisplayed(emailInput)
    assertViewIdIsDisplayed(passwordInput)
    assertViewIdIsDisplayed(loginButton)
    assertViewIdIsDisplayed(signupLink)
}

fun assertEmailAndPasswordInputErrorAlerts() {
//    Initial view
    refuteViewIsDisplayed(emailInputError)
    refuteViewIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //   Error alert for empty input
    emailInput.perform(replaceText(""))
    passwordInput.perform(replaceText(""))
    refuteViewIsEnabled(loginButton)
    assertViewIsDisplayed(emailInputError)
    assertViewIsDisplayed(paswordInputError)
    //    Error alert for incorrect email format
    emailInput.perform(replaceText("apple"))
    assertViewIsDisplayed(emailInputError)
    //    Error alert for less than 4 password characters
    passwordInput.perform(replaceText("app"))
    assertViewIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //    Error alert for more than 19 characters
    passwordInput.perform(replaceText("abcdefghijklmnopqrst"))
    assertViewIsDisplayed(paswordInputError)
    refuteViewIsEnabled(loginButton)
    //    Error alert not displayed for correct email and password format
    emailInput.perform(replaceText("apple@icloud.com"))
    //    assert login button not enabled until both inputs filled in correctly
    refuteViewIsEnabled(loginButton)
    passwordInput.perform(replaceText("apple"))
    emailInput.perform(replaceText("incorrect"))
    refuteViewIsEnabled(loginButton)
    //    Both inputs now filled in correctly and login button should be enabled and error alerts not displayed
    emailInput.perform(replaceText("apple@icloud.com"))
    assertViewIsEnabled(loginButton)
    refuteViewIsDisplayed(emailInputError)
    refuteViewIsDisplayed(paswordInputError)
}
