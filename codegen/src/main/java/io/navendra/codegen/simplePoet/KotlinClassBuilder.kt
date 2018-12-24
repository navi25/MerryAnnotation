package io.navendra.codegen.simplePoet

/**
 * Custom Kotlin Class Builder which returns file content string
 * This is for learning purpose only.
 * Use KotlinPoet for production app
 * KotlinPoet can be found at https://github.com/square/kotlinpoet
 */
class KotlinClassBuilder(private val name: String,
                         private val pack:String,
                         private val greeting:String = "Merry Christmas!!"){

    private val packageString = "package $pack"
    private val classString = "\nclass $name "
    private val startBlockControl = "{"
    private val endBlockControl = "}"


    private val methodBuilderString = "\nfun greeting() : String $startBlockControl \nreturn \"$greeting\" \n$endBlockControl"

    fun getContent() : String{
        val builderString = "$packageString" +
                "\n$classString $startBlockControl" +
                "$methodBuilderString" +
                "$endBlockControl"

        return builderString

    }


}