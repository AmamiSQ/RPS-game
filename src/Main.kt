fun main()
{
    println("Welcome to Rock, Paper, Scissors!")
    var playerScore = 0
    var botScore = 0

    while (playerScore < 3 && botScore < 3)
    {
        val player = playerChoice()
        val bot = botChoice()

        println("You chose $player")
        println("The bot chose $bot")

        if (player == bot)
        {
            println("It's a tie!")
        }
        else if (player == "rock" && bot == "scissors" || player == "scissors" && bot == "paper" || player == "paper" && bot == "rock")
        {
            println("You win!")
            playerScore++
        }
        else
        {
            println("You lose!")
            botScore++
        }

        println("The score is now: You: $playerScore Bot: $botScore")
    }

    if (playerScore > botScore)
    {
        println("You win the game!")
    }
    else
    {
        println("You lose the game!")
    }

    println("Goodbye!")
}

fun botChoice(): String
{
    val choices = arrayOf("rock", "paper", "scissors")
    return choices.random()
}

fun playerChoice(): String?
{
    val choices = arrayOf("rock", "paper", "scissors")
    println("Enter your choice: ")
    var choice = readlnOrNull()
    choice = choice?.lowercase()

    if (choice !in choices)
    {
        println("Invalid choice. Please enter rock, paper, or scissors.")
        return playerChoice()
    }

    return choice

}
