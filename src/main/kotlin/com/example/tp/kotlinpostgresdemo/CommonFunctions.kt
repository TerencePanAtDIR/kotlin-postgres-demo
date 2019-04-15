package com.example.tp.kotlinpostgresdemo

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor

private fun getEncrypter(): StandardPBEStringEncryptor {
    val encrypter = StandardPBEStringEncryptor()
    encrypter.setProviderName("BC")
    encrypter.setPassword("EncryptedPassword")
    encrypter.setAlgorithm("PBEWITHSHA-256AND256BITAES-CBC-BC")
    return encrypter
}

fun encryptPassword(passwordToEncrypt: String): String {
    return getEncrypter().encrypt(passwordToEncrypt)
}

fun decryptPassword(passwordToDecrypt: String): String {
    return getEncrypter().decrypt(passwordToDecrypt)
}