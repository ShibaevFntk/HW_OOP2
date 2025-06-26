import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    void TstNextStation() {
        Radio radio = new Radio();

        radio.SetStationBtn(9);
        int expected = 0;

        radio.ClickNextStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstPrevStation() {
        Radio radio = new Radio();

        radio.SetStationBtn(0);
        int expected = 9;

        radio.ClickPrevStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstSetStationMore() {
        Radio radio = new Radio();

        radio.SetStationBtn(0);
        int expected = 0;

        radio.SetStationBtn(10);
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstSetStationLess() {
        Radio radio = new Radio();

        radio.SetStationBtn(1);
        int expected = 1;

        radio.SetStationBtn(-1);
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstNextStationIn() {
        Radio radio = new Radio();

        radio.SetStationBtn(5);
        int expected = 6;

        radio.ClickNextStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstPrevStationIn() {
        Radio radio = new Radio();

        radio.SetStationBtn(5);
        int expected = 4;

        radio.ClickPrevStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstUpVolume() {
        Radio radio = new Radio();

        radio.SetVolume(100);
        int expected = 100;

        radio.ClickUpVolume();
        long actual = radio.GetCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstDownVolume() {
        Radio radio = new Radio();

        radio.SetVolume(0);
        int expected = 0;

        radio.ClickDownVolume();
        long actual = radio.GetCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstMaxStation15() {
        Radio radio = new Radio(15);

        radio.SetStationBtn(13);
        int expected = 14;

        radio.ClickNextStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TstMaxStationOne() {
        Radio radio = new Radio(1);

        radio.SetStationBtn(0);
        int expected = 0;

        radio.ClickNextStationBtn();
        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void TstMaxStationZero() {
        Radio radio = new Radio(-1);

        radio.SetStationBtn(0);
        int expected = 0;

        long actual = radio.GetCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
