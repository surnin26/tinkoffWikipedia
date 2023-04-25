package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class OnboardPage {

    fun navigateToMainPage() {
        for (i in 1..3) {
            onView(withId(R.id.fragment_onboarding_forward_button)).perform(click())
        }
        onView(withId(R.id.rejectButton)).perform(click())
    }
}