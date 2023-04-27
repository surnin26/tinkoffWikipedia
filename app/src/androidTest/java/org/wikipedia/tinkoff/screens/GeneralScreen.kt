package org.wikipedia.tinkoff.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector

class GeneralScreen {
    fun browserOnScreen() {
        val device = UiDevice.getInstance(InstrumentationRegistry
            .getInstrumentation())
        device.findObject(UiSelector()
            .packageName("com.android.browser"))
    }

    fun pressBack() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressBack()
    }
}