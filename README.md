🎮 Tic Tac Toe Game in Java (Console-Based) 🎮
Welcome to the classic Tic Tac Toe game, now on your console! Developed in Java, this simple yet fun game lets two players compete by entering their moves via the console. Perfect for beginners learning Java and game logic.

✨ Features
Console-Based Interface: Enjoy the game directly from your terminal.

Two-Player Mode: Take turns with a friend and see who comes out on top.

Smart Game Logic: Automatic win, loss, and draw detection.

Input Validation: Ensures fair play by checking valid moves.

🚀 Getting Started
Prerequisites
Make sure you have:

Java Development Kit (JDK) installed

A Java IDE or text editor (like IntelliJ IDEA, Eclipse, VS Code)

Installation
Clone the repository:

sh
git clone https://github.com/Harsha-Bhangale/tic-tac-toe-java.git
cd tic-tac-toe-java
Open the project in your preferred Java IDE or text editor.

Running the Game
Compile the Java program:

sh
javac game/com/TicGame.java
Run the game:

sh
java game/com/TicGame
🎲 How to Play
Starting the Game: Player X goes first.

Making a Move: Enter a slot number (1-9) to place your mark.

Winning the Game: The game checks for a winner or a draw after each move.

Continuing the Game: Play until there is a winner or the board is full (draw).

📂 Code Overview
Here's a glimpse of the main code structure:

java
package game.com;
import java.util.*;

public class TicGame {
    static String[] board;
    static String turn;

    static String checkWinner() {
        // ... (code from your TicGame class)
    }

    static void printBoard() {
        // ... (code from your TicGame class)
    }

    public static void main(String[] args) {
        // ... (code from your TicGame class)
    }
}
📜 License
This project is licensed under the MIT License - see the LICENSE file for details.
