package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class AboutPage {

    private val contributors = withId(R.id.about_contributors)
    private val translators = withId(R.id.about_translators)
    private val license = withId(R.id.about_app_license)

    fun authors() {
        onView(contributors).check(matches(isDisplayed()))
    }

    fun translators() {
        onView(translators).check(matches(isDisplayed()))
    }

    fun license() {
        onView(license).check(matches((isDisplayed())))
    }
}