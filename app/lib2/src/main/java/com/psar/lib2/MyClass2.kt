package com.psar.lib2

import com.dslplatform.json.CompiledJson
import java.time.Instant

@CompiledJson
data class MyClass2(
    val name: String,
    val time: Instant
)