package introjunit;

//import org.junit.Test;

//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;

public class GentlemanTest {

    //@Test
    public void testSayHello() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String welcome = gentleman.sayHello("Péter");

        //Then
       // assertThat(welcome, equalTo("Hello Péter"));
    }

    //@Test
    public void testSayHelloNull() {
        //Given
        Gentleman gentleman = new Gentleman();
        String name = null;

        //When
        String welcome = gentleman.sayHello(name);

        //Then
        //assertThat(welcome, equalTo("Hello Anonimus"));
    }
}
