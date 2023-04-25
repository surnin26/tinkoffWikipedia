package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector

class Settings {
    fun openFeedSettings() {
        onView(withText("Настроить ленту")).perform(click())
    }

    fun scrollToDown() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val startX = device.displayWidth / 2
        val startY = device.displayHeight - 1
        val endY = 0
        val steps = 10
        device.swipe(startX, startY, startX, endY, steps)
    }

    fun navigateToAbout() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val menuItem = device.findObject(
            UiSelector().text("О приложении «Википедия»")
        )
        menuItem.click()
    }

    fun clickOnPolicy() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val menuItem = device.findObject(
            UiSelector().text("Политика конфиденциальности")
        )
        menuItem.click()
    }
}