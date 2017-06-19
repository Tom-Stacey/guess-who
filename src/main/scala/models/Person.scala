package models

import constants.colours.Colour
import constants.facialhair.FacialHair

case class Person (
                  name: String,
                  isFemale: Boolean,
                  eyeColour: Colour,
                  hairColour: Option[Colour],
                  facialHair: Option[FacialHair],
                  wearingHat: Boolean,
                  accessories: Seq[Accessory]
                    )
