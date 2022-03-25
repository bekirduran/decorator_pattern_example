# Decorator Pattern Example (Structural Pattern)

 This repository contains a simple application prepared for understanding decorator patterning.
 There are two diffenret scenario. CarPacket and FlightTicket.

## Car Packet Application:
<img src= /src/main/screenshots/ss3.png width="731" height="245" >
#### -> Car (abstraction class)
#### -> CarDecorator (abstraction class) -----> extend from Car (has a relation with Car class)
#### -> SpecialColor (concrete class) -----> extend from CarDecorator
#### -> ExtraArmor (concrete class) -----> extend from CarDecorator
#### -> ExtraBattery (concrete class) -----> extend from CarDecorator
#### -> AIHelper (concrete class) -----> extend from CarDecorator
#### -> SportCar (concrete class) -----> extend from Car
#### -> ClassicCar (concrete class) -----> extend from Car

## The Main Output::
<img src= /src/main/screenshots/ss1.png width="422" height="423" >


## FlightTicket Application:
<img src= /src/main/screenshots/ss4.png width="651" height="233" >
#### -> FlightTicket (abstraction class)
#### -> FlightDecorator (abstraction class) -----> extend from FlightTicket (has a relation with FlightTicket class)

#### -> Meal (concrete class) -----> extend from FlightDecorator
#### -> ExtraLugWeight (concrete class) -----> extend from FlightDecorator

#### -> BusinessTicket (concrete class) -----> extend from FlightTicket
#### -> EconomyTicket (concrete class) -----> extend from FlightTicket

## The Main Output::
<img src= /src/main/screenshots/ss2.png width="391" height="291" >
