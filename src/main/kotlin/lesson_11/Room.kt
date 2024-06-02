package lesson_11

data class Member(
    val nickname: String,
    val avatar: String,
    var status: String,
)

class Room(
    val roomCover: String,
    val roomName: String,
    var listMember: MutableList<Member> = mutableListOf(),
) {
    fun addMember(nicknameInput: String, avatarInput: String, statusInput: String) {
        listMember.add(Member(nicknameInput, avatarInput, statusInput))
        println("Пользователь $nicknameInput добавлен в команату $roomName")
    }

    fun updateStatus(nicknameInput: String, statusInput: String) {
        (listMember.find { it.nickname == nicknameInput })?.let{
            it.status = statusInput
        }
        println("Статус пользователя $nicknameInput изминен на $statusInput")
    }
}