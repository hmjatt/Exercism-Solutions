
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int today = 0;
        // int lastWeek[] = getLastWeek();
        if( birdsPerDay.length == 0) {
            today = 0;
        } else {
            today = birdsPerDay[6];
        }
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean daysWithoutBirds = false;
        for(int days:birdsPerDay) {
            if(days == 0) {
                daysWithoutBirds = true;
                break;
            }
        }
        return daysWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = 7;
            for (int i = 0; i < numberOfDays; i++) {
                count = count + birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                count = count + birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
       int busyDays = 0;
       for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                busyDays++;
            }
       }
       return busyDays;
    }

}
