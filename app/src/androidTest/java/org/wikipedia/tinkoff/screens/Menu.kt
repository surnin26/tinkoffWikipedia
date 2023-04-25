package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class Menu {
    fun openSettings() {
        onView(withId(R.id.nav_more_container)).perform(click())
        onView(withId(R.id.main_drawer_settings_container)).perform(click())
    }

    fun openEtc() {
        onView(withId(R.id.nav_more_container)).perform(click())
    }

    fun enterInWikipedia() {
        onView(withId(R.id.main_drawer_account_container)).perform(click())
    }
}