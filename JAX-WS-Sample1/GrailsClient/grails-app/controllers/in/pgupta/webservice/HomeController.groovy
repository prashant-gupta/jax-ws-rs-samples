package in.pgupta.webservice

class HomeController {

    def greetingService

    def index() {
        println "======greetingService ======= "+greetingService
        String message = greetingService.greet("world")

        render (message)
    }
}
