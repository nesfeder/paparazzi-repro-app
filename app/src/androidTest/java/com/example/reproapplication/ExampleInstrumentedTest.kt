package com.example.reproapplication

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

class ExampleInstrumentedTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun testGreeting() {
    composeTestRule.setContent {
      Greeting(name = "Hello!")
    }
  }
}