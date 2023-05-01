package org.wikipedia.tinkoff.screens

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.awaitility.Awaitility.await
import org.wikipedia.R
import java.time.Duration

class Settings {

    private val customize = withText(R.string.preference_summary_customize_explore_feed)
    private val about = withText(R.string.about_description)
    private val policy = withText(R.string.privacy_policy_description)

    fun openFeedSettings() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(customize)
                .perform(click())
        }
    }

    fun clickToAbout() {
        await().atMost(Duration.ofSeconds(15)).untilAsserted {
            onView(about)
                .perform(click())
        }
    }

    fun clickOnPolicyAndCheckBrowser() {
        await().atMost(Duration.ofSeconds(10)).untilAsserted {
            Intents.init()
            onView(policy)
                .perform(click())
            Intents.intended(IntentMatchers.hasAction(Intent.ACTION_VIEW))
        }
    }

    fun scroll() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(isRoot())
                .perform(swipeUp())
        }
    }
}