package ma.nemo.springapi.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HomeTest {
    @InjectMocks
    private Home home;

    @Test
    void homeShouldReturnTheAppropriateString() {
        var expected = "Welcome.\nthis is the homes page";

        var result = home.home();

        assertEquals(expected, result);
    }
}