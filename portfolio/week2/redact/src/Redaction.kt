// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputDoc: String, info: String, replacement: Char = 'X'): String{
    val infoLength = info.length
    val replacementStr = replacement.toString()
    val replacementString = replacementStr.repeat(infoLength)

    val redactedDoc = inputDoc.replace(info, replacementString)

    return redactedDoc
}