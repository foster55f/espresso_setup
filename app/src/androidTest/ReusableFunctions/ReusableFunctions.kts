
fun assertViewIdIsDisplayed(view: ViewInteraction){
    view.check(matches(isDisplayed()));
}

fun assertViewTextIsDisplayed(text: String){
    onView(withText(text)).check(matches(isDisplayed()));
}