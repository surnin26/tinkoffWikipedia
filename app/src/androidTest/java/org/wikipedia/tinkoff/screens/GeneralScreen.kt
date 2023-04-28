package org.wikipedia.tinkoff.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import org.awaitility.Awaitility

class GeneralScreen {
    fun browserOnScreen() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
            device.findObject(UiSelector().packageName("com.android.browser"))
        }
    }

    fun pressBack() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
            device.pressBack()
        }
    }
}