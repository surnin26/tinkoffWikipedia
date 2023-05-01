package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.awaitility.Awaitility.await
import org.wikipedia.R
import java.time.Duration

class Menu {

    private val nav = withId(R.id.nav_more_container)
    private val mainSettings = withId(R.id.main_drawer_settings_container)
    private val mainAccount = withId(R.id.main_drawer_account_container)

    fun openSettings() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(nav)
                .perform(click())
            onView(mainSettings)
                .perform(click())
        }
    }

    fun openEtc() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(nav)
                .perform(click())
        }
    }

    fun enterInWikipedia() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(mainAccount)
                .perform(click())
        }
    }
}