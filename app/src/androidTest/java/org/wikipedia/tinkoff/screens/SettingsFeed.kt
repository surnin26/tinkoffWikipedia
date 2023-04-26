package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.withChild
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matchers.allOf
import org.hamcrest.core.AnyOf.anyOf
import org.wikipedia.R

class SettingsFeed {

    private val feedContentType = withId(R.id.feed_content_type_checkbox)

    fun verifyFeedOptions() {
        onView(
            anyOf(
                allOf(
                    hasSibling(withChild(ViewMatchers.withText("Избранная статья"))),
                    feedContentType
                ),
                allOf(
                    hasSibling(withChild(ViewMatchers.withText("Featured article"))),
                    feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Самое читаемое"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Top read"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Изображение дня"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Picture of the day"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "На основе прочитанного"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Because you read"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "В новостях"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "In the news"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "В этот день"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "On this day"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
    }

    fun verifyAdditionalFeedOptions() {
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Рандомизатор"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Randomizer"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
        onView(
            anyOf(
                allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Сегодня в Википедии"
                            )
                        )
                    ), feedContentType
                ), allOf(
                    hasSibling(
                        withChild(
                            ViewMatchers.withText(
                                "Today on Wikipedia"
                            )
                        )
                    ), feedContentType
                )
            )
        ).check(ViewAssertions.matches(isChecked()))
    }
}