fun assertViewIsDisplayed(view: ViewInteraction) {
    view.check(matches(isDisplayed()));
}

fun assertTextIsDisplayed(text: String) {
    onView(withText(text)).check(matches(isDisplayed()));
}

fun assertViewIsEnabled(view: ViewInteraction) = view.check(matches(isEnabled()))

fun refuteViewIsEnabled(view: ViewInteraction) = view.check(matches(not(isEnabled())))

fun refuteViewIsDisplayed(view: ViewInteraction) = view.check(doesNotExist())

fun refuteTextIsDisplayed(text: String) = view.check(doesNotExist())