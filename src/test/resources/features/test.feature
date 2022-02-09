Feature: pasos para escribir manco en google y seleccionar primera opcion

@TestManco
Scenario: mandaManco
  Given Open "htttp://www.google.com" webpage
  And type in searchbar "Manco"
  And click search button
  And click first option
