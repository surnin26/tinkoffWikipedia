package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class AboutPage {

    fun authors() {
        onView(withId(R.id.about_contributors)).check(matches(isDisplayed()))
    }

    fun translators() {
        onView(withId(R.id.about_translators)).check(matches(isDisplayed()))
    }

    fun license() {
        onView(withId(R.id.about_app_license)).check(matches((isDisplayed())))
    }
}