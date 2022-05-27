# Herança
```plantuml
Pessoa <|-- Advogado
Pessoa <|-- Medico
```

# Composição
```plantuml
class Pessoa {}
class Advogado {}
class Medico {}

Pessoa <-- Advogado
Pessoa <-- Medico
```
