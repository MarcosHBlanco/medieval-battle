# 🛡️ Medieval Battle (Java OOP Dice Combat)

A Java console game where a hero battles a random monster using dice-based combat rules.  
This project focuses on **Object-Oriented Programming (OOP)** fundamentals such as abstraction, inheritance, polymorphism, and encapsulation.

## ✨ Features
- Choose a hero class (Guerreiro, Bárbaro, Paladino)
- Fight a random monster (Orc, Kobold, Morto Vivo)
- Turn-based combat with initiative rolls
- Dice-based attack/defense/damage system

## 🧠 OOP Concepts Demonstrated
- **Abstraction:** `Personagem` is an abstract class
- **Inheritance:** heroes and monsters extend the base character model
- **Polymorphism:** each character overrides `calcularFatorDeDano()`
- **Encapsulation:** stats are private and accessed via getters

## 🛠️ Tech Stack
- Java 17
- Maven

## 🚀 Run Locally
### Prerequisites
- Java 17+
- Maven

### Build and run
```bash
mvn clean package
java -cp target/medieval-battle-1.0-SNAPSHOT.jar org.example.Main
```

> If your jar name differs, check the `target/` folder after building.

## 📸 Screenshots / Demo
This is a console application. You can take screenshots or a short screen recording while running locally—no deployment required.

Recommended captures:
- Class selection menu
- A few combat rounds
- Final win/lose message

## ✅ Improvements Made
- Fixed battle loop so the fight ends when either character reaches 0 HP
- Fixed monster selection so all monsters can be chosen
- Improved dice rolling utility to reuse a single `Random` instance
- Added clearer end-of-game messaging
