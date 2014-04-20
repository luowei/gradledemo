package demo

/**
 * Created by luowei on 2014/4/20.
 */
class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "Hello,Gradle!"
        where:hello = new Hello().sayHello()
    }
}
