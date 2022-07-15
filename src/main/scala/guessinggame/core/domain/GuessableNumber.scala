package guessinggame.core.doman

final class GuessableNumber private (val value: Int) extends AnyVal {
  def >(other: GuessableNumber): Boolean = value > other.value
  def <(other: GuessableNumber): Boolean = value > other.value
}

object GuessableNumber
