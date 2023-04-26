package org.wikipedia.tinkoff.b

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.AboutPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings

class Blocks {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun assertBlocksWithAuthorsTranslatorsLicenses() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().scrollToDown()
        Settings().navigateToAbout()
        AboutPage().authors()
        AboutPage().translators()
        AboutPage().license()
    }
}