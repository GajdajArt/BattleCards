package domain.model

data class Card(
    val id: String,
    val cardType: CardType,
    val actionType: ActionType? = null,
    val squadType: SquadType? = null,
    val attack: Int? = null,
    val defence: Int? = null
)