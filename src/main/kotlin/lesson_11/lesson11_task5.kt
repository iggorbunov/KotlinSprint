package lesson_11

import java.util.*

class Forum(
    val users: MutableList<MemberForum> = mutableListOf(),
    val messages: MutableList<MessageForum> = mutableListOf(),
) {
    fun createNewUser(userName: String): MemberForum {
        val UUID = UUID.randomUUID().toString()
        val newUser = MemberForum(UUID, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: String) {
        val user = users.find { it.userId == userId }
        if (user != null) {
            println("${user.userName} набирает сообщение")
            messages.add(MessageForum(user.userId, readln()))
        } else println("Такого пользователя нет")
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName}: ${message.message}")
            }
        }
    }
}

data class MemberForum(val userId: String, val userName: String)
data class MessageForum(val authorId: String, val message: String)

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Ilya")
    val user2 = forum.createNewUser("Ivan")

    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)

    forum.printThread()
}