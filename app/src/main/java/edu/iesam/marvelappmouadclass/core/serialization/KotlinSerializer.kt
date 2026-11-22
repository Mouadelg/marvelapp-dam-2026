package edu.iesam.marvelappmouadclass.core.serialization
import kotlinx.serialization.*
import kotlinx.serialization.json.Json

class KotlinSerializer<T>(
    private val kSerializer: KSerializer<T>,
    private val json: Json = Json {
        ignoreUnknownKeys = true
    }
) : JsonSerializer<T> {
    override fun toJson(obj: T): String {
        return json.encodeToString(kSerializer,obj)
    }

    override fun fromJson(json: String): T {
        return this.json.decodeFromString(kSerializer,json)
    }

    companion object{
        inline fun <reified T> create(): KotlinSerializer<T> =
            KotlinSerializer(serializer<T>())
    }
}