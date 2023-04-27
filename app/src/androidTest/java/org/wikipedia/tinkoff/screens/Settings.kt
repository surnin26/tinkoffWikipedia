package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.wikipedia.R

class Settings {

    fun openFeedSettings() {
        onView(withText(R.string.preference_summary_customize_explore_feed))
            .perform(click())
    }

    fun scrollToDown(x: Int) {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val startX = device.displayWidth / 2
        val startY = device.displayHeight - 1
        val endY = 0
        val steps = x
        device.swipe(startX, startY, startX, endY, steps)
    }

    fun scrollToUp(x: Int) {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val startX = device.displayWidth / 2
        val startY = 0
        val endY = device.displayHeight - 1
        val steps = x
        device.swipe(startX, startY, startX, endY, steps)
    }


    fun clickToAbout() {
        onView(withText(R.string.about_description))
            .perform(click())
    }

    fun clickOnPolicy() {
        onView(withText(R.string.privacy_policy_description))
            .perform(click())
    }
}