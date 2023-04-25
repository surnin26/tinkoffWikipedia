package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers
import org.hamcrest.core.AnyOf.anyOf
import org.wikipedia.R

class SettingsFeed {

    fun verifyFeedOptions() {
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Избранная статья"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Featured article"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Самое читаемое"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Top read"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Изображение дня"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Picture of the day"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "На основе прочитанного"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Because you read"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "В новостях"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "In the news"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "В этот день"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "On this day"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
    }

    fun verifyAdditionalFeedOptions() {
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Рандомизатор"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Randomizer"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        Espresso.onView(
            anyOf(
                Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Сегодня в Википедии"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                ), Matchers.allOf(
                    ViewMatchers.hasSibling(
                        ViewMatchers.withChild(
                            ViewMatchers.withText(
                                "Today on Wikipedia"
                            )
                        )
                    ), ViewMatchers.withId(R.id.feed_content_type_checkbox)
                )
            )
        ).check(ViewAssertions.matches(ViewMatchers.isChecked()))
    }
}