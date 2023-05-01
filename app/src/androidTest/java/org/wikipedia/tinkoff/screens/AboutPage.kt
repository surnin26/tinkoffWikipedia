package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.awaitility.Awaitility.await
import org.wikipedia.R
import java.time.Duration

class AboutPage {

    private val contributors = withId(R.id.about_contributors)
    private val translators = withId(R.id.about_translators)
    private val license = withId(R.id.about_app_license)

    fun authors() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(contributors)
                .check(matches(isDisplayed()))
        }
    }

    fun translators() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(translators)
                .check(matches(isDisplayed()))
        }
    }

    fun license() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(license)
                .check(matches((isDisplayed())))
        }
    }
}