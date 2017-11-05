package pl.sdacademy.animals.bear

import org.joda.time.DateTime
import pl.sdacademy.clock.Clock
import spock.lang.Specification

class BearSpec extends Specification {

    def "Bear should be alive if has eaten within 10 days"() {
        given:
        Bear bear = testBear
        bear.eat()

        when:
        def result = bear.isAlive()

        then:
        result == true

        where:
        testBear << [new BlackBear(5), new PolarBear(20)]
    }

}
