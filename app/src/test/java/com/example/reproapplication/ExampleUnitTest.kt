package com.example.reproapplication

import app.cash.paparazzi.Paparazzi
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class ExampleUnitTest {

  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun testGreeting() {
    paparazzi.snapshot {
      Greeting(name = "Hello!")
    }
  }
}