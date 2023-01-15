package com.timmitof.countriesapp.other

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {

        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESSFUL, data, null)
        }

        fun <T> error(msg: String?): Resource<T> {
            return Resource(Status.ERROR, null, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }
}

enum class Status {
    SUCCESSFUL,
    ERROR,
    LOADING
}