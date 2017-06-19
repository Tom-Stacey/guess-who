package services

import constants.colours._
import models.GameBoard._
import org.scalatest.{Matchers, WordSpec}

class GameServiceSpec extends WordSpec with Matchers {

  "GetWomen" should {
    "get all the women" in {
      GameService.getWomen shouldBe Seq(joyceFairWeather, judyCondomore, adhamaMwangi)
    }
  }

  "GetMen" should {
    "get all the men" in {
      GameService.getMen shouldBe Seq(akarshChandran, reginaldSmythe, jamesKatsumata)
    }
  }

  "FilterByEyeColour" should {
    "get all the people with blue eyes" in {
      GameService.filterByEyeColour(Blue) shouldBe Seq(joyceFairWeather, jamesKatsumata)
    }
    "get all the people with brown eyes" in {
      GameService.filterByEyeColour(Brown) shouldBe Seq(akarshChandran, judyCondomore, adhamaMwangi)
    }
    "return an empty sequence when there are no matches" in {
      GameService.filterByEyeColour(Purple) shouldBe Seq.empty
    }
  }

  "FilterByHat" should {
    "return all hat wearers" in {
      GameService.filterByHat(true) shouldBe Seq(joyceFairWeather, reginaldSmythe, adhamaMwangi, jamesKatsumata)
    }
    "return all non-hat wearers" in {
      GameService.filterByHat(false) shouldBe Seq(akarshChandran, judyCondomore)
    }
  }

  "FilterByHasHair" should {
    "return all people with hair" in {
      GameService.filterByHasHair(true) shouldBe Seq(akarshChandran, joyceFairWeather, reginaldSmythe, judyCondomore, adhamaMwangi)
    }
    "return all people that are bald" in {
      GameService.filterByHasHair(false) shouldBe Seq(jamesKatsumata)
    }
  }

  "FilterByHairColour" should {
    "return all people with red hair" in {
      GameService.filterByHairColour(Red) shouldBe Seq(joyceFairWeather)
    }
    "return all people with Blue hair" in {
      GameService.filterByHairColour(Blue) shouldBe Seq(adhamaMwangi)
    }
  }

  "FilterByAccessory" should {
    "return all people wearing necklaces" in {
      GameService.filterByAccessory("necklace") shouldBe Seq(joyceFairWeather, reginaldSmythe, adhamaMwangi)
    }

    "return all people wearing silver necklaces" in {
      GameService.filterByAccessory("necklace", Some(Silver)) shouldBe Seq(joyceFairWeather, adhamaMwangi)
    }

    "return all people wearing glasses" in {
      GameService.filterByAccessory("glasses") shouldBe Seq(akarshChandran, reginaldSmythe)
    }

    "return all people wearing red glasses" in {
      GameService.filterByAccessory("glasses", Some(Red)) shouldBe Seq(akarshChandran)
    }

    "return an empty sequence for people wearing gold glasses" in {
      GameService.filterByAccessory("glasses", Some(Gold)) shouldBe Seq.empty
    }
  }

  "FilterByFacialHairType" should {
    "return everyone with a moustache" in {
      GameService.filterByFacialHairType("moustache") shouldBe Seq(akarshChandran, jamesKatsumata)
    }
    "return everyone with a Moustache" in {
      GameService.filterByFacialHairType("Moustache") shouldBe Seq(akarshChandran, jamesKatsumata)
    }
    "return everyone with a goatee" in {
      GameService.filterByFacialHairType("goatee") shouldBe Seq(reginaldSmythe)
    }
    "return no one with stubble" in {
      GameService.filterByFacialHairType("stubble") shouldBe Seq.empty
    }
    "return no one with a beard" in {
      GameService.filterByFacialHairType("beard") shouldBe Seq.empty
    }
    "return no one with a rainbow" in {
      GameService.filterByFacialHairType("rainbow") shouldBe Seq.empty
    }
  }

  "FilterByFacialHairType" should {
    "return everyone with brown facial hair" in {
      GameService.filterByFacialHairColour(Brown) shouldBe Seq(akarshChandran)
    }
    "return everyone with blonde facial hair" in {
      GameService.filterByFacialHairColour(Blonde) shouldBe Seq(jamesKatsumata)
    }
    "return no one with Red facial hair" in {
      GameService.filterByFacialHairColour(Red) shouldBe Seq.empty
    }
  }

}
