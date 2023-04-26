package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class OnboardPage {
    private val fragment = withId(R.id.fragment_onboarding_forward_button)
    private val reject = withId(R.id.rejectButton)

    fun navigateToMainPage() {
        for (i in 1..3) {
            onView(fragment).perform(click())
        }
        onView(reject).perform(click())
    }
}