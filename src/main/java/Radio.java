public class Radio {


    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int currentVolume;

    public Radio(int CountStation){
        if (CountStation>0) {
            this.maxStation =CountStation - 1;
        } else this.maxStation = 9;
    }

    public Radio(){
        this.maxStation =9;
    }


    public void ClickNextStationBtn() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void ClickPrevStationBtn() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public void SetStationBtn(int Station) {
        if ((Station < minStation) || (Station > maxStation)) {
            return;
        } else {
            currentStation = Station;
        }
    }

    public int GetCurrentStation() {
        return currentStation;
    }

    public void SetVolume(int volume) {
        if ((volume < 0) || (volume > 100)) {
            return;
        } else {
            currentVolume = volume;
        }
    }

    public void ClickUpVolume() {
        this.SetVolume(currentVolume + 1);

    }

    public void ClickDownVolume() {
        this.SetVolume(currentVolume - 1);
    }


    public int GetCurrentVolume() {
        return currentVolume;
    }

}
