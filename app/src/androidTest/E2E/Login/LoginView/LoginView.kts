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