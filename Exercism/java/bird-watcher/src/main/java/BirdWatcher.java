class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int count = 0;
        for (int j : birdsPerDay) {
            count = j;
        }
        return count;
    }

    public void incrementTodaysCount() {
        int BirdsToday = birdsPerDay.length - 1;
        birdsPerDay[BirdsToday]++;
    }

    public boolean hasDayWithoutBirds() {
        int count = 0;
        boolean noVisit = false;
        for (int j : birdsPerDay) {
            count = j;
            if (count == 0) {
                noVisit = true;
            }
        }
        return noVisit;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirst = 0;
        for (int j = 0; j < numberOfDays; j++) {
            if (j == birdsPerDay.length) {
                break;
            } else {
                countForFirst += birdsPerDay[j];
            }
        }
        return countForFirst;
    }

    public int getBusyDays() {
        int count = 0;
       for (int j : birdsPerDay){
           if (j >= 5){
               count++;
           }
       }
       return count;
    }
}
