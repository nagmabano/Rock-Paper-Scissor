package com.learning.rockpaperscissor

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissor? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    computerChoice = when (randomNumber) {
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> {
            "Scissor"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie") {
        println("It's a tie")
    } else {
        println("The winner is $winner")
    }

}