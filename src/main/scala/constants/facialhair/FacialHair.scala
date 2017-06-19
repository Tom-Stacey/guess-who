package constants.facialhair

import constants.colours.Colour

sealed trait FacialHair {
  val colour: Colour
}
case class Beard(colour: Colour)     extends FacialHair
case class Moustache(colour: Colour) extends FacialHair
case class Goatee(colour: Colour)    extends FacialHair
case class Stubble(colour: Colour)   extends FacialHair
