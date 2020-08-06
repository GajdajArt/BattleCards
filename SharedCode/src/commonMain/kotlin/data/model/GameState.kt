package data.model

data class GameState(
    val phase: GamePhase = GamePhase.PREPARE_BATTLE,
    val players: List<Player> = listOf(),
    val movingPlayer: Player,
    val roundWinner: Player,
    val yourActions: List<Card> = listOf(),
    val opponentAction: List<Card> = listOf(),
    val yourSquads: List<Card> = listOf(),
    val opponentSquads: List<Card> = listOf()
)