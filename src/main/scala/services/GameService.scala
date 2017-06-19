package services

import constants.colours.Colour
import constants.facialhair._
import models.{Person, GameBoard}

object GameService {

  def getWomen: Seq[Person] = {
    GameBoard.people.filter(_.isFemale)
  }

  def getMen: Seq[Person] = {
    GameBoard.people.filterNot(_.isFemale)
  }

  def filterByEyeColour(searchColour: Colour): Seq[Person] = {
    GameBoard.people.filter( person =>
      person.eyeColour == searchColour
    )
  }

  def filterByHat(wearingHat: Boolean): Seq[Person] = {
    GameBoard.people.filter(_.wearingHat == wearingHat)
  }

  def filterByHasHair(hasHair: Boolean): Seq[Person] = {
    GameBoard.people.filter(_.hairColour.isDefined == hasHair)
  }

  def filterByHairColour(searchColour: Colour): Seq[Person] = {
    GameBoard.people.filter(_.hairColour.contains(searchColour))
  }

  def filterByAccessory(accessoryName: String, accessoryColour: Option[Colour] = None): Seq[Person] = {
    GameBoard.people.filter(_.accessories.exists( accessory =>
      accessory.name == accessoryName && accessoryColour.map(_ == accessory.colour).getOrElse(true)
    ))
  }

  def filterByFacialHairType(hairType: String): Seq[Person] = {
    def hairTypeString(facialHair: FacialHair) = facialHair match {
      case _:Moustache => "moustache"
      case _:Beard     => "beard"
      case _:Goatee    => "goatee"
      case _:Stubble   => "stubble"
    }

    GameBoard.people.filter( person =>
      person.facialHair.exists(hairTypeString(_) == hairType.toLowerCase)
    )
  }

  def filterByFacialHairColour(searchColour: Colour): Seq[Person] = {
    GameBoard.people.filter( person =>
      person.facialHair.exists{
        case fHair: FacialHair if fHair.colour == searchColour => true
        case _ => false
      }
    )
  }

}
