package models

import constants.colours._
import constants.facialhair._

object GameBoard {

  val akarshChandran = Person(
    name = "Akarsh Chandran",
    isFemale = false,
    eyeColour = Brown,
    hairColour = Some(Brown),
    facialHair = Some(Moustache(Brown)),
    wearingHat = false,
    accessories = Seq(
      Accessory(
        name = "watch",
        colour = Red
      ),
      Accessory(
        name = "glasses",
        colour = Red
      )
    )
  )

  val joyceFairWeather = Person(
    name = "Joyce FairWeather",
    isFemale = true,
    eyeColour = Blue,
    hairColour = Some(Red),
    facialHair = None,
    wearingHat = true,
    accessories = Seq(
      Accessory(
        name = "necklace",
        colour = Silver
      ),
      Accessory(
        name = "earrings",
        colour = Silver
      )
    )
  )

  val reginaldSmythe = Person(
    name = "Reginald Smythe",
    isFemale = false,
    eyeColour = Green,
    hairColour = Some(Grey),
    facialHair = Some(Goatee(Black)),
    wearingHat = true,
    accessories = Seq(
      Accessory(
        name = "glasses",
        colour = Black
      ),
      Accessory(
        name = "necklace",
        colour = Gold
      ),
      Accessory(
        name = "headphones",
        colour = White
      )
    )
  )

  val judyCondomore = Person(
    name = "Judy Condomore",
    isFemale = true,
    eyeColour = Brown,
    hairColour = Some(Yellow),
    facialHair = None,
    wearingHat = false,
    accessories = Seq.empty
  )

  val adhamaMwangi = Person(
    name = "Adhama Mwangi",
    isFemale = true,
    eyeColour = Brown,
    hairColour = Some(Blue),
    facialHair = None,
    wearingHat = true,
    accessories = Seq(
      Accessory(
        name = "eyebrow ring",
        colour = Silver
      ),
      Accessory(
        name = "necklace",
        colour = Silver
      )
    )
  )

  val jamesKatsumata = Person(
    name = "James Katsumata",
    isFemale = false,
    eyeColour = Blue,
    hairColour = None,
    facialHair = Some(Moustache(Blonde)),
    wearingHat = true,
    accessories = Seq(
      Accessory(
        name = "monocle",
        colour = Gold
      )
    )
  )

  val people: Seq[Person] = Seq(
    akarshChandran,
    joyceFairWeather,
    reginaldSmythe,
    judyCondomore,
    adhamaMwangi,
    jamesKatsumata
  )

}
