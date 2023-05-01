package org.wikipedia.tinkoff.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.awaitility.Awaitility.await
import java.time.Duration

class GeneralScreen {

    private val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun pressBack() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            device
                .pressBack()
        }
    }
}