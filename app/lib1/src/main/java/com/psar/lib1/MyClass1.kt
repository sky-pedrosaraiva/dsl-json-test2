package com.psar.lib1

import com.dslplatform.json.CompiledJson
import com.dslplatform.json.JsonConverter
import com.dslplatform.json.JsonReader
import com.dslplatform.json.JsonWriter
import java.time.Instant

@JsonConverter(target = Instant::class)
object InstantConverter {
    fun read(reader: JsonReader<*>): Instant? {
        return if (reader.wasNull()) null else Instant.parse(reader.readSimpleString())
    }

    fun write(writer: JsonWriter, value: Instant?) {
        if (value == null) {
            writer.writeNull()
        } else {
            writer.writeString(value.toString())
        }
    }
}

@CompiledJson
data class MyClass1(
    val name: String,
    val time: Instant
)