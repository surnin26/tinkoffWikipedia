package org.wikipedia.tinkoff.screens

import android.content.Intent
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.awaitility.Awaitility

class GeneralScreen {

    private val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun pressBack() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            device
                .pressBack()
        }
    }
}