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

    private val onboardPage = OnboardPage()
    private val menu = Menu()
    private val settings = Settings()
    private val aboutPage = AboutPage()

    @Test
    fun assertBlocksWithAuthorsTranslatorsLicenses() {
        onboardPage.navigateToMainPage()
        menu.openSettings()
        settings.scrollToDown()
        try {
            settings.navigateToAbout()
        } catch (e: Exception) {
            settings.navigateToAboutEn()
        }
        aboutPage.authors()
        aboutPage.translators()
        aboutPage.license()
    }
}