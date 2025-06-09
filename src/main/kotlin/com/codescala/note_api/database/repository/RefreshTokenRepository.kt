package com.codescala.note_api.database.repository

import com.codescala.note_api.database.model.RefreshToken
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RefreshTokenRepository: MongoRepository<RefreshToken ,ObjectId> {
    fun findByUserIdAndHashedToken(userId: ObjectId, hashedToken: String) : RefreshToken?
    fun deleteByUserIdAndHashedToken(userId: ObjectId, hashedToken: String)
}