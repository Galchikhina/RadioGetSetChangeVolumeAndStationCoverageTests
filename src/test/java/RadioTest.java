import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationChangesFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);  // устанавливаем текущей последнюю станцию 9

        radio.next();  // тестируемое действие

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMoreThan9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);  // устанавливаем текущей станцию больше чем 9

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);  // устанавливаем текущей станцию больше чем 9

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationIsLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);  // устанавливаем текущей последнюю станцию 9

        radio.next();  // тестируемое действие

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationChangesFromOTo9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0); //устанавливаем текущей последнюю станцию 0
        radio.prev(); //используем метод предыдущ
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationChangesToPrevious() {
        Radio radio = new Radio();
        radio.setCurrentStation(7); //устанавливаем текущей  станцию 7
        radio.prev(); //используем метод предыдущ
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeStaysTheSame() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(10); //устанавливаем текущую радиостанцию равной 10
        radio.increaseVolume();  //используем метод уведичения звука
        int expected = 10;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasesFrom9To10() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(9); //устанавливаем текущую радиостанцию равной 10
        radio.increaseVolume();  //используем метод уведичения звука
        int expected = 10;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDecreasesFrom1To2() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(1); //устанавливаем текущую радиостанцию равной 1
        radio.decreaseVolume();
        ;  //используем метод уменьшения звука
        int expected = 0;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeStaysTheSameFrom0To0() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(0); //устанавливаем текущую радиостанцию равной 0
        radio.decreaseVolume();
        ;  //используем метод уменьшения звука
        int expected = 0;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(-1); //устанавливаем текущую радиостанцию равной 0

        int expected = 0;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMoreThan10() {
        Radio radio = new Radio();
        radio.setCurrentVolumeForth(11); //устанавливаем текущую радиостанцию равной 0

        int expected = 0;
        int actual = radio.getCurrentVolumeForth();
        Assertions.assertEquals(expected, actual);
    }
}
