package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.awaitility.Awaitility
import org.wikipedia.R

class AboutPage {

    private val contributors = withId(R.id.about_contributors)
    private val translators = withId(R.id.about_translators)
    private val license = withId(R.id.about_app_license)

    fun authors() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(contributors)
                .check(matches(isDisplayed()))
        }
    }

    fun translators() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(translators)
                .check(matches(isDisplayed()))
        }
    }

    fun license() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(license)
                .check(matches((isDisplayed())))
        }
    }
}