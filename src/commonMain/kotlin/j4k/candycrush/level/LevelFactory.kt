package j4k.candycrush.level

import j4k.candycrush.model.*
import j4k.candycrush.model.Level.TileObjective

class LevelFactory {

    fun createLevel(): Level {

        val reserveData = """
            |[E,C,B,A,D]
            |[D,A,E,C,B]
            """.trimMargin()

        val levelData = """
            |[D,B,A,B,D]
            |[B,E,C,A,B]
            |[B,E,C,C,B]
            |[C,C,E,C,D]
            |[B,B,C,A,D]
            |[A,C,B,E,E]
            |[D,E,E,B,A]
            |[E,D,A,E,C]
            |[E,A,D,C,B]
            """.trimMargin()
        if ((0..1).random() == 1) {
            return Level(
                levelData, reserveData, maxMoves = (24..34).random(),
                tileObjectives = listOf(
                    TileObjective(Tile.A, (15..30).random()),
                    TileObjective(Tile.C, (15..30).random())
                )
            )
        }else{
            return Level(
                levelData, reserveData, maxMoves = (24..34).random(),
                tileObjectives = listOf(
                    TileObjective(Tile.B, (15..30).random()),
                    TileObjective(Tile.D, (15..30).random())
                )
            )
        }
    }
}
