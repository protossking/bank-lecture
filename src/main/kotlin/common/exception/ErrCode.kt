package org.example.common.exception

interface CodeInterface {
    val code: Int
    var message: String
}


enum class ErrCode(
    override val code: Int,
    override var message: String
): CodeInterface {

    AUTH_CONFIG_NOT_FOUND(-100, "auth config not found."),

    FAILED_TO_CALL_CLIENT(-101, "Failed to call client."),

    CALL_RESULT_BODY_NULL(-102, "Failed to call client."),

    PROVIDER_NOT_FOUND(-103, "Provider not found."),

    TOKEN_IS_INVALID(-104, "Token is invalid."),

    TOKEN_IS_EXPIRED(-105, "Token is expired."),


}