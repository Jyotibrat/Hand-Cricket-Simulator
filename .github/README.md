# Hand Cricket Game 🏏

A simple Java implementation of the classic Hand Cricket game that children love to play with their friends. This digital version recreates the fun experience with random number generation and interactive gameplay.

## 🎮 About the Game

Hand Cricket is a popular game played by children where players choose numbers and try to score runs while avoiding getting "out" when both players show the same number. This Java version brings that nostalgic experience to your computer!

### Game Rules

1. **Toss Phase**: 
   - Player 1 chooses even or odd
   - Both players enter a number
   - The sum determines who wins the toss (even/odd)

2. **Choice Phase**:
   - Toss winner chooses to bat or bowl first

3. **Batting Phase**:
   - Batsman scores runs based on randomly generated numbers (1-6)
   - Bowler tries to get the batsman out by matching the same number
   - Maximum 6 balls per innings
   - Game ends if batsman gets out or completes 6 balls

4. **Bowling/Chasing Phase**:
   - Second player tries to chase the target set by first player
   - Same rules apply: avoid matching numbers, score more than target

5. **Winning**:
   - Batting first: Set a target for opponent
   - Chasing: Score more runs than the target to win
   - Match result: Win, lose, or draw

## 🚀 Getting Started

### Prerequisites

- [**Java Development Kit (JDK)**](https://www.oracle.com/in/java/technologies/downloads/) 8 or higher
- Any [**Java IDE**](https://www.jetbrains.com/idea/download/) or [**command line interface**](https://devblogs.microsoft.com/commandline/)

### Running the Game

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Jyotibrat/Hand-Cricket-Simulator.git
   cd src
   ```

2. **Compile the Java file**:
   ```bash
   javac HandCricket.java
   ```

3. **Run the game**:
   ```bash
   java -cp src HandCricket
   ```

### How to Play

1. Enter names for Player 1 and Player 2
2. Player 1 chooses even (1) or odd (2) for the toss
3. Both players enter numbers for the toss
4. Winner of toss chooses batting (1) or bowling (2)
5. Follow the prompts to enter numbers during gameplay
6. Enjoy the match!

## 📁 Project Structure

```
Hand-Cricket-Simulator/
├── .github/
│   ├── ISSUE_TEMPLATE/
│   │   ├── bug_report.md
│   │   └── feature_report.md
│   │
│   ├── CODE_OF_CONDUCT.md 
│   └── README.md
│
├── src/
│   └── HandCricket.java
│
└── LICENSE
```

## 🎯 Features

- **Interactive Console Interface**: Easy-to-follow prompts and messages
- **Random Number Generation**: Fair gameplay with random numbers (1-6)
- **Two-Player Support**: Play with a friend locally
- **Complete Cricket Experience**: Toss, batting, bowling, and match results
- **Multiple Game Scenarios**: Different outcomes based on player choices

## 🔧 Technical Details

- **Language**: Java
- **Input**: Scanner for user input
- **Random Generation**: Math.random() for number generation (1-6)
- **Game Logic**: Nested loops and conditional statements
- **Output**: Console-based display

## 🤝 Contributing

Feel free to contribute to this project by:
- Reporting bugs
- Suggesting new features
- Improving code structure
- Adding better user interface
- Writing tests

## 📄 License

This project is open source and available under the [MIT License](https://github.com/Jyotibrat/Hand-Cricket-Simulator/blob/main/LICENSE).

---

**Enjoy playing Hand Cricket! 🏏✨**

*Relive your childhood memories with this digital version of the classic game.*
