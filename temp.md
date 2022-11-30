Nouns:
- simulation
- solar-system - Class
- planet - Class
  - planet's mass - Double
  - planet's radius - Double
  - planet's velocity - Array
- sun - Class
  - sun's mass - Double
  - sun's radius - Double
- gravity - Double
- location - Array
- time - Double
- distance - Double

Verbs:
- create
- add planet
- move planet
- get planet
- get distance
- get position
- set position
- get velocity
- set velocity

Structure:
simulation
- solar-system - Class
  - planet - ArrayList
  - sun - sunClass or ArrayList
  - solar-system's name - String
  - movePlanet - Public Method
  - addPlanet - Public Method
  - addSun - Public Method
- planet - Class
    - planet's mass - Double
    - planet's radius - Double
    - planet's velocity - Array
      - X velocity - Double
      - Y velocity - Array
    - planet's name - String
    - get planet - Public Method
    - get velocity - Public Method
    - get distance - Public Method
    - set velocity - Public Method
    - set distance - Public Method
    - move - Public Method
- sun - Class
  - sun's mass - Double
  - sun's radius - Double
  - sun's name - String
- gravity - Double
- location - Array
  - X dimension - Double
  - Y dimension - Double
- time - Double
- distance - Double