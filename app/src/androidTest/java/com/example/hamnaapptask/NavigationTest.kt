package com.example.hamnaapptask

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    // Start from Third activity (to test login_button)
    @get:Rule
    var activityRule1 = ActivityScenarioRule(Third::class.java)

    @Test
    fun testLoginButtonNavigatesToFourth() {
        // Click login_button
        onView(withId(R.id.login_button)).perform(click())

        // Check that a view from activity_fourth.xml is displayed
        onView(withId(R.id.signup_text)).check(matches(isDisplayed()))
    }

    // Start from Fourth activity (to test signup_text)
    @get:Rule
    var activityRule2 = ActivityScenarioRule(Fourth::class.java)

    @Test
    fun testSignupTextNavigatesToSecond() {
        // Click signup_text
        onView(withId(R.id.signup_text)).perform(click())

        // Check that a view from activity_second.xml is displayed
        onView(withId(R.id.create_account_button)).check(matches(isDisplayed()))
    }
}
