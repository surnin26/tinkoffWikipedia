package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.withChild
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import org.hamcrest.core.AnyOf.anyOf
import org.wikipedia.R

class SettingsFeed {

    private val feedContentType = withId(R.id.feed_content_type_checkbox)
    private val featuredArticle =
        hasSibling(withChild(withText(R.string.view_featured_article_card_title)))
    private val topRead = hasSibling(withChild(withText(R.string.view_top_read_card_title)))
    private val featuredImage =
        hasSibling(withChild(withText(R.string.view_featured_image_card_title)))
    private val causeRead =
        allOf(hasSibling(withChild(withText(R.string.view_because_you_read_card_title))))
    private val cardNews = hasSibling(withChild(withText(R.string.view_card_news_title)))
    private val onThisDay = hasSibling(withChild(withText(R.string.on_this_day_card_title)))
    private val random = hasSibling(withChild(withText(R.string.view_random_card_title)))
    private val cardTitle = hasSibling(withChild(withText(R.string.view_main_page_card_title)))


    fun verifyFeedOptions() {
        try {
            onView(
                allOf(
                    featuredArticle, feedContentType
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        topRead, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        featuredImage, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(causeRead, feedContentType)
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        cardNews, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        onThisDay, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        random, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        cardTitle, feedContentType
                    )
                )
            ).check(matches(isChecked()))
        } catch (e: Exception) {
            onView(
                allOf(
                    featuredArticle, feedContentType
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        topRead, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        featuredImage, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(causeRead, feedContentType)
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        cardNews, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        onThisDay, feedContentType
                    )
                )
            ).check(matches(isChecked()))

            Settings().scroll()

            onView(
                anyOf(
                    allOf(
                        random, feedContentType
                    )
                )
            ).check(matches(isChecked()))
            onView(
                anyOf(
                    allOf(
                        cardTitle, feedContentType
                    )
                )
            ).check(matches(isChecked()))
        }
    }
}