import Greeting.greet
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GreetingTest extends AnyWordSpec with Matchers {

  "Greeting" should {
    "back HelloWorld:string" in {
      greet shouldEqual "Hello world !!!"
    }

    "back HelloWorld:notempty" in {
      greet().isBlank shouldEqual false
    }
  }

}
