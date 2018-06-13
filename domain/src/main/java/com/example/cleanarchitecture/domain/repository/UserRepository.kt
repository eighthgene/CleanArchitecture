package com.example.cleanarchitecture.domain.repository

import com.example.cleanarchitecture.domain.model.User
import io.reactivex.Completable
import io.reactivex.Single

interface UserRepository : Repository {
    fun getUser(id: String, fromServer: Boolean): Single<User>

    fun saveUser(user: User)
}