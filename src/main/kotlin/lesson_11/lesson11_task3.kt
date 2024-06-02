package lesson_11

fun main() {
    val room = Room("room_cover.jpg", "Для важных переговоров")

    room.addMember("ilya", "my_avatar.jpg", "микрофон выключен")
    println(room.listMember)

    room.addMember("reviewer", "reviewer_avatar.jpg", "микрофон выключен")
    println(room.listMember)

    room.updateStatus("ilya", "разговаривает")
    println(room.listMember)
}