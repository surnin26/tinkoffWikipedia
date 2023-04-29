package org.wikipedia.tinkoff.b

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.AboutPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings

@RunWith(AndroidJUnit4::class)
class Blocks {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkBlocksWithAuthorsTranslatorsLicenses() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().scroll()
//        Thread.sleep(500) (на подключенном пикселе не проходит, если не поставить такой слип
//        (знаю, что нельзя, поэтому коммент), на всех остальных проходит)
        Settings().clickToAbout()
        AboutPage().authors()
        AboutPage().translators()
        AboutPage().license()
    }
}