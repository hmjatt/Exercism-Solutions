
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeeksCount = birdsPerDay;
        return lastWeeksCount;
    }

    public int getToday() {
        int[] lastWeek = getLastWeek();
        int today = lastWeek[6];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
