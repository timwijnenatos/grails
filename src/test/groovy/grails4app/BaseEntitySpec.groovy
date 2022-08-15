package grails4app

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BaseEntitySpec extends Specification implements DomainUnitTest<BaseEntity> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
