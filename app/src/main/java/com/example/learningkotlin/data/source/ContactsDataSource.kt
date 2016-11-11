package com.example.learningkotlin.data.source

import com.example.learningkotlin.data.models.Contact

/**
 * Created by mateus on 10/11/16.
 */
interface ContactsDataSource {

    fun insertContact(contact: String, age: Int, sex: String)
    fun getContacts(): List<Contact>
}