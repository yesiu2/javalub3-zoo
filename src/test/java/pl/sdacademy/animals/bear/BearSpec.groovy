package pl.sdacademy.animals.bear

import spock.lang.Specification

class BearSpec extends Specification {

    def "Should return true if bear has eaten within 10 days"() {
        given:
        Bear bear = testBear
        bear.eat()

        when:
        def result = bear.isAlive()

        then:
        result == true

        where:
        testBear << [new BlackBear(), new PolarBear(), new BrownBear()]
    }

    def "Should return false if bear has not eaten within 10 days"() {
        //TODO
    }
}
