package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.wikipedia.R

class Menu {
    private val nav = withId(R.id.nav_more_container)
    private val mainSettings = withId(R.id.main_drawer_settings_container)
    private val mainAccount = withId(R.id.main_drawer_account_container)

    fun openSettings() {
        onView(nav).perform(click())
        onView(mainSettings).perform(click())
    }

    fun openEtc() {
        onView(nav).perform(click())
    }

    fun enterInWikipedia() {
        onView(mainAccount).perform(click())
    }
}