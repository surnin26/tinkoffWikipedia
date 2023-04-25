package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers
import org.wikipedia.R

class SettingsFeed {

    fun verifyFeedOptions() {
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "Избранная статья"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "Самое читаемое"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "Изображение дня"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "На основе прочитанного"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "В новостях"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "В этот день"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
    }

    fun verifyAdditionalFeedOptions() {
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "Рандомизатор"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.hasSibling(
                    ViewMatchers.withChild(
                        ViewMatchers.withText(
                            "Сегодня в Википедии"
                        )
                    )
                ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
    }
}