public class Radio {
    private int currentStation; //создали поле текущей радиостанции и научили её иметь номер
    private int currentVolumeForth;  // создали поле громкости звука и научили её иметь уровень

    public void next() {  // метод переключения следующей радиостанции
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;

        }
    }

    public void prev() { // метод переключения предыдущей радиостанции
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() { //метод увеличения звука на 1
        if (currentVolumeForth < 10) {
            currentVolumeForth++;
        } else {
            currentVolumeForth = 10;
        }

        }
        public void decreaseVolume() { //метод уменьшения звука на 1
            if (currentVolumeForth > 0) {
                currentVolumeForth = currentVolumeForth - 1;
            } else {
                currentVolumeForth = 0;
            }
        }

        public int getCurrentStation() { //метод геттер получения текущего номера станции
            return currentStation;
        }

        public void setCurrentStation(int currentStation){  //метод сеттер для установки радиостанции
            if (currentStation < 0) {
                return;
            }
            if (currentStation > 9) {
                return;
            }

            this.currentStation = currentStation;
        }

        public int getCurrentVolumeForth() { //метод геттер получения текущего уолвня звука
            return currentVolumeForth;
        }

        public void setCurrentVolumeForth (int currentVolumeForth) { //метод сеттер для установки уровня звука
            if (currentVolumeForth < 0) {
                return;
            }
            if (currentVolumeForth > 10) {
                return;
            }
            this.currentVolumeForth = currentVolumeForth;
        }
    }



