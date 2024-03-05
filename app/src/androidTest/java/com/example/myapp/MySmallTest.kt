package com.example.myapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class MySmallTest {
    @Test
    fun test() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapp", appContext.packageName)
    }
}
