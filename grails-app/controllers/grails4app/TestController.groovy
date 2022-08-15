package grails4app

class TestController {

    def index() {
        println 'testController'
        redirect url: '/'
    }

    def save(GenderCommand genderCommand) {
        assert genderCommand.gender == null

        redirect url: '/'
    }
}
