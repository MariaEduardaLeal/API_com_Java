# Bootcamp Santander 2023

## Diagrama de Classes

```mermaid
classDiagram
    class Book {
        - title: String
        - author: String
        - translator: String
        - publicationYear: Integer
        - genre: String
        - language: String
        - publisher: String
        - numberOfPages: Integer
        - summary: String
        - mainCharacters: Character[]
        - reviews: Review[]
    }
    class Character {
        - name: String
        - description: String
    }
    class Review {
        - reviewer: String
        - rating: Integer
        - comment: String
    }

    Book "1" *-- "1..N" Character
    Book "1" *-- "1..N" Review
```
