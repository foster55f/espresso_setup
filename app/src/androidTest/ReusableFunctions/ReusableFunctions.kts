
fun assertViewIdIsDisplayed(view: ViewInteraction){
    view.check(matches(isDisplayed()));
}

fun assertViewTextIsDisplayed(text: String){
    onView(withText(text)).check(matches(isDisplayed()));
}

fun refuteViewIsEnabled(view: ViewInteraction) = view.check(matches(not(isEnabled())))

fun assertViewIsEnabled(view: ViewInteraction) = view.check(matches(isEnabled()))

fun refuteViewIsDisplayed(view: ViewInteraction) = view.check(doesNotExist())