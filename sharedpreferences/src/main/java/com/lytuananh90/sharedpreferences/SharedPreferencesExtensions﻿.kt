package com.lytuananh90.sharedpreferences

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

fun Application.getPreferences(sharedPreferencesName: String): SharedPreferences {
    return this.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)
}

fun SharedPreferences.insertString(key: String, value: String?) {
    this.edit()?.apply {
        this.putString(key, value).apply()
    }
}

fun SharedPreferences.insertStringSet(key: String, value: Set<String>?) {
    this.edit()?.apply {
        this.putStringSet(key, value).apply()
    }
}

fun SharedPreferences.insertInt(key: String, value: Int) {
    this.edit()?.apply {
        this.putInt(key, value).apply()
    }
}

fun SharedPreferences.insertBoolean(key: String, value: Boolean) {
    this.edit()?.apply {
        this.putBoolean(key, value).apply()
    }
}

fun SharedPreferences.insertFloat(key: String, value: Float) {
    this.edit()?.apply {
        this.putFloat(key, value).apply()
    }
}

fun SharedPreferences.insertLong(key: String, value: Long) {
    this.edit()?.apply {
        this.putLong(key, value).apply()
    }
}

fun SharedPreferences.remove(key: String?) {
    this.edit()?.apply {
        this.remove(key).apply()
    }
}

fun SharedPreferences.clear() {
    this.edit()?.apply {
        this.clear().apply()
    }
}