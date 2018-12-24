package io.navendra.codegen.simplePoet

/**
 * Custom Kotlin Class Builder which returns file content string
 * This is for learning purpose only.
 * Use KotlinPoet for production app
 * KotlinPoet can be found at https://github.com/square/kotlinpoet
 */
class KotlinClassBuilder(className: String,
                         packageName:String,
                         greeting:String = "Merry Christmas!!"){

    private val contentTemplate = """
        package $packageName

        class $className {
             fun greeting() = "$greeting"
        }

    """.trimIndent()

    fun getContent() : String{

        return contentTemplate

    }


}