package grails4app

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BaseTaakSpec extends Specification implements DomainUnitTest<BaseTaak> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
