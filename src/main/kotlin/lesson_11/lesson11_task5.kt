package lesson_11

class Forum(
    val users: MutableList<MemberForum> = mutableListOf(),
    val messages: MutableList<MessageForum> = mutableListOf(),
    var userId: Int = 1
) {
    fun createNewUser(userName: String): MemberForum {
        val newUser = MemberForum(userId.toString(), userName)
        userId++
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: String, userMessage: String) {
        val user = users.find { it.userId == userId }
        if (user != null) {
            messages.add(MessageForum(user.userId, userMessage))
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
    var message: String

    println("${user1.userName} набирает сообщение")
    message = readln()
    forum.createNewMessage(user1.userId, message)
    println("${user2.userName} набирает сообщение")
    message = readln()
    forum.createNewMessage(user2.userId, message)
    println("${user1.userName} набирает сообщение")
    message = readln()
    forum.createNewMessage(user1.userId, message)
    println("${user2.userName} набирает сообщение")
    message = readln()
    forum.createNewMessage(user2.userId, message)

    forum.printThread()
}